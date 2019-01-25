package com.example.user.kids_edu.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.user.kids_edu.R;
import com.example.user.kids_edu.model.MathTableListView;

import java.util.ArrayList;

public class CustomAdapter_math_table extends BaseAdapter {
    Context c;
    ArrayList<MathTableListView> mathTableList;

    public CustomAdapter_math_table(Context c, ArrayList<MathTableListView> mathTableList) {
        this.c = c;
        this.mathTableList = mathTableList;
    }

    @Override
    public int getCount() {
        return mathTableList.size();
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
    public View getView(final int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View customView  = inflater.inflate(R.layout.math_table_layout,null);

        TextView txtViewList = customView.findViewById(R.id.tableTxtView);
        ImageView imgViw = customView.findViewById(R.id.CustImgView);

        txtViewList.setText(mathTableList.get(position).getTable_name());
        imgViw.setImageResource(mathTableList.get(position).getImageId());


        return customView;
    }
}
