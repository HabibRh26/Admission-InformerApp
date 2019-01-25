package com.example.habibcse25.qaai;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.habibcse25.qaai.Model_clss.EngrUnivCls;
import com.example.habibcse25.qaai.adapter.EngrAdapter;

import java.util.ArrayList;


public class EngrActivity extends AppCompatActivity {

    GridView gridView ;
    ArrayList<EngrUnivCls> engr_univ_list ;
    Intent intent;
    Toolbar Engr_univ_toolbar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_engr);
        gridView = findViewById(R.id.gridEngr);
        engr_univ_list = new ArrayList<>();
        initializeData();
        EngrAdapter CustomEngrAdapter = new EngrAdapter(EngrActivity.this,engr_univ_list);
        gridView.setAdapter(CustomEngrAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                intent = new Intent(EngrActivity.this,EngrDescriptionActivity.class);
                intent.putExtra("position",position);
                startActivity(intent);

            }
        });
        Engr_univ_toolbar = findViewById(R.id.Engr_univ_toolbar);
        setSupportActionBar(Engr_univ_toolbar);
        getSupportActionBar().setTitle("Engineering Universities");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



    }

    private void initializeData() {
        EngrUnivCls buet = new EngrUnivCls(R.drawable.buetmini,"BUET");
        EngrUnivCls kuet = new EngrUnivCls(R.drawable.kuetpic,"KUET");
        EngrUnivCls ruet = new EngrUnivCls(R.drawable.ruetmini,"RUET");
        EngrUnivCls cuet = new EngrUnivCls(R.drawable.cuetmini,"CUET");

        engr_univ_list.add(buet);
        engr_univ_list.add(kuet);
        engr_univ_list.add(ruet);
        engr_univ_list.add(cuet);
    }
}
