package com.example.user.relativelay.adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.user.relativelay.MainActivity;
import com.example.user.relativelay.R;
import com.example.user.relativelay.Student;

import java.util.ArrayList;

/**
 * Created by User on 2/25/2018.
 */

public class CustomAdapter extends BaseAdapter {

    Context context;
    ArrayList<Student> arrayList;

    public CustomAdapter(MainActivity context, ArrayList<Student> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
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

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View vw=inflater.inflate(R.layout.list_item_lay,null);

        TextView TvUserName,TvCGPA;
        ImageView callIcon;

        TvUserName = vw.findViewById(R.id.ListTextViewName);
        TvCGPA = vw.findViewById(R.id.ListTextViewCGPA);
        callIcon =vw.findViewById(R.id.ListViewCall_Icon);

        TvUserName.setText("UserName : "+arrayList.get(position).getName());
        TvCGPA.setText(" "+arrayList.get(position).getCGPA());
        callIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(Intent.ACTION_DIAL);
                String uri = arrayList.get(position).getPhoneNo();
                intent.setData(Uri.parse("tel:"+uri));
                context.startActivity(intent);
            }
        });

        return vw;
    }
}
