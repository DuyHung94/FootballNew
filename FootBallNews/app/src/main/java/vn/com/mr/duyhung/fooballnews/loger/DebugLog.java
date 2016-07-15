package vn.com.mr.duyhung.fooballnews.loger;

import android.util.Log;

import vn.com.mr.duyhung.fooballnews.config.GlobalValue;

/**
 * Created by Mr.Bean on 10-Jul-16.
 */
public final class DebugLog {
    /**
     * Call SmartLog.log
     *
     * @param TAG
     * @param msg
     */
    public static void log(String TAG, String msg) {
        if (GlobalValue.DEBUG_MODE) {
            Log.d(TAG, msg);
        }
    }

    public static void e(String TAG, String msg) {
        if (GlobalValue.DEBUG_MODE) {
            Log.e(TAG, msg);
        }
    }

    public static void d(String TAG, String msg) {
        if (GlobalValue.DEBUG_MODE) {
            Log.d(TAG, msg);
        }
    }

    public static void i(String TAG, String msg) {
        if (GlobalValue.DEBUG_MODE) {
            Log.i(TAG, msg);
        }
    }

}
