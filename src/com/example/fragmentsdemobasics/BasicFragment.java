package com.example.fragmentsdemobasics;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;

public class BasicFragment extends Fragment implements OnClickListener {
	private static final String TAG = BasicFragment.class.getSimpleName();

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		// Inflate the layout for this fragment.
		// While there are simpler  flavors of the inflate() method on LayoutInflater,
		// this one is required in case the ViewGroup happens to be a RelativeLayout, 
		// so that we can process all of the positioning and sizing rules appropriately.
		final View fragment = inflater.inflate(R.layout.fragment_basic, container, false);
		
		fragment.findViewById(R.id.btnFrag).setOnClickListener(this);
		
		return fragment;
	}

	@Override
	public void onClick(View v) {
		Log.i(TAG, "The button in Fragment is clicked");
	}
}
