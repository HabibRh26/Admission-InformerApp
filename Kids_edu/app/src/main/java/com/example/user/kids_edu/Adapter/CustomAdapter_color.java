package com.example.user.kids_edu.Adapter;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.example.user.kids_edu.R;
import com.example.user.kids_edu.model.ColorImageGrid;
import com.example.user.kids_edu.model.MathDigitListView;

import java.util.ArrayList;

public class CustomAdapter_color extends BaseAdapter {
    Context c;
    ArrayList<ColorImageGrid> color_arrayList;

    public CustomAdapter_color(Context c, ArrayList<ColorImageGrid> color_arrayList) {
        this.c = c;
        this.color_arrayList = color_arrayList;
    }

    @Override
    public int getCount() {
        return color_arrayList.size();
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
        View customView  = inflater.inflate(R.layout.others_color_layout,null);

        ImageView imgViewList = customView.findViewById(R.id.custImgView);
        imgViewList.setImageResource(color_arrayList.get(position).getImageId());

        return customView;
}
}
