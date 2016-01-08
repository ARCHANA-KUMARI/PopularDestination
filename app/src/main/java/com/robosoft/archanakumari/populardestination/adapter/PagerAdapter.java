package com.robosoft.archanakumari.populardestination.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

import com.robosoft.archanakumari.populardestination.R;
import com.robosoft.archanakumari.populardestination.fragment.CheckFragment;
import com.robosoft.archanakumari.populardestination.fragment.CheckTwoFragment;
import com.robosoft.archanakumari.populardestination.fragment.DescriptionFragment;

/**
 * Created by archanakumari on 3/1/16.
 */
public class PagerAdapter extends FragmentPagerAdapter {

    Context context;
    DescriptionFragment descriptionFragment;
    private String mTabName[];

    public PagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        mTabName = context.getResources().getStringArray(R.array.name);
    }



    @Override
    public Fragment getItem(int position) {

        if (position == 0) {
            Log.i("Hello", "Hi i am in position 0");
            CheckFragment checkFragment = new CheckFragment();
            return checkFragment;

        } else if (position == 1) {
            descriptionFragment = new DescriptionFragment();
            return descriptionFragment;

        } else {
            CheckTwoFragment checkTwoFragment = new  CheckTwoFragment ();
            return checkTwoFragment;
        }


    }

    @Override
    public int getCount() {
        Log.i("Hello","HI I AM IN getCount() Method");
        return 3;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        Log.i("Hellow","Hi i am in getPageTitle()");
        return mTabName[position];
    }
}

