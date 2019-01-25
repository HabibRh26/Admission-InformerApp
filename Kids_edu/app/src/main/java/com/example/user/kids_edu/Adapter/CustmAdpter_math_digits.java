package com.example.user.kids_edu.Adapter;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.example.user.kids_edu.R;
import com.example.user.kids_edu.model.MathDigitListView;

import java.util.ArrayList;

public class CustmAdpter_math_digits extends BaseAdapter {
    Context c;
    ArrayList<MathDigitListView> Math_arrayList;


    public CustmAdpter_math_digits(Context c, ArrayList<MathDigitListView> arrayList) {
        this.c = c;
        this.Math_arrayList = arrayList;
    }


    @Override
    public int getCount() {
        return Math_arrayList.size();
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
    public View getView(final int position, View view, ViewGroup viewGroup) {

        LayoutInflater inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View customView  = inflater.inflate(R.layout.math_digit_layout,null);

        ImageView imgViewList = customView.findViewById(R.id.CustImgViwDigit);
        imgViewList.setImageResource(Math_arrayList.get(position).getImageId());

        imgViewList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer;
                mediaPlayer = MediaPlayer.create(c, Math_arrayList.get(position).getAudioId());

                mediaPlayer.start();
            }
        });

        return customView;
    }
}
