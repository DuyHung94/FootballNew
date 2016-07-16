package vn.com.mr.duyhung.fooballnews.activity;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.WindowManager;

import vn.com.mr.duyhung.fooballnews.R;
import vn.com.mr.duyhung.fooballnews.utility.Utility;

/**
 * Created by ASUS on 26/02/2016.
 */
public abstract class BaseActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Change device's actionbar type
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            getWindow().setStatusBarColor(Utility.getColor(this, R.color.purple));
        } else {
//            getWindow().setFlags(WindowManager.LayoutParams.MATCH_PARENT,
//                    WindowManager.LayoutParams.MATCH_PARENT);
        }

    }

}