package com.informer.habibcse25.qaai;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.informer.habibcse25.qaai.Model_clss.DataToFirebase;
import com.informer.habibcse25.qaai.Model_clss.NoticeData_to_firebase;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class DataSendActivity extends AppCompatActivity {
    EditText univ_Name, univ_details, NoticeUniName, NoticeDetails;
    Button sendDataFirebase, sendNoticeFirebase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_send);
        univ_Name = findViewById(R.id.editTxtVarsityName);
        univ_details = findViewById(R.id.edittxtDetails);
        sendDataFirebase = findViewById(R.id.sendDataFirebase);

        NoticeUniName = findViewById(R.id.Notice_univName);
        NoticeDetails = findViewById(R.id.Notice_univData);
        sendNoticeFirebase = findViewById(R.id.btnNoticeSend);
    }


    public void saveToFirebaseDB(View view) {
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference dbRef = database.getReference("Univ_Public");
        String Univ_ID = dbRef.push().child(univ_Name.getText().toString()).getKey();

        DataToFirebase dataToFirebase = new DataToFirebase(univ_Name.getText().toString(), univ_details.getText().toString());
        dbRef.child(Univ_ID).setValue(dataToFirebase);
        Toast.makeText(this,"Data sent successfully",Toast.LENGTH_LONG).show();

    }

    public void saveNoticeFirebase(View view) {
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference dbRef = database.getReference("Notice");
        String Univ_ID = dbRef.push().child(NoticeUniName.getText().toString()).getKey();

        NoticeData_to_firebase noticedataToFirebase = new NoticeData_to_firebase(NoticeUniName.getText().toString(), NoticeDetails.getText().toString());
        dbRef.child(Univ_ID).setValue(noticedataToFirebase);
        Toast.makeText(this,"Notice sent successfully",Toast.LENGTH_LONG).show();
    }
}