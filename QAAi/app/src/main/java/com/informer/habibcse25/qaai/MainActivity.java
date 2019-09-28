package com.informer.habibcse25.qaai;

import android.content.Intent;

import androidx.annotation.NonNull;

import com.crashlytics.android.Crashlytics;
import com.google.android.material.navigation.NavigationView;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;

import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

import com.google.firebase.messaging.FirebaseMessaging;

import io.fabric.sdk.android.Fabric;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener,OnClickListener {
    Button btnVarsity, btnCollege, registerbtn, admin_section_btn;
    Intent intent1, intent2, intent3;
    ImageView univIconImgVw;
    Toolbar toolbar;
    NavigationView NavView;
    private DrawerLayout mDrawerLay;
    private ActionBarDrawerToggle mToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fabric.with(this,new Crashlytics());
        setContentView(R.layout.activity_main);


        FirebaseMessaging.getInstance().subscribeToTopic("admissionNoti");

        btnVarsity = findViewById(R.id.btnVarsity);
    //    btnCollege = findViewById(R.id.btnCollege);
    //    registerbtn = findViewById(R.id.btnAdmin);
      //  admin_section_btn = findViewById(R.id.admin_section_btn);
        univIconImgVw = findViewById(R.id.univIconImgVw);
        univIconImgVw.setOnClickListener((OnClickListener) this);
        btnVarsity.setOnClickListener((OnClickListener) this);
//        btnCollege.setOnClickListener(this);
     //   registerbtn.setOnClickListener(this);
       // admin_section_btn.setOnClickListener(this);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Home");

        NavView = findViewById(R.id.NavView);
        NavView.setNavigationItemSelectedListener(this);
        NavView.setItemIconTintList(null);
        mDrawerLay = findViewById(R.id.nav_drawerLay);
        mToggle = new ActionBarDrawerToggle(MainActivity.this, mDrawerLay, R.string.open, R.string.close);
        mDrawerLay.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }


/*    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }*/

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (mToggle.onOptionsItemSelected(item)) {

            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
      if(view.getId()==R.id.univIconImgVw) {
          intent1 = new Intent(this, UniversityActivity.class);
          startActivity(intent1);
      }
       else if (view.getId() == R.id.btnVarsity) {
            intent1 = new Intent(this, UniversityActivity.class);
            startActivity(intent1);
        }
       /* else if (view.getId() == R.id.btnAdmin) {
            intent3 = new Intent(this, RegActivity.class);
            startActivity(intent3);
        } */
       /* else if (view.getId() == R.id.admin_section_btn) {
            Intent intent = new Intent(this, Admin_Activity.class);
            startActivity(intent);

        }*/
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.nav_share_app:
                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_TEXT,"https://play.google.com/store/apps/details?id=com.informer.habibcse25.qaai");
                startActivity(Intent.createChooser(shareIntent,"Share Using"));
                break;
            case R.id.nav_aboutUs:
                Intent intent = new Intent(this, AboutUsActivity.class);
                startActivity(intent);
                break;
            case R.id.nav_FeedBack:
                Intent intentFeedback = new Intent(this, NavFeedbackActivity.class);
                startActivity(intentFeedback);
                break;
            /*case R.id.nav_admin:
                Intent intentAdmin = new Intent(this, Admin_Activity.class);
                startActivity(intentAdmin);
                break;*/
            case R.id.nav_help:
                Intent intentHelp = new Intent(this, NavHelpActivity.class);
                startActivity(intentHelp);
                break;
        }

        return true;
    }
}
