package com.example.user.kids_edu.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.example.user.kids_edu.R;
import com.example.user.kids_edu.model.OthersMonthGridView;

import java.util.ArrayList;

public class CustomAdapter_Months extends BaseAdapter {
    Context c;
    ArrayList<OthersMonthGridView> Month_arrayList;

    public CustomAdapter_Months(Context c, ArrayList<OthersMonthGridView> month_arrayList) {
        this.c = c;
        Month_arrayList = month_arrayList;
    }

    @Override
    public int getCount() {
        return Month_arrayList.size();
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
        View customView  = inflater.inflate(R.layout.others_month_layout,null);

        ImageView imgViewList = customView.findViewById(R.id.imgViewMonths);
        imgViewList.setImageResource(Month_arrayList.get(position).getImageId());


        return customView;
    }
}
