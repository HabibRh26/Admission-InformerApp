package lict.willow.relativelayoutexample;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import lict.willow.relativelayoutexample.model.Student;

public class MainActivity extends AppCompatActivity {

    EditText eTUsername, eTPhoneNo, eTEmail, eTCgpa;
    ListView listView;
    ArrayList<Student> studentArrayList;
    ArrayAdapter<Student> adapter;
    ImageView imageViewCgpa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialization();

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String details = studentArrayList.get(position).toStringForDialog();
                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                dialog.setTitle("Student Details").setMessage(details);
                dialog.setCancelable(false);
                dialog.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                dialog.show();

            }
        });
    }

    private void initialization() {
        eTUsername = findViewById(R.id.editTextUsername);
        eTPhoneNo = findViewById(R.id.editTextPhone);
        eTEmail = findViewById(R.id.editTextEmail);
        eTCgpa = findViewById(R.id.editTextCgpa);
        imageViewCgpa = findViewById(R.id.imageViewCGPA);
        listView = findViewById(R.id.listView);
        studentArrayList = new ArrayList<>();
        Glide.with(MainActivity.this).load("https://lh3.googleusercontent.com/6eAWUns27SsV6uomGR2D7kWqqh1Eg5Hz7ukB0QF4QOXOHnO1nlBFDpPAUNvCJZrvEys=w300")
                .into(imageViewCgpa);
        adapter = new ArrayAdapter<Student>(MainActivity.this, android.R.layout.simple_list_item_1,
                studentArrayList);
        listView.setAdapter(adapter);
    }

    public void saveData(View view) {
        boolean error = false;
        Float cgpa = null;
        String userName = eTUsername.getText().toString();
        String phoneNo = eTPhoneNo.getText().toString();
        String email = eTEmail.getText().toString();
        String cgpaStr = eTCgpa.getText().toString();

        if(userName.isEmpty()){
            eTUsername.setError("Username is missing!");
            error = true;
        }else{
            if(userName.length()<6){
                eTUsername.setError("Username is too short!");
                error = true;
            }
        }
        if(phoneNo.isEmpty()){
            eTPhoneNo.setError("Phone No is required!");
            error = true;
        }else if(phoneNo.length()==11){
            if(phoneNo.startsWith("017") || phoneNo.startsWith("019") || phoneNo.startsWith("018")){

            }else{
                eTPhoneNo.setError("Phone No is not valid!");
                error = true;
            }
        }else{
            eTPhoneNo.setError("Phone No should be 11 digit!");
            error = true;
        }
        if(email.isEmpty()){
            eTEmail.setError("Email is missing!");
            error = true;
        }else if(email.length()>30){
            eTEmail.setError("Email should have max 30 characters!");
            error = true;
        }
        if(cgpaStr.isEmpty()){
            eTCgpa.setError("CGPA is missing!");
        }else{
            cgpa = Float.parseFloat(cgpaStr);
            if(cgpa<4.0 && cgpa>0){

            }else{
                eTCgpa.setError("CGPA should be within 4.0!");
            }
        }
        if(error){
            Toast.makeText(MainActivity.this, "Please insert proper data!", Toast.LENGTH_LONG).show();
        }else{
            Student std = new Student(userName, email, phoneNo, cgpa);
            studentArrayList.add(std);
            adapter.notifyDataSetChanged();
            Toast.makeText(this, "Data is inserted!", Toast.LENGTH_SHORT).show();
        }
    }
}
