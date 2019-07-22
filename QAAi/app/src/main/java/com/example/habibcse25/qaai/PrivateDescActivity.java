package com.example.habibcse25.qaai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.habibcse25.qaai.Model_clss.DataToFirebase;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class PrivateDescActivity extends AppCompatActivity {
DatabaseReference dbRef;
TextView textPrivate1,textPrivate2;
Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_private_desc);


        int index = getIntent().getIntExtra("position",0);
        textPrivate1 = findViewById(R.id.textPrivat1);
        textPrivate2 = findViewById(R.id.textPrivat2);


        dbRef = FirebaseDatabase.getInstance().getReference("Univ_Private");
        if(index ==0){
            dbRef.child("NSU").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    DataToFirebase univ_Name = dataSnapshot.getValue(DataToFirebase.class);
                    DataToFirebase univ_details  = dataSnapshot.getValue(DataToFirebase.class);

                    textPrivate1.setText(univ_Name.getuniv_Name()+": ");
                   textPrivate2.setText(univ_details.getuniv_details());

                }

                @Override
                public void onCancelled(DatabaseError databaseError) {

                }
            });

        }
    }
}
