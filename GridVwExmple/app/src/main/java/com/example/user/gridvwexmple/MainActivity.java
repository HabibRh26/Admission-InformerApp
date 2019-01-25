package com.example.user.gridvwexmple;

import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.user.gridvwexmple.adapter.CustomAdapter;
import com.example.user.gridvwexmple.model.Cricketer;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView gridvw;
    ArrayList<Cricketer> cricketers;
    CoordinatorLayout coOrdLay;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridvw = findViewById(R.id.grid_view);
        coOrdLay = findViewById(R.id.coordinatorLayout);

        cricketers = new ArrayList<>();
        setData();
        CustomAdapter adapter = new CustomAdapter(MainActivity.this,cricketers);
        gridvw.setAdapter(adapter);
        gridvw.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Snackbar snackbar = Snackbar.make(coOrdLay, cricketers.get(position).getName(), Snackbar.LENGTH_LONG);
                snackbar.show();
                
            }
        });

    }

    private void setData() {
        Cricketer messi = new Cricketer(R.drawable.goal1,"messi");
        Cricketer mash = new Cricketer(R.drawable.mash,"mash");
        Cricketer tamim = new Cricketer(R.drawable.tamim,"tamim");
        Cricketer musta = new Cricketer(R.drawable.musta,"musta");

        cricketers.add(messi);
        cricketers.add(mash);
        cricketers.add(tamim);
        cricketers.add(musta);
    }


}
