package com.example.user.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import lict.wg.activitylifecycle.R;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String value = getIntent().getStringExtra("hi");
        int intVal=getIntent().getIntExtra("intVal",0);
        Toast.makeText(this,value+"\n"+intVal,Toast.LENGTH_LONG).show();
    }
}
