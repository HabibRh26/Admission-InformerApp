package com.example.habibcse25.qaai;

import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OnClickListener {
    Button btnVarsity,btnCollege,registerbtn,admin_section_btn;
    Intent intent1,intent2,intent3;
    Toolbar toolbar;
    private DrawerLayout mDrawerLay;
    private ActionBarDrawerToggle mToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnVarsity = findViewById(R.id.btnVarsity);
        btnCollege = findViewById(R.id.btnCollege);
        registerbtn = findViewById(R.id.btnAdmin);
        admin_section_btn = findViewById(R.id.admin_section_btn);

        btnVarsity.setOnClickListener(this);
        btnCollege.setOnClickListener(this);
        registerbtn.setOnClickListener(this);
        admin_section_btn.setOnClickListener(this);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Home");

        mDrawerLay = findViewById(R.id.nav_drawerLay);
        mToggle = new ActionBarDrawerToggle(MainActivity.this,mDrawerLay,R.string.open,R.string.close);
        mDrawerLay.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (mToggle.onOptionsItemSelected(item)) {

            return true;
        }

        switch (item.getItemId()){
            case R.id.settings:
                Toast.makeText(this,"you clicked for settigns",Toast.LENGTH_SHORT).show();
                break;
            case R.id.refresh:
                Toast.makeText(this,"you clicked for refresh",Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.btnVarsity){
            intent1 = new Intent(this,UniversityActivity.class);
            startActivity(intent1);
        }
        else if(view.getId()==R.id.btnAdmin){
            intent3 = new Intent(this,RegActivity.class);
            startActivity(intent3);
        }
        else if(view.getId()==R.id.admin_section_btn){
            startActivity(new Intent(this,Admin_Activity.class));

        }





    }

}
