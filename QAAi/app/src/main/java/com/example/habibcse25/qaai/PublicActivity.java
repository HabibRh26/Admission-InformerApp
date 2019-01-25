package com.example.habibcse25.qaai;


import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.habibcse25.qaai.fragments.FragmentA;
import com.example.habibcse25.qaai.fragments.FragmentB;


public class PublicActivity extends AppCompatActivity implements FragmentA.Communicator {
    FragmentA fA;
    FragmentB fB;
    FragmentManager manager;
    Toolbar Public_uni_toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_public);
        manager = getSupportFragmentManager();
        fA= (FragmentA) manager.findFragmentById(R.id.fragment1);
        fA.setCommunicator(this);

        Public_uni_toolbar = findViewById(R.id.Public_uni_toolbar);
        setSupportActionBar(Public_uni_toolbar);
        getSupportActionBar().setTitle("Public Universities");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



    }
    @Override
    public void respond(int position) {
        fB= (FragmentB) manager.findFragmentById(R.id.fragment2);
        fB.changeData(position);


    }
}
