package com.example.errorutil;

import android.util.Log;

public class errorUtils {

    private static final String TAG = "WELCOME TO MY APP";

    public static void error(String msg){
        Log.e(TAG, msg);
    }
}
