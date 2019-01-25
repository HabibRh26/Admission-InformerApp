package com.example.user.kids_edu.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.user.kids_edu.Letters_Words_Activity;
import com.example.user.kids_edu.R;
import com.example.user.kids_edu.mathDigitActivity;
import com.example.user.kids_edu.mathTableActivity;

public class MathFragment extends Fragment {
    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle){
        View view = inflater.inflate(R.layout.math_fragment_layout,null);

        ImageView imgViewDigits = view.findViewById(R.id.imgViewDigits);
        ImageView imgViewTables = view.findViewById(R.id.imgViewTables);
        TextView txtViewDigits = view.findViewById(R.id.txtViewDigits);
        TextView txtViewTables = view.findViewById(R.id.txtViewTables);

        txtViewDigits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), mathDigitActivity.class);
                startActivity(intent);
            }
        });
        txtViewTables.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), mathTableActivity.class);
                startActivity(intent);
            }
        });



        imgViewDigits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), mathDigitActivity.class);
                startActivity(intent);
            }
        });
        imgViewTables.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), mathTableActivity.class);
                startActivity(intent);
            }
        });

        return view;


    }
}