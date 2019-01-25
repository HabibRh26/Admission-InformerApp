package com.example.user.kids_edu.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    ArrayList<Fragment> fragmentArrayList = new ArrayList<>();
    ArrayList<String> tabTitleList = new ArrayList<>();

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentArrayList.get(position);
    }

    @Override
    public int getCount() {

        return fragmentArrayList.size();
    }
    @Override
    public String  getPageTitle(int position){
        return tabTitleList.get(position);
    }
    public void addFragment(Fragment fragment, String title){
        fragmentArrayList.add(fragment);
        tabTitleList.add(title);

    }
}

