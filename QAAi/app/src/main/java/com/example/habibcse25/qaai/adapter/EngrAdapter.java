package com.example.habibcse25.qaai.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.habibcse25.qaai.Model_clss.EngrUnivCls;
import com.example.habibcse25.qaai.R;

import java.util.ArrayList;

/**
 * Created by HabibCse25 on 8/16/2018.
 */

public class EngrAdapter extends BaseAdapter {
    Context c;
    ArrayList<EngrUnivCls> engrUnivClsArrayList ;


    public EngrAdapter(Context c, ArrayList<EngrUnivCls> engrUnivClsArrayList) {
        this.c = c;
        this.engrUnivClsArrayList = engrUnivClsArrayList;
    }

    @Override
    public int getCount() {
        return engrUnivClsArrayList.size();
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
        LayoutInflater Inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View custom_view = Inflater.inflate(R.layout.engr_univ_layout,null);

        ImageView imgEngrUniv= custom_view.findViewById(R.id.engr_uni_img);
        TextView  txtEngrUniv = custom_view.findViewById(R.id.engr_uni_name);

        imgEngrUniv.setImageResource(engrUnivClsArrayList.get(position).getImgid());
        txtEngrUniv.setText(engrUnivClsArrayList.get(position).getUni_name());
        return custom_view;
    }
}
