package com.example.habibcse25.qaai;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.habibcse25.qaai.Model_clss.DataToFirebase;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class DataSendActivity extends AppCompatActivity implements View.OnClickListener {
    EditText univ_Name,univ_details;
    Button sendDataFirebase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_send);
        univ_Name = findViewById(R.id.editTxtVarsityName);
        univ_details = findViewById(R.id.edittxtDetails);
        sendDataFirebase = findViewById(R.id.sendDataFirebase);
        sendDataFirebase.setOnClickListener(DataSendActivity.this);
       /* String var_name = univ_Name.getText().toString();
        String var_details = univ_details.getText().toString();*/

    }

    private void saveToFirebaseDB() {
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference dbRef = database.getReference("Univ_Circulars");
        String Univ_ID = dbRef.push().child(univ_Name.getText().toString()).getKey();

        DataToFirebase dataToFirebase = new DataToFirebase(univ_Name.getText().toString(),univ_details.getText().toString());
        dbRef.child(Univ_ID).setValue(dataToFirebase);
    }

    @Override
    public void onClick(View view) {
        saveToFirebaseDB();
        Toast.makeText(getApplicationContext(),"Data Sent to Firebase",Toast.LENGTH_SHORT).show();

    }
}
