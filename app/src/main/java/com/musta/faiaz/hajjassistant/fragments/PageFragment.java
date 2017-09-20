package com.musta.faiaz.hajjassistant.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.musta.faiaz.hajjassistant.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class PageFragment extends Fragment {
    public static final String ARG_PAGE = "ARG_PAGE";

    private int mPage;

    public PageFragment() {
        // Required empty public constructor
    }

    public static PageFragment newInstance(int pageNumber) {
        Bundle extra = new Bundle();
        extra.putInt(ARG_PAGE, pageNumber);

        PageFragment mPageFragment = new PageFragment();
        mPageFragment.setArguments(extra);
        return mPageFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPage = getArguments().getInt(ARG_PAGE);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View mView = inflater.inflate(R.layout.fragment_page, container, false);
        TextView mTextView = mView.findViewById(R.id.text);
        mTextView.setText("PAGE " + mPage);
        return mView;
    }

}
