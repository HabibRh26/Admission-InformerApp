package com.example.user.kidsed.fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;

import com.example.user.kidsed.R;

/**
 * Created by User on 3/27/2018.
 */

public class HomeFragment extends Fragment {

    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup,Bundle bundle){

        return inflater.inflate(R.layout.home_fragment_layout,null);
    }
}
