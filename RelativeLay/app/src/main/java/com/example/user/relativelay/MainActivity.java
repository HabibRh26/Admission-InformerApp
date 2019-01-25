package com.example.user.relativelay;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.user.relativelay.Database.DB_Helper;
import com.example.user.relativelay.adapter.CustomAdapter;

import java.util.ArrayList;

import static android.R.layout.simple_list_item_1;

public class MainActivity extends AppCompatActivity {

    EditText eTuserName,eTphoneNo,eTCGPA,eTPassword;
    ImageView imgViewcgpa;
    ListView listViewstu;
    ArrayList<Student> arLiStudent;
    CustomAdapter aadapter;
   /* ArrayAdapter<Student> adapter;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eTuserName =(EditText) findViewById(R.id.editUsername);
        eTphoneNo =(EditText) findViewById(R.id.editphoneNo);
        eTCGPA = (EditText)findViewById(R.id.editcgpa);
        eTPassword =(EditText) findViewById(R.id.editPassword);
        imgViewcgpa=findViewById(R.id.imgViewcgpa);

        listViewstu=(ListView) findViewById(R.id.listViewStduents);

        DB_Helper db_helper = new DB_Helper(MainActivity.this);
        arLiStudent=db_helper.getAllstuData();

        listener();

        Glide.with(MainActivity.this).load("https://lh3.googleusercontent.com/6eAWUns27SsV6uomGR2D7kWqqh1Eg5Hz7ukB0QF4QOXOHnO1nlBFDpPAUNvCJZrvEys=w300")
                .into(imgViewcgpa);



       /* adapter=new ArrayAdapter<Student>(MainActivity.this, simple_list_item_1,arLiStudent);
        listViewstu.setAdapter(adapter);*/
         aadapter =new CustomAdapter(MainActivity.this,arLiStudent);
        listViewstu.setAdapter(aadapter);


    }
    public void listener(){
        listViewstu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String details = arLiStudent.get(position).infoDialog();
                AlertDialog.Builder dialog=new AlertDialog.Builder(MainActivity.this);
                dialog.setTitle("student details");
                dialog.setMessage(details);
                dialog.setCancelable(false);
                dialog.setPositiveButton("done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                dialog.show();


            }
        });
    }

    public void saveData(View view) {
     //  if (view.getId()==R.id.buttonsave) {


            Student stu = new Student();
            stu.setName(eTuserName.getText().toString());
            stu.setCGPA(Float.parseFloat(eTCGPA.getText().toString()));
            stu.setPhoneNo(eTphoneNo.getText().toString());
            stu.setPassword(eTPassword.getText().toString());
        boolean error=false;
       String user = eTuserName.getText().toString();
      if(user.isEmpty()){
           eTuserName.setError("userName is missing!");
           error=true;

       }
       else if(user.length()<6){
           eTuserName.setError("userName is too short!");
           error=true;


       }
       String phon = eTphoneNo.getText().toString();
       if(phon.isEmpty()){
           eTphoneNo.setError("phone No is missing !");
           error=true;
       }else if(phon.length()==11){
           if(phon.startsWith("018")||phon.startsWith("017")||phon.startsWith("019")){

           }
           else eTphoneNo.setError("phone num is not valid ");
       }
       else {
           eTphoneNo.setError("phone No should be 11 digit!");
           error=true;

       }

        String cg = eTCGPA.getText().toString();
        Float cgpa=null;

       String pass = eTPassword.getText().toString();
       if(cg.isEmpty()){
           eTCGPA.setError("this is field is empty!");
           error=true;
       }else{
            cgpa = Float.parseFloat(cg);
           if(cgpa>4){
               eTCGPA.setError("CGPA cant be more than 4");
               error=true;
           }

       }
       String info=stu.toString();


        if(error){
            Toast.makeText(MainActivity.this,"Data missing!",Toast.LENGTH_LONG).show();

        }else{

           /* arLiStudent.add(stu);

            aadapter.notifyDataSetChanged();*/
            DB_Helper db = new DB_Helper(MainActivity.this);
            db.insertStudent(stu);
            arLiStudent.addAll(db.getAllstuData());
            Log.i("get",arLiStudent.toString());
            aadapter.notifyDataSetChanged();


           Toast.makeText(MainActivity.this,"Data inserted!",Toast.LENGTH_LONG).show();
        }




       // }
    }
}
