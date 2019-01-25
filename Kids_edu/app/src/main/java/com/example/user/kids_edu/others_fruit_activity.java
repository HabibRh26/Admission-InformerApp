package com.example.user.kids_edu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import com.example.user.kids_edu.Adapter.CustomAdapter_others_fruit;
import com.example.user.kids_edu.model.FruitImageGrid;

import java.util.ArrayList;

public class others_fruit_activity extends AppCompatActivity {
    GridView gridView;
    ArrayList<FruitImageGrid> fruitImgGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_others_fruit_activity);
        gridView = findViewById(R.id.GridViewFruit);
        fruitImgGrid = new ArrayList<>();

        CustomAdapter_others_fruit adapter_fruit = new CustomAdapter_others_fruit(this,fruitImgGrid);

        gridView.setAdapter(adapter_fruit);
        setData();
    }

    private void setData() {
        FruitImageGrid apple = new FruitImageGrid(R.drawable.apple);
        FruitImageGrid banana = new FruitImageGrid(R.drawable.banana);
        FruitImageGrid jackfruit01 = new FruitImageGrid(R.drawable.jackfruit01);
        FruitImageGrid lichi = new FruitImageGrid(R.drawable.lichi);
        FruitImageGrid mango = new FruitImageGrid(R.drawable.mango);
        FruitImageGrid orange = new FruitImageGrid(R.drawable.fruit_orange);
        FruitImageGrid pine_apple = new FruitImageGrid(R.drawable.pine_apple);
        FruitImageGrid strawberry = new FruitImageGrid(R.drawable.strawberry);



        fruitImgGrid.add(apple);
        fruitImgGrid.add(banana);
        fruitImgGrid.add(jackfruit01);
        fruitImgGrid.add(lichi);
        fruitImgGrid.add(mango);
        fruitImgGrid.add(orange);
        fruitImgGrid.add(pine_apple);
        fruitImgGrid.add(strawberry);

    }
}
