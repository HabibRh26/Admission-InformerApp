package com.example.user.tablayoutfrag;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TableLayout;

import com.example.user.tablayoutfrag.adapter.ViewPagerAdapter;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    TableLayout tableLayout;
    ViewPager viwPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.tablayoutID);
        tableLayout = findViewById(R.id.tablayoutID);
        viwPager = findViewById(R.id.viewPager);

        setSupportActionBar(toolbar);
        setDataToViewPager();

    }

    private void setDataToViewPager() {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.AddFragment();

    }
}
