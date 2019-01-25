package com.example.habibcse25.qaai;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Admin_Activity extends AppCompatActivity  implements View.OnClickListener{
    EditText admin_Pass;
    Button passSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_);
        admin_Pass = findViewById(R.id.adminPassword);
        passSubmit = findViewById(R.id.passSubmit);
        passSubmit.setOnClickListener(Admin_Activity.this);



    }

    @Override
    public void onClick(View view) {
        if(admin_Pass.getText().toString().equals("adminmy40")){
            Toast.makeText(getApplicationContext(),"password enterd successfully",Toast.LENGTH_SHORT).show();


        }
        startActivity(new Intent(Admin_Activity.this,DataSendActivity.class));

    }
}
