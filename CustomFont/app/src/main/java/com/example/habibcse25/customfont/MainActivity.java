package com.example.habibcse25.customfont;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.messaging.FirebaseMessaging;

public class MainActivity extends AppCompatActivity {
    TextView txtvw;
    Button btn;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      //  txtvw = findViewById(R.id.myText);
        FirebaseMessaging.getInstance().subscribeToTopic("NEWS");

        btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                intent = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);

            }
        });

      /*  Typeface myfont = Typeface.createFromAsset(getAssets(),"fonts/BenSenHandwriting.ttf");
        txtvw.setTypeface(myfont);*/
    }
}
