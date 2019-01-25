package com.example.user.kids_edu.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.user.kids_edu.R;

public class HomeFragment extends Fragment {

    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle){

        return inflater.inflate(R.layout.home_fragment_layout,null);
    }
}
