package com.example.user.kidsed.adapter;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.user.kidsed.Letters_Words_Activity;
import com.example.user.kidsed.R;
import com.example.user.kidsed.model.LettersImageGrid;

import java.util.ArrayList;

/**
 * Created by User on 4/3/2018.
 */

public class CustomAdapter_letters extends BaseAdapter {
    Context c;
    ArrayList<LettersImageGrid> arrayList;


    public CustomAdapter_letters(Context c, ArrayList<LettersImageGrid> arrayList) {
        this.c = c;
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

        LayoutInflater inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View customView  = inflater.inflate(R.layout.letters_grid_layout,null);

        ImageView imgViewletters = customView.findViewById(R.id.imageViewLetters);
        TextView txtViewletters = customView.findViewById(R.id.textViewImage);

        imgViewletters.setImageResource(arrayList.get(position).getImageId());
        txtViewletters.setText(arrayList.get(position).getName());

        imgViewletters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer;
                mediaPlayer = MediaPlayer.create(c, arrayList.get(position).getAudioId());
                mediaPlayer.start();
            }
        });

        return customView;
    }
}
