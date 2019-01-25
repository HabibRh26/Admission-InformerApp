package com.example.user.gridvwexmple.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.user.gridvwexmple.R;
import com.example.user.gridvwexmple.model.Cricketer;

import java.util.ArrayList;

/**
 * Created by User on 3/4/2018.
 */

public class CustomAdapter extends BaseAdapter {

    Context con;
    ArrayList<Cricketer> arrayListCric;

    public CustomAdapter(Context con, ArrayList<Cricketer> arrayListCric) {
        this.con = con;
        this.arrayListCric = arrayListCric;
    }

    @Override
    public int getCount() {
        return arrayListCric.size();
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
        LayoutInflater inflater = (LayoutInflater) con.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View customize_view = inflater.inflate(R.layout.grid_item_lay,null);

        ImageView iVcric = customize_view.findViewById(R.id.imageViewCric);
        TextView tVcric = customize_view.findViewById(R.id.textViewCric);

        iVcric.setImageResource(arrayListCric.get(position).getImageId());
        tVcric.setText(arrayListCric.get(position).getName());





        return customize_view;
    }
}
