package com.example.habibcse25.listviw_searchview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String deptArray[] = getResources().getStringArray(R.array.deptList);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,deptArray);
        listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);


    }
    @override
    public boolean onCreateOptionsMenu(Menu menu){

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.search_option,menu);
        MenuItem item = menu.findViewById(R.id.);
        SearchView searchView = (SearchView)item.getActionView();

    }
}
