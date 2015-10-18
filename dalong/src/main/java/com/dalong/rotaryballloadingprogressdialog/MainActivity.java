package com.dalong.rotaryballloadingprogressdialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private RotaryBallLoadingProgressDialog mRotaryBallLoadingProgressDialog;

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
        mRotaryBallLoadingProgressDialog=(RotaryBallLoadingProgressDialog)findViewById(R.id.mRotaryBallLoadingProgressDialog);
        mRotaryBallLoadingProgressDialog.setDistance(60);
        mRotaryBallLoadingProgressDialog.setMaxRadius(30);
    }

}
