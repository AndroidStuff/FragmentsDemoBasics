package com.example.fragmentsdemobasics;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void displayMessage() {
		Toast.makeText(this, "I am invoked by some Fragment code..", Toast.LENGTH_LONG).show();
	}
}
