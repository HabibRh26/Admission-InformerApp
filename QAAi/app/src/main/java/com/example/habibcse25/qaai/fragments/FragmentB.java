package com.example.habibcse25.qaai.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.habibcse25.qaai.Model_clss.DataToFirebase;
import com.example.habibcse25.qaai.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

/**
 * Created by HabibCse25 on 8/4/2018.
 */

public class FragmentB extends Fragment {
    TextView txtview;
    DatabaseReference dbRef;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.public_frag_b, container, false);
        txtview = view.findViewById(R.id.txtview);
        dbRef = FirebaseDatabase.getInstance().getReference("Univ_Circulars");

        dbRef.child("BUET").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                DataToFirebase univ_Name = dataSnapshot.getValue(DataToFirebase.class);
                DataToFirebase univ_details = dataSnapshot.getValue(DataToFirebase.class);


                txtview.setText(univ_details.getuniv_details());

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        return view;
    }


    public void changeData(int index) {
       /* String description[]= getResources().getStringArray(R.array.description);*/
        dbRef = FirebaseDatabase.getInstance().getReference("Univ_Circulars");
        if(index ==1){
            dbRef.child("KUET").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    DataToFirebase univ_Name = dataSnapshot.getValue(DataToFirebase.class);
                    DataToFirebase univ_details = dataSnapshot.getValue(DataToFirebase.class);


                    txtview.setText(univ_details.getuniv_details());

                }

                @Override
                public void onCancelled(DatabaseError databaseError) {

                }
            });

        }



        /*txtview.setText(description[position]);*/



    }
}
