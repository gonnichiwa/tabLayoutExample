package com.malanghoney.tablayoutexample;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class TabPagerAdapter extends FragmentStatePagerAdapter {

	private int tabCount;

	public TabPagerAdapter(FragmentManager fm, int tabCount) {
		super(fm);
		this.tabCount = tabCount;
	}

	@Override
	public Fragment getItem(int position) {
		switch(position){
			case 0: return TabFragment1.newInstance();
			case 1: return TabFragment2.newInstance();
			case 2: return TabFragment3.newInstance();
			default: return null;
		}
	}

	@Override
	public int getCount() {
		return tabCount;
	}

}
