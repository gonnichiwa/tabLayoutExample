package com.malanghoney.tablayoutexample;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

	TabLayout tabLayout;
	ViewPager mViewPager;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		tabLayout = findViewById(R.id.tabs);
		tabLayout.addTab(tabLayout.newTab().setText("Tab One"));
		tabLayout.addTab(tabLayout.newTab().setText("Tab Two"));
		tabLayout.addTab(tabLayout.newTab().setText("Tab Three"));
		tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);


		mViewPager = findViewById(R.id.viewPager);
		TabPagerAdapter mTestPagerAdapter = new TabPagerAdapter(
				getSupportFragmentManager(), tabLayout.getTabCount()
		);
		mViewPager.setAdapter(mTestPagerAdapter);
		mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

		tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
			@Override
			public void onTabSelected(TabLayout.Tab tab) {
				mViewPager.setCurrentItem(tab.getPosition());
			}

			@Override
			public void onTabUnselected(TabLayout.Tab tab) {

			}

			@Override
			public void onTabReselected(TabLayout.Tab tab) {

			}
		});
	}
}
