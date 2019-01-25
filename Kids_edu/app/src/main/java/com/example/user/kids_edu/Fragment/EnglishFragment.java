package com.example.user.kids_edu.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.user.kids_edu.Letters_Words_Activity;
import com.example.user.kids_edu.R;

public class EnglishFragment extends Fragment {

    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle){


        View view = inflater.inflate(R.layout.english_fragment_layout,null);
        Button buttonLetter = view.findViewById(R.id.buttonLetters);
        buttonLetter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Letters_Words_Activity.class);
                startActivity(intent);
            }
        });

        return view;

    }


}