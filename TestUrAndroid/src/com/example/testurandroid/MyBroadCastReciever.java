package com.example.testurandroid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyBroadCastReciever extends BroadcastReceiver{

	@Override
	public void onReceive(Context context, Intent intent) {
		Toast.makeText(context, "INSIDE  MyBroadCastReciever - new", Toast.LENGTH_LONG).show();
		
	}
	
}