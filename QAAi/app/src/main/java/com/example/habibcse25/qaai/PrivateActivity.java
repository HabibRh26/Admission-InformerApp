package com.example.habibcse25.qaai;

import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;


import com.example.habibcse25.qaai.Model_clss.PunivCls;
import com.example.habibcse25.qaai.adapter.PunivAdapter;

import java.util.ArrayList;

public class PrivateActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
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
        PunivAdapter Adapter = new PunivAdapter(PrivateActivity.this, arrayListPunivCls);
        listview.setAdapter(Adapter);
        listview.setOnItemClickListener(PrivateActivity.this);

        Private_univ_toolbar = findViewById(R.id.Private_univ_toolbar);
        setSupportActionBar(Private_univ_toolbar);
        getSupportActionBar().setTitle("Private Universities");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    private void dataSet() {
        PunivCls bracu = new PunivCls(R.drawable.bractrans, "BRAC University");
        PunivCls aust = new PunivCls(R.drawable.austtrans, "AUST");
        PunivCls ewu = new PunivCls(R.drawable.ewutrans, "East West University");
        PunivCls nsu = new PunivCls(R.drawable.nsutrans, "North South University");
        PunivCls aiub = new PunivCls(R.drawable.aiubtrans, "AIUB");
        PunivCls daffodil = new PunivCls(R.drawable.diutrans, "Daffodil International University");
        PunivCls uiu = new PunivCls(R.drawable.uiutrans, "United International University");
        PunivCls iubat = new PunivCls(R.drawable.iubattrans, "IUBAT");


        arrayListPunivCls.add(aiub);
        arrayListPunivCls.add(aust);
        arrayListPunivCls.add(bracu);
        arrayListPunivCls.add(daffodil);
        arrayListPunivCls.add(ewu);
        arrayListPunivCls.add(iubat);
        arrayListPunivCls.add(nsu);
        arrayListPunivCls.add(uiu);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
       /* Intent intent = new Intent(PrivateActivity.this,PrivateDescActivity.class);
        intent.putExtra("position",position);
        startActivity(intent);*/
        if (position == 0) {

            Intent intentAIUB = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.aiub.edu/admission"));
            startActivity(intentAIUB);


        }
        if (position == 1) {

            Intent intentAust = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.aust.edu/admission.htm"));
            startActivity(intentAust);


        }
        if (position == 2) {

            Intent intentBrac = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/1GoiL9sjeFWNBP1vQmLZUq3QOebU7glIM?fbclid=IwAR3x79Keb1v3tj44ujyE8MOSnfVV0QieySD07n33CvB3NgUvDBS-cHzuQW8"));
            startActivity(intentBrac);


        }
        if (position == 3) {

            Intent intentDaffodil = new Intent(Intent.ACTION_VIEW, Uri.parse("https://daffodilvarsity.edu.bd/article/admission"));
            startActivity(intentDaffodil);


        }
        if (position == 4) {

            Intent intentEwu = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/1RDau-uZYdDH7zQBu-3crm22j25eW4Ml5?fbclid=IwAR3x79Keb1v3tj44ujyE8MOSnfVV0QieySD07n33CvB3NgUvDBS-cHzuQW8"));
            startActivity(intentEwu);


        }
        if (position == 5) {

            Intent intentIUBAT = new Intent(Intent.ACTION_VIEW, Uri.parse("http://iubat.edu/admission/"));
            startActivity(intentIUBAT);

        }
        if (position == 6) {

            Intent intentNsu = new Intent(Intent.ACTION_VIEW, Uri.parse("http://admissions.northsouth.edu/undergraduate_requirement"));
            startActivity(intentNsu);

        }
        if (position == 7) {

            Intent intentUIU = new Intent(Intent.ACTION_VIEW, Uri.parse("https://http://www.uiu.ac.bd/admission/undergraduate-program/"));
            startActivity(intentUIU);

        }

    }
}
