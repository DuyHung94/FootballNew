package vn.com.mr.duyhung.fooballnews.activity;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import vn.com.mr.duyhung.fooballnews.R;

/**
 * Created by ASUS on 26/02/2016.
 */
public abstract class BaseActivityAbs extends Activity implements View.OnClickListener {
    private ImageView mBtnABSLeft;
    private ImageView mBtnABSRight;
    private ImageView mBtnABSRight2;
    private TextView mABSTitle;
    private TextView mABSSubTitle;

    private IAbsClick iClickLeft = null;
    private IAbsClick iClickRight = null;
    private IAbsClick iClickRight2 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Change device's actionbar type
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            getWindow().setStatusBarColor(getResources().getColor(R.color.purple));
        } else {
//            getWindow().setFlags(WindowManager.LayoutParams.MATCH_PARENT,
//                    WindowManager.LayoutParams.MATCH_PARENT);
        }

        setContentView(getLayoutResourceId());

        //abs
        mBtnABSLeft = (ImageView) findViewById(R.id.abs_btn_left);
        mBtnABSLeft.setOnClickListener(this);

        mBtnABSRight = (ImageView) findViewById(R.id.abs_btn_right);
        mBtnABSRight.setOnClickListener(this);

        mBtnABSRight2 = (ImageView) findViewById(R.id.abs_btn_right2);
        mBtnABSRight2.setOnClickListener(this);

        mABSTitle = (TextView) findViewById(R.id.abs_title);
        mABSTitle.setText("");

        mABSSubTitle = (TextView) findViewById(R.id.abs_sub_title);
        mABSSubTitle.setText("");
    }

    protected abstract int getLayoutResourceId();

    public void setTitleABS(String txt) {
        mABSTitle.setText(txt);
    }


    public void setABSTitleVisible(int visible) {
        mABSTitle.setVisibility(visible);
    }

    public void setSubTitleABS(String txt) {
        mABSSubTitle.setText(txt);
    }

    public void setABSSubTitleVisible(int visible) {
        mABSSubTitle.setVisibility(visible);
    }

    public void setABSLeftResource(int id) {
        mBtnABSLeft.setImageResource(id);
    }

    public void setABSLeftVisible(int visible) {
        mBtnABSLeft.setVisibility(visible);
    }

    public void setABSRightResource(int id) {
        mBtnABSRight.setImageResource(id);
    }

    public void setABSRightResource2(int id) {
        mBtnABSRight2.setImageResource(id);
    }

    public void setABSRightVisible(int visible) {
        mBtnABSRight.setVisibility(visible);
    }

    public void setABSRightVisible2(int visible) {
        mBtnABSRight2.setVisibility(visible);
    }

    public void setClickLeft(IAbsClick clickLeft) {
        iClickLeft = clickLeft;
    }

    public void setClickRight(IAbsClick clickRight) {
        iClickRight = clickRight;
    }

    public void setClickRight2(IAbsClick clickRight2) {
        iClickRight2 = clickRight2;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.abs_btn_left:
                if (iClickLeft != null) iClickLeft.IClick();
                break;

            case R.id.abs_btn_right:
                if (iClickRight != null) iClickRight.IClick();
                break;

            case R.id.abs_btn_right2:
                if (iClickRight2 != null) iClickRight2.IClick();
                break;
        }
    }

    public interface IAbsClick {
        void IClick();
    }
}