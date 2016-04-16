package com.dalong.rotaryballloadingprogressdialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.dalong.rotaryballview.RotaryBallView;

public class MainActivity extends AppCompatActivity {

    private RotaryBallView mRotaryBallView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    /**
     * 初始化view
     */
    private void initView() {
        mRotaryBallView=(RotaryBallView)findViewById(R.id.mRotaryBallLoadingProgressDialog);
        mRotaryBallView.setMaxRadius(30);
        mRotaryBallView.setDistance(60);

    }

    @Override
    protected void onStart() {
        super.onStart();
        mRotaryBallView.startAnimator();
    }

    @Override
    protected void onStop() {
        super.onStop();
        mRotaryBallView.stopAnimator();
    }
}
