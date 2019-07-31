package com.example.habibcse25.qaai;


import android.content.Intent;
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

        PublicUnivCls publicUnivObj1 = new PublicUnivCls("Dhaka University","Dhaka",R.drawable.dutrans);
        PublicUnivCls publicUnivObj2 = new PublicUnivCls("Jahangirnagar University","savar",R.drawable.jutrans);
        PublicUnivCls publicUnivObj3 = new PublicUnivCls("Jagannath University","savar",R.drawable.jnutrans);
        PublicUnivCls publicUnivObj4 = new PublicUnivCls("Chittagong University","savar",R.drawable.cutrans);
        PublicUnivCls publicUnivObj5 = new PublicUnivCls("Khulna University","savar",R.drawable.kutrans);
        PublicUnivCls publicUnivObj6 = new PublicUnivCls("Rajshahi University","savar",R.drawable.rutrans);
        PublicUnivCls publicUnivObj7 = new PublicUnivCls("Comilla University","savar",R.drawable.comtrans);
        PublicUnivCls publicUnivObj8 = new PublicUnivCls("Barisal University","savar",R.drawable.butranss);
        PublicUnivCls publicUnivObj9 = new PublicUnivCls("Begum Rokeya University","savar",R.drawable.berobi);


        publicUnivList.add(publicUnivObj1);
        publicUnivList.add(publicUnivObj2);
        publicUnivList.add(publicUnivObj3);
        publicUnivList.add(publicUnivObj4);
        publicUnivList.add(publicUnivObj5);
        publicUnivList.add(publicUnivObj6);
        publicUnivList.add(publicUnivObj7);
        publicUnivList.add(publicUnivObj8);
        publicUnivList.add(publicUnivObj9);


        recycleAdapter = new PublicAdapter(this,publicUnivList,this);
        recyclerViewUniv.setAdapter(recycleAdapter);

    }

    @Override
    public void onClickITem(int position) {

        Intent intent = new Intent(this,PublicDescActivity.class);
        intent.putExtra("positionMain",position);
        startActivity(intent);

    }
}
