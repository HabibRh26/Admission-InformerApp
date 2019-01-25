package com.example.habibcse25.qaai.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.habibcse25.qaai.Model_clss.PunivCls;
import com.example.habibcse25.qaai.R;

import java.util.ArrayList;

/**
 * Created by HabibCse25 on 09-Sep-18.
 */

public class PunivAdapter extends BaseAdapter {
    Context context;
    ArrayList<PunivCls> punivClsArrayList;

    public PunivAdapter(Context context, ArrayList<PunivCls> punivClsArrayList) {
        this.context = context;
        this.punivClsArrayList = punivClsArrayList;
    }

    @Override
    public int getCount() {
        return punivClsArrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
         View customview = inflater.inflate(R.layout.puniv_item_layout,null);
        TextView varsityName = customview.findViewById(R.id.VarsityName);
        ImageView imgLogo = customview.findViewById(R.id.imgVwlogo);

        varsityName.setText(punivClsArrayList.get(position).getVarsityName());
        imgLogo.setImageResource(punivClsArrayList.get(position).getImgId());
        return customview;
    }
}
