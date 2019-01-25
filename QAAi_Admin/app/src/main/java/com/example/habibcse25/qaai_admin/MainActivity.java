package com.example.habibcse25.qaai_admin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button btn;
    TextView txtview;
    DatabaseReference DbReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);
        editText = findViewById(R.id.editTxt);
        txtview = findViewById(R.id.txtview);
      /*  DbReference = FirebaseDatabase.getInstance().getReference("qaai");

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = editText.getText().toString().trim();
                DbReference.child("Name").setValue(name);

            }
        });*/
        DbReference = FirebaseDatabase.getInstance().getReference("qaai");
        DbReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String name = dataSnapshot.getValue().toString();
                txtview.setText(name);


            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

    }
}
