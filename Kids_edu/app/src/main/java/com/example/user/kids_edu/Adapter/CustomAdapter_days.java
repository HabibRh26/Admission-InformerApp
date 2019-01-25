package com.example.user.kids_edu.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.example.user.kids_edu.Fragment.OthersFragment;
import com.example.user.kids_edu.R;
import com.example.user.kids_edu.model.OthersDaysListView;

import java.util.ArrayList;

public class CustomAdapter_days extends BaseAdapter {
    Context c;
    ArrayList<OthersDaysListView> Days_arrayList;

    public CustomAdapter_days(Context c, ArrayList<OthersDaysListView> Days_arrayList) {
        this.c = c;
        this.Days_arrayList = Days_arrayList;
    }

    @Override
    public int getCount() {
        return Days_arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View customView  = inflater.inflate(R.layout.others_days_layout,null);

        ImageView imgViewList = customView.findViewById(R.id.imgViewDays);
        imgViewList.setImageResource(Days_arrayList.get(position).getImageId());


        return customView;
    }
}
