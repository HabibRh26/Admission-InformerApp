package com.example.imageslider;

import android.os.Handler;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.imageslider.adapter.SliderAdapter;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    //coding in flow
    //https://www.youtube.com/watch?v=Q2FPDI99-as
    //https://www.cheezycode.com/2016/01/android-countdown-timer-with-just-maths.html
    //https://www.youtube.com/watch?v=nL0k2usU7I8

    ViewPager Vpager;
    private SliderAdapter sliderAdapter;
    private boolean currentSituation = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Vpager = findViewById(R.id.vwPager);
        sliderAdapter = new SliderAdapter(this);
        Vpager.setAdapter(sliderAdapter);
       // for auto image sliding
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new MyTimer(),2000,2000);
    }
    //For auto image sliding
    public class MyTimer extends TimerTask{

        @Override
        public void run() {
            MainActivity.this.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    int pos = Vpager.getCurrentItem();

                    if(pos<2){
                        Vpager.setCurrentItem(pos+1);

                    }
                    else if(pos==2){
                        Vpager.setCurrentItem(0);
                    }
                }
            });
        }
    }

}