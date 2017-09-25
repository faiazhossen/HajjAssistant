package com.musta.faiaz.hajjassistant.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.musta.faiaz.hajjassistant.R;
import com.musta.faiaz.hajjassistant.model.DataModel;
import com.musta.faiaz.hajjassistant.model.Extra;
import com.musta.faiaz.hajjassistant.model.January;
import com.musta.faiaz.hajjassistant.model.Months;
import com.musta.faiaz.hajjassistant.model.PrayerTime;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class PrayerTimeActivity extends AppCompatActivity {
    public final String TAG = "MESSAGE_FROM_DATABASE";
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference("name");
    DatabaseReference monthRef = database.getReference("months");
    @BindView(R.id.tv_text)
    EditText text;
    @BindView(R.id.bt_submit)
    Button button;

    private ArrayList<PrayerTime> prayerTimeList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prayer_time);
        ButterKnife.bind(this);


        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);
                Log.d(TAG, "Value is: " + value);
                text.setText(value);


            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                Log.w(TAG, "Failed to read value.", databaseError.toException());
            }
        });

        monthRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                DataModel dataModel = dataSnapshot.getValue(DataModel.class);
                Months month = dataModel.getMonths();
                List<January> january = new ArrayList<January>();
//                january = month.getJanuary();
                List<Extra> mExtras = dataModel.getExtra();
//                String fajr = january.get(1).getFajr_time();


//                Log.d(TAG,fajr);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        monthRef.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
//                PrayerTime mPrayerTime = dataSnapshot.getValue(PrayerTime.class);
//                Log.d(TAG,mPrayerTime.get(0).getFajr_time());
//                DataModel dataModel = dataSnapshot.getValue(DataModel.class);
//                Log.d(TAG,dataModel.getMonths().getJanuary().get(0).getFajr_time());
                int index = 0;

                for (DataSnapshot ds : dataSnapshot.getChildren()) {
                    PrayerTime prayer = ds.getValue(PrayerTime.class);
                    prayerTimeList.add(prayer);
                    Log.d(TAG, prayer.getFajr_time() + " index: " + ++index);
                }
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


    }

    private void showData(DataSnapshot dataSnapshot) {
//        for(DataSnapshot ds: dataSnapshot.getChildren()){
//            PrayerTime prayerTime = new PrayerTime();
//
//        }
    }

    @OnClick(R.id.bt_submit)
    public void submit(Button button) {
        myRef.setValue(text.getText().toString());
        Toast.makeText(this, "Button Clicked", Toast.LENGTH_SHORT).show();
    }


}
