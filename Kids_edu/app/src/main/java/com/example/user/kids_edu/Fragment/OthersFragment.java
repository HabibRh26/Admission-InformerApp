package com.example.user.kids_edu.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.user.kids_edu.Others_monthActivity;
import com.example.user.kids_edu.R;
import com.example.user.kids_edu.mathDigitActivity;
import com.example.user.kids_edu.others_color_Activity;
import com.example.user.kids_edu.others_days_Activity;
import com.example.user.kids_edu.others_fruit_activity;

public class OthersFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle){

            View view = inflater.inflate(R.layout.others_fragment_layout,null);

            ImageView imgViewColor = view.findViewById(R.id.imgViewColor);
            ImageView imgViewFruits = view.findViewById(R.id.imgViewFruits);
            ImageView imgViewMonths = view.findViewById(R.id.imgViewMonths);
            ImageView imgViewDays = view.findViewById(R.id.imgViewDays);

            TextView textview_colors = view.findViewById(R.id.textview_colors);
            TextView textview_fruits = view.findViewById(R.id.textview_fruits);
            TextView textview_Months = view.findViewById(R.id.textview_Months);
            TextView textview_days = view.findViewById(R.id.textview_days);

        imgViewColor.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getActivity(),others_color_Activity.class);
                    startActivity(intent);
                }
            });
        textview_colors.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getActivity(), others_color_Activity.class);
                    startActivity(intent);
                }
            });

        imgViewFruits.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getActivity(), others_fruit_activity.class);
                    startActivity(intent);
                }
            });
        textview_fruits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), others_fruit_activity.class);
                startActivity(intent);
            }
        });
        imgViewMonths.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getActivity(), Others_monthActivity.class);
                    startActivity(intent);
                }
            });
        textview_Months.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Others_monthActivity.class);
                startActivity(intent);
            }
        });


        imgViewDays.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), others_days_Activity.class);
                startActivity(intent);
            }
        });

        textview_days.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), others_days_Activity.class);
                startActivity(intent);
            }
        });


            return view;


        }

    }


