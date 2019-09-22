package com.informer.habibcse25.qaai;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.informer.habibcse25.qaai.Model_clss.EngrUnivCls;
import com.informer.habibcse25.qaai.adapter.EngrAdapter;

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
                Log.d("position",String.valueOf(position));
                startActivity(intent);

            }
        });
        Engr_univ_toolbar = findViewById(R.id.Engr_univ_toolbar);
        setSupportActionBar(Engr_univ_toolbar);
        getSupportActionBar().setTitle("Engineering Universities");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    private void initializeData() {
        EngrUnivCls buet = new EngrUnivCls(R.drawable.buettrans,"BUET");
        EngrUnivCls kuet = new EngrUnivCls(R.drawable.kuettrans,"KUET");
        EngrUnivCls ruet = new EngrUnivCls(R.drawable.ruettrans,"RUET");
        EngrUnivCls cuet = new EngrUnivCls(R.drawable.cuettrans,"CUET");

        engr_univ_list.add(buet);
        engr_univ_list.add(kuet);
        engr_univ_list.add(ruet);
        engr_univ_list.add(cuet);
    }
}
