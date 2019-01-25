package com.example.habibcse25.actionbar;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setIcon(R.mipmap.chrome);
        actionBar.setTitle(" browser chrome");
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.download:
                Toast.makeText(this,"download  clicked",Toast.LENGTH_SHORT).show();
                break;
            case R.id.refresh:
                Toast.makeText(this,"refresh clicked",Toast.LENGTH_SHORT).show();
            case R.id.send:
                Toast.makeText(this,"send clicked",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this,Main2Activity.class));
        }
        return super.onOptionsItemSelected(item);
    }
}
