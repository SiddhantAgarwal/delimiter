package com.example.delimiter;

import android.app.IntentService;
import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import android.text.format.DateFormat;

public class SimpleIntentService extends IntentService {
	public static final String PARAM_IN_MSG = "imsg";
    public static final String PARAM_OUT_MSG = "omsg";
 
    public SimpleIntentService() {
        super("SimpleIntentService");
    }
 
    
    protected void onHandleIntent(Intent intent) {
 
    	
    }
}
