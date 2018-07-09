package com.example.android.fantacityguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;

    // Uses Fragments as pages and keeps them in memory
    public CategoryAdapter(Context context, FragmentManager fragmentManager) {
        super(fragmentManager);
        mContext = context;
    }

    // Associates each Fragment with a position
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new DistrictsFragment();
        } else if (position == 1) {
            return new ForestsFragment();
        } else if (position == 2) {
            return new AttractionsFragment();
        } else {
            return new FacilitiesFragment();
        }
    }

    // Returns the number of categories
    @Override
    public int getCount() {
        return 4;
    }
}