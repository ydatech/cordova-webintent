package com.borismus.webintent;

import java.util.HashMap;
import java.util.Map;

import org.apache.cordova.CordovaActivity;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;
import android.net.Uri;
import android.text.Html;
import android.util.Log;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaResourceApi;
import org.apache.cordova.PluginResult;

public class OutgoingCallReceiver extends BroadcastReceiver {

    public void onReceive(Context context, Intent intent) {

	String phoneURI = intent.getStringExtra("android.phone.extra.ORIGINAL_URI");
	String phoneNumber = getResultData();

        if (phoneURI == null) {
      	    // No reformatted number, use the original
    	    phoneURI = intent.getStringExtra(Intent.EXTRA_PHONE_NUMBER);      
        }
	
        Log.d("phoneURI", phoneURI);
        Log.d("phoneNumber", phoneNumber);

    }

}

