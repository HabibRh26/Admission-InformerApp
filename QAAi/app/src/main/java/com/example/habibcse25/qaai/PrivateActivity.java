package com.example.habibcse25.qaai;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;


import com.example.habibcse25.qaai.Model_clss.PunivCls;
import com.example.habibcse25.qaai.adapter.PunivAdapter;

import java.util.ArrayList;

public class PrivateActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{
    ListView listview;
    Toolbar Private_univ_toolbar;
    ArrayList<PunivCls> arrayListPunivCls;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_private);
        listview = findViewById(R.id.listview);
        arrayListPunivCls = new ArrayList<>();
        dataSet();
        PunivAdapter Adapter = new PunivAdapter(PrivateActivity.this,arrayListPunivCls);
        listview.setAdapter(Adapter);
        listview.setOnItemClickListener(PrivateActivity.this);

        Private_univ_toolbar = findViewById(R.id.Private_univ_toolbar);
        setSupportActionBar(Private_univ_toolbar);
        getSupportActionBar().setTitle("Private Universities");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



    }

    private void dataSet() {
        PunivCls bracu = new PunivCls(R.drawable.bracu,"BRAC University");
        PunivCls aust = new PunivCls(R.drawable.aust,"AUST");
        PunivCls ewu = new PunivCls(R.drawable.ewu,"East West University");
        PunivCls nsu = new PunivCls(R.drawable.nsu,"North South University");



        arrayListPunivCls.add(bracu);
        arrayListPunivCls.add(aust);
        arrayListPunivCls.add(ewu);
        arrayListPunivCls.add(nsu);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        Intent intent = new Intent(PrivateActivity.this,PrivateDescActivity.class);

    }
}
