package com.robosoft.archanakumari.populardestination;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.ImageView;

import com.robosoft.archanakumari.populardestination.adapter.PagerAdapter;
import com.robosoft.archanakumari.populardestination.tabs.SlidingTabLayout;

public class DisplayDescription extends AppCompatActivity {

    private Toolbar mToolbar;
    private ViewPager mViewPager;
    private ImageView mImageViewRound;
    private SlidingTabLayout mSlidingTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_description);
        Log.i("Hello", "I AM IN DisplayDescription Activity");
        TabLayout layout = (TabLayout)findViewById(R.id.tabs);

      //  mSlidingTabLayout = (SlidingTabLayout) findViewById(R.id.slidetab);
        mViewPager = (ViewPager) findViewById(R.id.viewpager);
     //   mSlidingTabLayout.setDistributeEvenly(true);
        mViewPager.setAdapter(new PagerAdapter(getSupportFragmentManager(), this));
        layout.setupWithViewPager(mViewPager);
        layout.getTabAt(0).setIcon(R.drawable.ic_favorite_white_18dp);
        layout.getTabAt(1).setIcon(R.drawable.star);
        layout.getTabAt(2).setIcon(R.drawable.marker);
        mToolbar = (Toolbar) findViewById(R.id.mToolbar);
        mToolbar.setNavigationIcon(R.drawable.ic_format_align_left_white_18dp);
      //  mSlidingTabLayout.setViewPager(mViewPager);
        mImageViewRound = (ImageView) findViewById(R.id.imag);
        Bitmap icon = BitmapFactory.decodeResource(getResources(), R.drawable.newyork);
//        mImageViewRound.setImageBitmap(icon);

    }

}
