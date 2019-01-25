package com.example.user.tablayoutfrag.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by User on 3/10/2018.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {
    ArrayList<Fragment>fragmentArrayList;
    ArrayList<String>TabTitleList;

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return null;
    }

    @Override
    public int getCount() {
        return 0;
    }
    public void AddFragment(Fragment fragment,String title){
        fragmentArrayList.add(fragment);
        TabTitleList.add(title);

    }


}

