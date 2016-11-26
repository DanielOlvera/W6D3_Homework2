package com.example.daniel.w6d3_homework2.fragmentmenu;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

/**
 * Created by Daniel on 11/26/16.
 */

public class MenuFragmentAdapter extends FragmentPagerAdapter{

    private static final String TAG = "MenuFragmentAdapterTAG_";

    private static int NUM_ITEMS = 3;

    public MenuFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    //Returns the fragment to display for that page
    @Override
    public Fragment getItem(int position) {
        Log.d(TAG, "getItem: " + position);
        switch (position){
            case 0:
                return FragmentOne.newInstance(0, "One");
            case 1:
                return FragmentTwo.newInstance(1, "Two");
            case 2:
                return FragmentThree.newInstance(2, "Three");
            default:
                return null;
        }
    }

    //Return total number of pages
    @Override
    public int getCount() {
        Log.d(TAG, "getCount: ");
        return NUM_ITEMS;
    }

    //Return the page title for the top indicator
    @Override
    public CharSequence getPageTitle(int position) {
        Log.d(TAG, "getPageTitle: ");
        //return super.getPageTitle(position);
        return "Page " + position;
    }
}
