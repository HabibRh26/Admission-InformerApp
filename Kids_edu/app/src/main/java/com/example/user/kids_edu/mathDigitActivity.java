package com.example.user.kids_edu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.user.kids_edu.Adapter.CustmAdpter_math_digits;
import com.example.user.kids_edu.model.MathDigitListView;

import java.util.ArrayList;

public class mathDigitActivity extends AppCompatActivity {
       ListView listViewDigits;
    ArrayList<MathDigitListView> mathDigitListView;
    ArrayAdapter<MathDigitListView> Adapter_MathDigits;
    CustmAdpter_math_digits custmAdpter_math_digits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_digit);

        listViewDigits = findViewById(R.id.listViewDigits);
        mathDigitListView = new ArrayList<>();
        custmAdpter_math_digits = new CustmAdpter_math_digits(this,mathDigitListView);
        listViewDigits.setAdapter(custmAdpter_math_digits);
        initializeData();

    }

    private void initializeData() {
        MathDigitListView digit_zero = new MathDigitListView(R.raw.zero,R.drawable.d0);
        MathDigitListView digit_one = new MathDigitListView(R.raw.one,R.drawable.d1);
        MathDigitListView digit_two = new MathDigitListView(R.raw.two,R.drawable.d2);
        MathDigitListView digit_three = new MathDigitListView(R.raw.three,R.drawable.d3);
        MathDigitListView digit_four = new MathDigitListView(R.raw.four,R.drawable.d4);
        MathDigitListView digit_five = new MathDigitListView(R.raw.five,R.drawable.d5);
        MathDigitListView digit_six = new MathDigitListView(R.raw.six,R.drawable.d6);
        MathDigitListView digit_seven = new MathDigitListView(R.raw.seven,R.drawable.d7);
        MathDigitListView digit_eight = new MathDigitListView(R.raw.eight,R.drawable.d8);
        MathDigitListView digit_nine = new MathDigitListView(R.raw.nine,R.drawable.d9);

        mathDigitListView.add(digit_zero);
        mathDigitListView.add(digit_one);
        mathDigitListView.add(digit_two);
        mathDigitListView.add(digit_three);
        mathDigitListView.add(digit_four);
        mathDigitListView.add(digit_five);
        mathDigitListView.add(digit_six);
        mathDigitListView.add(digit_seven);
        mathDigitListView.add(digit_eight);
        mathDigitListView.add(digit_nine);




    }
}
