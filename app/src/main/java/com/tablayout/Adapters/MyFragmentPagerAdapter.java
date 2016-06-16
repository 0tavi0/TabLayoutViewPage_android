package com.tablayout.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.tablayout.Fragments.FragmentA;
import com.tablayout.Fragments.FragmentB;

/**
 * Created by otavioleao on 16/06/16.
 */
public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    private String[] mTabTitles;

     public MyFragmentPagerAdapter(FragmentManager fm, String[] mTabTitles) {
        super(fm);
        this.mTabTitles = mTabTitles;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                return new FragmentA();
            case 1:
                return new FragmentB();
            default:
                return null;
            }
        }


    @Override
    public int getCount() {
        return this.mTabTitles.length ;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return this.mTabTitles[position];
    }
}
