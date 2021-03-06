package com.tjedit.playstorecopycat.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.tjedit.playstorecopycat.R;
import com.tjedit.playstorecopycat.datas.App;

import java.util.List;

public class AppAdapter extends ArrayAdapter<App> {
    Context mContext;
    List<App> mList;
    LayoutInflater inf;

    public AppAdapter (Context context, List<App> list){
        super(context, R.layout.app_list_item,list);
        mContext =context;
        mList = list;
        inf = LayoutInflater.from(mContext);

    }


    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
         View row = convertView;
         if(row ==null)
         {
             row = inf.inflate(R.layout.app_list_item,null);

         }
        App appData = mList.get(position);
        TextView rankAndTitleTxt = row.findViewById(R.id.rankAndTitleTxt);
        TextView companyNameTxt = row.findViewById(R.id.companyNameTxt);
        TextView priceOrInstalledTxt = row.findViewById(R.id.priceOrInstalledTxt);

        rankAndTitleTxt.setText(String.format("%d. %s",appData.rank,appData.title));
        companyNameTxt.setText(appData.companyName);

        if(appData.isMine ){

            priceOrInstalledTxt.setText("설치된 항목");
        }
        else{
            priceOrInstalledTxt.setText(String.format("%,d원",appData.price));
        }
         return row;

    }
}
