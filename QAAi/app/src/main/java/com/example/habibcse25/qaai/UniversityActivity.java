package com.example.habibcse25.qaai;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class UniversityActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnPublic,btnPrivate,btnNational;
    Intent intentPublic,intentPrivate,intentNational;
    Toolbar toolbarUniv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_university);

        btnPublic = findViewById(R.id.btnPublic);
        btnPrivate = findViewById(R.id.btnPrivate);
        btnNational = findViewById(R.id.btnNational);

        btnPublic.setOnClickListener(this);
        btnPrivate.setOnClickListener(this);
        btnNational.setOnClickListener(this);

        toolbarUniv = findViewById(R.id.univ_toolbar);
        setSupportActionBar(toolbarUniv);
        getSupportActionBar().setTitle("University Categories");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.btnPublic){
            intentPublic = new Intent(this,PublicActivity.class);
            startActivity(intentPublic);
        }
        else if(view.getId()==R.id.btnPrivate){
            intentPrivate = new Intent(this,EngrActivity.class);
            startActivity(intentPrivate);
        }
        else{
            intentNational = new Intent(this,PrivateActivity.class);
            startActivity(intentNational);
        }


    }
}
