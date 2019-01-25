package com.example.user.kids_edu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import com.example.user.kids_edu.Adapter.CustomAdapter_color;
import com.example.user.kids_edu.model.ColorImageGrid;

import java.util.ArrayList;

public class others_color_Activity extends AppCompatActivity {
    GridView gridView;
    ArrayList<ColorImageGrid> colorsImageGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_others_color_);

        gridView = findViewById(R.id.gridView);
        colorsImageGrid = new ArrayList<>();

        CustomAdapter_color adapter_color = new CustomAdapter_color(this,colorsImageGrid);

        gridView.setAdapter(adapter_color);
        setData();

    }
    private void setData() {

        ColorImageGrid color_black = new ColorImageGrid(R.drawable.black);
        ColorImageGrid color_blue = new ColorImageGrid(R.drawable.blue);
        ColorImageGrid color_green = new ColorImageGrid(R.drawable.green);
        ColorImageGrid color_orange = new ColorImageGrid(R.drawable.oran);
        ColorImageGrid color_pink = new ColorImageGrid(R.drawable.pink);
        ColorImageGrid color_red = new ColorImageGrid(R.drawable.red);
        ColorImageGrid color_violet = new ColorImageGrid(R.drawable.violet);
        ColorImageGrid color_yellow = new ColorImageGrid(R.drawable.yellow);

        colorsImageGrid.add(color_black);
        colorsImageGrid.add(color_blue);
        colorsImageGrid.add(color_green);
        colorsImageGrid.add(color_orange);
        colorsImageGrid.add(color_yellow);
        colorsImageGrid.add(color_pink);
        colorsImageGrid.add(color_red);
        colorsImageGrid.add(color_violet);

    }
    }

