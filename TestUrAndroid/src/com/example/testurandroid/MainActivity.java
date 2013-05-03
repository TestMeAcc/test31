
package com.example.testurandroid;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

/*
Test Activity.
*/
public class MainActivity extends Activity {
	
	private MyBroadCastReciever myBroadCastReciever;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		findViewById(R.id.button1).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {

				Intent intent=new Intent("my_event");				
				sendBroadcast(intent);
			}
		});
		
		
		
		findViewById(R.id.button1).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {

				Intent intent=new Intent("my_event");				
				sendBroadcast(intent);
			}
		});
		
		
		
	}

	
	@Override
	protected void onResume() {
		super.onResume();
		myBroadCastReciever=new MyBroadCastReciever();
		registerReceiver(myBroadCastReciever, new IntentFilter("my_event"));
	}
	
	@Override
	protected void onPause() {
		super.onPause();
		unregisterReceiver(myBroadCastReciever);
		
	}
	
}


