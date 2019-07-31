package com.example.habibcse25.qaai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.example.habibcse25.qaai.Model_clss.DataToFirebase;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

public class PublicDescActivity extends AppCompatActivity {
    DatabaseReference dbRef;
    Intent intent1;
    TextView textengr1;
    TextView textengr2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_public_desc);

        int index = getIntent().getIntExtra("positionMain",2);
        textengr1 = findViewById(R.id.txtvwVarsity);
        textengr2 = findViewById(R.id.txtvwVarsity2);

        dbRef = FirebaseDatabase.getInstance().getReference("Univ_Public");

        if(index ==0){
            dbRef.child("DU").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    DataToFirebase univ_Name = dataSnapshot.getValue(DataToFirebase.class);
                    DataToFirebase univ_details  = dataSnapshot.getValue(DataToFirebase.class);

                    textengr1.setText(univ_Name.getuniv_Name());
                    textengr2.setText(univ_details.getuniv_details());

                }

                @Override
                public void onCancelled(DatabaseError databaseError) {

                }
            });

        }
       if(index ==1){

           dbRef.child("JU").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    DataToFirebase univ_Name = dataSnapshot.getValue(DataToFirebase.class);
                    DataToFirebase univ_details  = dataSnapshot.getValue(DataToFirebase.class);

                    textengr1.setText(univ_Name.getuniv_Name());
                    textengr2.setText(univ_details.getuniv_details());

                }

                @Override
                public void onCancelled(DatabaseError databaseError) {

                }
            });

        }
        else if(index ==2){
            dbRef.child("JnU").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    DataToFirebase univ_Name = dataSnapshot.getValue(DataToFirebase.class);
                    DataToFirebase univ_details  = dataSnapshot.getValue(DataToFirebase.class);

                    textengr1.setText(univ_Name.getuniv_Name());
                    textengr2.setText(univ_details.getuniv_details());

                }

                @Override
                public void onCancelled(DatabaseError databaseError) {

                }
            });

        }
        else if(index ==3){
            dbRef.child("CU").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    DataToFirebase univ_Name = dataSnapshot.getValue(DataToFirebase.class);
                    DataToFirebase univ_details  = dataSnapshot.getValue(DataToFirebase.class);

                    textengr1.setText(univ_Name.getuniv_Name());
                    textengr2.setText(univ_details.getuniv_details());

                }

                @Override
                public void onCancelled(DatabaseError databaseError) {

                }
            });

        }
        else if(index ==4){
            dbRef.child("KU").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    DataToFirebase univ_Name = dataSnapshot.getValue(DataToFirebase.class);
                    DataToFirebase univ_details  = dataSnapshot.getValue(DataToFirebase.class);

                    textengr1.setText(univ_Name.getuniv_Name());
                    textengr2.setText(univ_details.getuniv_details());

                }

                @Override
                public void onCancelled(DatabaseError databaseError) {

                }
            });

        }
        else if(index ==5){
            dbRef.child("RU").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    DataToFirebase univ_Name = dataSnapshot.getValue(DataToFirebase.class);
                    DataToFirebase univ_details  = dataSnapshot.getValue(DataToFirebase.class);

                    textengr1.setText(univ_Name.getuniv_Name());
                    textengr2.setText(univ_details.getuniv_details());

                }

                @Override
                public void onCancelled(DatabaseError databaseError) {

                }
            });

        }
        else if(index ==6){
            dbRef.child("ComU").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    DataToFirebase univ_Name = dataSnapshot.getValue(DataToFirebase.class);
                    DataToFirebase univ_details  = dataSnapshot.getValue(DataToFirebase.class);

                    textengr1.setText(univ_Name.getuniv_Name());
                    textengr2.setText(univ_details.getuniv_details());

                }

                @Override
                public void onCancelled(DatabaseError databaseError) {

                }
            });

        }
        else if(index ==7){
            dbRef.child("BU").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    DataToFirebase univ_Name = dataSnapshot.getValue(DataToFirebase.class);
                    DataToFirebase univ_details  = dataSnapshot.getValue(DataToFirebase.class);

                    textengr1.setText(univ_Name.getuniv_Name());
                    textengr2.setText(univ_details.getuniv_details());

                }

                @Override
                public void onCancelled(DatabaseError databaseError) {

                }
            });

        }
        else if(index ==8){
            dbRef.child("Begum Rokeya Uni").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    DataToFirebase univ_Name = dataSnapshot.getValue(DataToFirebase.class);
                    DataToFirebase univ_details  = dataSnapshot.getValue(DataToFirebase.class);

                    textengr1.setText(univ_Name.getuniv_Name());
                    textengr2.setText(univ_details.getuniv_details());

                }

                @Override
                public void onCancelled(DatabaseError databaseError) {

                }
            });

        }
    }
}
