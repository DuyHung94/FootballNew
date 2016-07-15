package vn.com.mr.duyhung.fooballnews.loger;

import android.util.Log;

import vn.com.mr.duyhung.fooballnews.config.GlobalValue;

public class Logger {

    public static void e(Object object) {
        if (GlobalValue.DEBUG_MODE) {
            Log.e("Mi6App", "test: " + object);
        }
    }

    public static void e(String TAG, String msg) {
        if (GlobalValue.DEBUG_MODE) {
            Log.e(TAG, TAG + " " + msg);
        }
    }

    public static void d(String TAG, String msg) {
        if (GlobalValue.DEBUG_MODE) {
            Log.d(TAG, TAG + " " + msg);
        }
    }

    public static void w(String TAG, String msg) {
        if (GlobalValue.DEBUG_MODE) {
            Log.w(TAG, TAG + " " + msg);
        }
    }
}
