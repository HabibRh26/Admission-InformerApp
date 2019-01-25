package com.example.user.kids_edu;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.user.kids_edu.Adapter.ViewPagerAdapter;
import com.example.user.kids_edu.Fragment.BanglaFragment;
import com.example.user.kids_edu.Fragment.EnglishFragment;
import com.example.user.kids_edu.Fragment.HomeFragment;
import com.example.user.kids_edu.Fragment.MathFragment;
import com.example.user.kids_edu.Fragment.OthersFragment;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    TabLayout tablayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        tablayout = findViewById(R.id.tablayout);
        viewPager = findViewById(R.id.viewPager);

        setSupportActionBar(toolbar);
        setDataToViewPager();

        tablayout.setupWithViewPager(viewPager);
    }

    private void setDataToViewPager() {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new HomeFragment(),"Home");
        adapter.addFragment(new EnglishFragment(),"English");
        adapter.addFragment(new MathFragment(),"Math");
        adapter.addFragment(new OthersFragment(),"Others");


        viewPager.setAdapter(adapter);
    }

}
