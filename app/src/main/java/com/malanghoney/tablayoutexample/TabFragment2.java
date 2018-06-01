package com.malanghoney.tablayoutexample;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class TabFragment2 extends Fragment {

	public TabFragment2(){}

	public static TabFragment2 newInstance(){
		TabFragment2 fragment = new TabFragment2();
		Bundle args = new Bundle();
		fragment.setArguments(args);
		return fragment;
	}
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		return inflater.inflate(R.layout.fragment_page_two,container,false);
	}
}
