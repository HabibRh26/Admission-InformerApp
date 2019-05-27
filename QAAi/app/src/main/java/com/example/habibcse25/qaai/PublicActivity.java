package com.example.habibcse25.qaai;


import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.habibcse25.qaai.Model_clss.PublicUnivCls;
import com.example.habibcse25.qaai.adapter.PublicAdapter;

import java.util.ArrayList;
import java.util.List;


public class PublicActivity extends AppCompatActivity implements PublicAdapter.ItemListener {

    Toolbar Public_uni_toolbar;
    PublicAdapter recycleAdapter;
    List<PublicUnivCls> publicUnivList;
    RecyclerView recyclerViewUniv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_public);

        Public_uni_toolbar = findViewById(R.id.Public_uni_toolbar);
        setSupportActionBar(Public_uni_toolbar);
        getSupportActionBar().setTitle("Public Universities");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        publicUnivList = new ArrayList<>();

        recyclerViewUniv = findViewById(R.id.recyclerView);
        recyclerViewUniv.setHasFixedSize(true);
        recyclerViewUniv.setLayoutManager(new LinearLayoutManager(this));

        PublicUnivCls publicUnivObj1 = new PublicUnivCls("daffodil","dhanmondi",R.drawable.daffodil);
        PublicUnivCls publicUnivObj2 = new PublicUnivCls("UIU","dhanmondi",R.drawable.uiu);

        publicUnivList.add(publicUnivObj1);
        publicUnivList.add(publicUnivObj2);

        recycleAdapter = new PublicAdapter(this,publicUnivList,this);
        recyclerViewUniv.setAdapter(recycleAdapter);

    }

    @Override
    public void onClickITem(int position) {
        Toast.makeText(this,"new way clicked",Toast.LENGTH_LONG).show();
        Log.d("clicked","clicked");
    }
}
