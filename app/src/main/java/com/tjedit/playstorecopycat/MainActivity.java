package com.tjedit.playstorecopycat;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Toast;

import com.tjedit.playstorecopycat.adapters.AppAdapter;
import com.tjedit.playstorecopycat.databinding.ActivityMainBinding;
import com.tjedit.playstorecopycat.datas.App;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding act;
    List<App> appList = new ArrayList<>();
    AppAdapter mAppAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        act = DataBindingUtil.setContentView(this, R.layout.activity_main);
        act.titleTxt.setText("제목 화면");


        fillApps();

        mAppAdapter = new AppAdapter(MainActivity.this, appList);
        act.appRankListView.setAdapter(mAppAdapter);

        act.okBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "확인버튼을 눌렀습니다.", Toast.LENGTH_SHORT).show();
                appList.add(new App(10,"임시 게임", "앙모장",1,4222, true));
                mAppAdapter.notifyDataSetChanged();

                act.appRankListView.smoothScrollToPosition(appList.size()-1);
            }
        });

        act.appRankListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                App clickedAppData = appList.get(position);
//  Toast.makeText(MainActivity.this, String.format("%d번 줄 클릭", position), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, AppDetailActivity.class);
//              intent.putExtra("제목", clickedAppData.title);
//              intent.putExtra("회사이름",clickedAppData.companyName);
                intent.putExtra("앱정보", clickedAppData);
                startActivity(intent);
            }
        });
        act.appRankListView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
//              Toast.makeText(MainActivity.this,String.format("%d번 줄을 오래 누름",position), Toast.LENGTH_LONG).show();
                appList.remove(position);
                mAppAdapter.notifyDataSetChanged();
                return true;
            }
        });
    }

    void fillApps() {
        appList.add(new App(1, "아스팔트 8 :에어본", "GameLoft", 5, 6000, true));
        appList.add(new App(2, "MineCraft", "Mojang", 4, 6000, true));
        appList.add(new App(3, "아스팔트 7  : 하트", "GameLoft", 2, 6000, false));
        appList.add(new App(4, "팔라독", "FrazeCat", 3, 6000, true));
        appList.add(new App(5, "Planet Vs Zombies", "EA swiss sarl", 5, 2000, false));
        appList.add(new App(6, "스왐피", "Disney", 1, 1200, false));

    }
}
