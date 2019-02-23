package com.example.imageslider.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.imageslider.R;

public class SliderAdapter extends PagerAdapter {
    private Context ctx;
    private int imageId[] = new int[]{R.drawable.img1,R.drawable.img2,R.drawable.img3};

    public SliderAdapter(Context ctx) {
        this.ctx = ctx;
    }

    @Override
    public int getCount() {
        return imageId.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view==(LinearLayout)o;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater inflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
       View customView = inflater.inflate(R.layout.slider_layout,container,false);

       ImageView imgView = customView.findViewById(R.id.img_vw_Slider);
        TextView txtView = customView.findViewById(R.id.txt_vw_Slider);
        imgView.setImageResource(imageId[position]);

        txtView.setText("image : "+position);

       /* ImageView imgView = new ImageView(ctx);
        imgView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imgView.setImageResource(imageId[position]);*/
        container.addView(customView,0);

        return customView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout)object);
    }
}
