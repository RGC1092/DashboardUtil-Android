package com.example.dashboardutil;

import android.util.Log;

public class LogDebug {

    private static final String TAG = "WELCOME TO MY APP";

    public static void d(String msg){
        Log.d(TAG, msg);
    }
}
