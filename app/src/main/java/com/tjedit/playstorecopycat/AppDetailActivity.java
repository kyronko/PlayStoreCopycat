package com.tjedit.playstorecopycat;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tjedit.playstorecopycat.databinding.ActivityAppDetailBinding;
import com.tjedit.playstorecopycat.databinding.ActivityMainBinding;

public class AppDetailActivity extends AppCompatActivity {

     ActivityAppDetailBinding act;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        act = DataBindingUtil.setContentView(this,R.layout.activity_app_detail);


    }
}
