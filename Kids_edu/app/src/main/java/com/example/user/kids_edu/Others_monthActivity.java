package com.example.user.kids_edu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

import com.example.user.kids_edu.Adapter.CustomAdapter_Months;
import com.example.user.kids_edu.Adapter.CustomAdapter_days;
import com.example.user.kids_edu.model.OthersMonthGridView;

import java.util.ArrayList;

public class Others_monthActivity extends AppCompatActivity {
    GridView gridViewMonths;
    ArrayList<OthersMonthGridView> monthGridView;
    ArrayAdapter<OthersMonthGridView> adpter_others_months;
    CustomAdapter_Months custmAdpter_months;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_others_month);
        gridViewMonths = findViewById(R.id.gridViewMonths);
        monthGridView = new ArrayList<>();
        custmAdpter_months = new CustomAdapter_Months(this,monthGridView);
        gridViewMonths.setAdapter(custmAdpter_months);
        initializeData();


    }

    private void initializeData() {
        OthersMonthGridView jan = new OthersMonthGridView(R.drawable.jan);
        OthersMonthGridView feb = new OthersMonthGridView(R.drawable.feb);
        OthersMonthGridView march = new OthersMonthGridView(R.drawable.march);
        OthersMonthGridView april = new OthersMonthGridView(R.drawable.april);
        OthersMonthGridView may = new OthersMonthGridView(R.drawable.may);
        OthersMonthGridView june = new OthersMonthGridView(R.drawable.june);
        OthersMonthGridView july = new OthersMonthGridView(R.drawable.july);
        OthersMonthGridView aug = new OthersMonthGridView(R.drawable.aug);
        OthersMonthGridView sept = new OthersMonthGridView(R.drawable.sept);
        OthersMonthGridView oct = new OthersMonthGridView(R.drawable.oct);
        OthersMonthGridView nov = new OthersMonthGridView(R.drawable.nov);
        OthersMonthGridView dec = new OthersMonthGridView(R.drawable.dec);

        monthGridView.add(jan);
        monthGridView.add(feb);
        monthGridView.add(march);
        monthGridView.add(april);
        monthGridView.add(may);
        monthGridView.add(june);
        monthGridView.add(july);
        monthGridView.add(aug);
        monthGridView.add(sept);
        monthGridView.add(oct);
        monthGridView.add(nov);
        monthGridView.add(dec);


    }
}
