package com.example.user.kids_edu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.user.kids_edu.Adapter.CustmAdpter_math_digits;
import com.example.user.kids_edu.Adapter.CustomAdapter_math_table;
import com.example.user.kids_edu.model.MathDigitListView;
import com.example.user.kids_edu.model.MathTableListView;

import java.util.ArrayList;

public class mathTableActivity extends AppCompatActivity {
    ListView listViewTable;
    ArrayList<MathTableListView> mathTableListView;
    ArrayAdapter<MathTableListView> Adapter_MathDigits;
    CustomAdapter_math_table custAdpter_math_table;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_table);
        listViewTable = findViewById(R.id.listViewTable);
        mathTableListView = new ArrayList<>();
        custAdpter_math_table = new CustomAdapter_math_table(this,mathTableListView);
        listViewTable.setAdapter(custAdpter_math_table);

        initializeData();
    }

    private void initializeData() {
        MathTableListView table_1 = new MathTableListView("Table of 1",R.drawable.table1);
        MathTableListView table_2 = new MathTableListView("Table of 2",R.drawable.table2);
        MathTableListView table_3 = new MathTableListView("Table of 3",R.drawable.table3);
        MathTableListView table_4 = new MathTableListView("Table of 4",R.drawable.table4);
        MathTableListView table_5 = new MathTableListView("Table of 5",R.drawable.table5);
        MathTableListView table_6 = new MathTableListView("Table of 6",R.drawable.table6);
        MathTableListView table_7 = new MathTableListView("Table of 7",R.drawable.table7);
        MathTableListView table_8 = new MathTableListView("Table of 8",R.drawable.table8);
        MathTableListView table_9 = new MathTableListView("Table of 9",R.drawable.table9);
        MathTableListView table_10 = new MathTableListView("Table of 10",R.drawable.table10);


        mathTableListView.add(table_1);
        mathTableListView.add(table_2);
        mathTableListView.add(table_3);
        mathTableListView.add(table_4);
        mathTableListView.add(table_5);
        mathTableListView.add(table_6);
        mathTableListView.add(table_7);
        mathTableListView.add(table_8);
        mathTableListView.add(table_9);
        mathTableListView.add(table_10);





    }
    }

