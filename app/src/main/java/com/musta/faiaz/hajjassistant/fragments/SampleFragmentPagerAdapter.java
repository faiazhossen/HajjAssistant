package com.musta.faiaz.hajjassistant.fragments;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by FAIAZ on 8/20/2017.
 */

public class SampleFragmentPagerAdapter extends FragmentPagerAdapter {

    final int pageCount = 4;
    String[] tabTitles = {"HAJJ", "PRAYER", "QIBLA", "QURAN"};
    private Context context;


    public SampleFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        return PageFragment.newInstance(position + 1);
    }

    @Override
    public int getCount() {
        return pageCount;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}
