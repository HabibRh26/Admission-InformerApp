package com.example.habibcse25.qaai;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.example.habibcse25.qaai.Model_clss.DataToFirebase;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class EngrDescriptionActivity extends AppCompatActivity {
    Intent intent;
    TextView textengr1;
    TextView textengr2;
    DatabaseReference dbRef;
    Toolbar EngrDesc_univ_toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_engr_description);
        intent = getIntent();
       int index = intent.getIntExtra("position",0);
        textengr1 = findViewById(R.id.txtvwVarsity);
        textengr2 = findViewById(R.id.txtvwVarsity2);
        /*String desc[] = getResources().getStringArray(R.array.descEngr);
        textengr.setText(desc[index]);*/
        EngrDesc_univ_toolbar = findViewById(R.id.EngrDesc_univ_toolbar);
        setSupportActionBar(EngrDesc_univ_toolbar);
        getSupportActionBar().setTitle("Admission Circular");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            dbRef = FirebaseDatabase.getInstance().getReference("Univ_Circulars");
            if(index ==0){
                dbRef.child("BUET").addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        DataToFirebase univ_Name = dataSnapshot.getValue(DataToFirebase.class);
                        DataToFirebase univ_details  = dataSnapshot.getValue(DataToFirebase.class);

                        textengr1.setText(univ_Name.getuniv_Name()+": ");
                        textengr2.setText(univ_details.getuniv_details());

                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });

            }
       else if(index ==1){
            dbRef.child("KUET").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    DataToFirebase univ_Name = dataSnapshot.getValue(DataToFirebase.class);
                    DataToFirebase univ_details  = dataSnapshot.getValue(DataToFirebase.class);


                    textengr1.setText(univ_Name.getuniv_Name()+": ");
                    textengr2.setText(univ_details.getuniv_details());



                }

                @Override
                public void onCancelled(DatabaseError databaseError) {

                }
            });

        }
            else if(index ==2){
                dbRef.child("RUET").addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        DataToFirebase univ_Name = dataSnapshot.getValue(DataToFirebase.class);
                        DataToFirebase univ_details  = dataSnapshot.getValue(DataToFirebase.class);


                        textengr1.setText(univ_Name.getuniv_Name()+": ");
                        textengr2.setText(univ_details.getuniv_details());



                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });

            }
            else if(index ==1){
                dbRef.child("CUET").addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        DataToFirebase univ_Name = dataSnapshot.getValue(DataToFirebase.class);
                        DataToFirebase univ_details  = dataSnapshot.getValue(DataToFirebase.class);


                        textengr1.setText(univ_Name.getuniv_Name()+": ");
                        textengr2.setText(univ_details.getuniv_details());



                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });

            }



        }

    }

