package com.tjedit.playstorecopycat;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tjedit.playstorecopycat.databinding.ActivityMainBinding;
import com.tjedit.playstorecopycat.datas.App;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding act;
    List<App> appList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        act = DataBindingUtil.setContentView(this,R.layout.activity_main);
        act.titleTxt.setText("제목 화면");

        fillApps();


    }
    void fillApps(){
        appList.add(new App(1, "아스팔트 8 :에어본","GameLoft", 5,6000,true));
        appList.add(new App(2, "MineCraft","Mojang", 4,6000,true));
        appList.add(new App(3, "아스팔트 7  : 하트","GameLoft", 2,6000,false));
        appList.add(new App(4, "팔라독","FrazeCat", 3,6000,true));
        appList.add(new App(5, "Planet Vs Zombies","EA swiss sarl", 5,6000,false));
        appList.add(new App(6, "스왐피","Disney", 1,6000,false));
    }
}
