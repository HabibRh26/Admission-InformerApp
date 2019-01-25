package com.example.user.kids_edu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.user.kids_edu.Adapter.CustmAdpter_math_digits;
import com.example.user.kids_edu.Adapter.CustomAdapter_days;
import com.example.user.kids_edu.Adapter.CustomAdapter_math_table;
import com.example.user.kids_edu.model.MathDigitListView;
import com.example.user.kids_edu.model.OthersDaysListView;

import java.util.ArrayList;

public class others_days_Activity extends AppCompatActivity {
    ListView listViewDays;
    ArrayList<OthersDaysListView> daysListView;
    ArrayAdapter<OthersDaysListView> adpter_others_days;
    CustomAdapter_days custmAdpter_days;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_others_days_);

        listViewDays = findViewById(R.id.listViewDays);
        daysListView = new ArrayList<>();
        custmAdpter_days = new CustomAdapter_days(this,daysListView);
        listViewDays.setAdapter(custmAdpter_days);
        initializeData();
    }
        private void initializeData() {
            OthersDaysListView sat = new OthersDaysListView(R.drawable.sat);
            OthersDaysListView sun = new OthersDaysListView(R.drawable.sun);
            OthersDaysListView mon = new OthersDaysListView(R.drawable.mon);
            OthersDaysListView tues = new OthersDaysListView(R.drawable.tues);
            OthersDaysListView wed = new OthersDaysListView(R.drawable.wed);
            OthersDaysListView thrus = new OthersDaysListView(R.drawable.thrus);
            OthersDaysListView fri = new OthersDaysListView(R.drawable.fri);

            daysListView.add(sat);
            daysListView.add(sun);
            daysListView.add(mon);
            daysListView.add(tues);
            daysListView.add(wed);
            daysListView.add(thrus);
            daysListView.add(fri);


        }
    }

