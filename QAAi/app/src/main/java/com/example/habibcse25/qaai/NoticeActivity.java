package com.example.habibcse25.qaai;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.habibcse25.qaai.Model_clss.NoticeData_to_firebase;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class NoticeActivity extends AppCompatActivity {
    DatabaseReference dbRef;
    TextView txtVwNotice,txtVw_NoticeUniv_Name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notice);
        txtVwNotice = findViewById(R.id.txtVw_Notice);
        txtVw_NoticeUniv_Name = findViewById(R.id.txtVw_NoticeUniv_Name);
        dbRef = FirebaseDatabase.getInstance().getReference("Univ_Notice");
       /* Intent intent = getIntent();
        String UniName = intent.getStringExtra("univName");*/

       /* if(UniName.equals("BUET")){
            dbRef.child("BUET").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    NoticeData_to_firebase univ_Name = dataSnapshot.getValue(NoticeData_to_firebase.class);
                    NoticeData_to_firebase univ_Notice  = dataSnapshot.getValue(NoticeData_to_firebase.class);

                    txtVw_NoticeUniv_Name.setText(univ_Name.getUniv_Name()+": ");
                    txtVwNotice.setText(univ_Notice.getUniv_Notice());

                }

                @Override
                public void onCancelled(DatabaseError databaseError) {

                }
            });
        }*/

        dbRef.child("CUET").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                NoticeData_to_firebase univ_Name = dataSnapshot.getValue(NoticeData_to_firebase.class);
                NoticeData_to_firebase univ_Notice  = dataSnapshot.getValue(NoticeData_to_firebase.class);

                txtVw_NoticeUniv_Name.setText(univ_Name.getUniv_Name()+": ");
                txtVwNotice.setText(univ_Notice.getUniv_Notice());

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

    }
}
