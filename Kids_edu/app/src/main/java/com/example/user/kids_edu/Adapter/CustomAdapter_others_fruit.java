package com.example.user.kids_edu.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.example.user.kids_edu.R;
import com.example.user.kids_edu.model.FruitImageGrid;

import java.util.ArrayList;

public class CustomAdapter_others_fruit extends BaseAdapter {
    Context c;
    ArrayList<FruitImageGrid> fruit_arrayList;

    public CustomAdapter_others_fruit(Context c, ArrayList<FruitImageGrid> fruit_arrayList) {
        this.c = c;
        this.fruit_arrayList = fruit_arrayList;
    }

    @Override
    public int getCount() {
        return fruit_arrayList.size();
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
        View customView  = inflater.inflate(R.layout.others_fruit_layout,null);

        ImageView imgViewList = customView.findViewById(R.id.CustImgView);
        imgViewList.setImageResource(fruit_arrayList.get(position).getImageId());

        return customView;
    }
}
