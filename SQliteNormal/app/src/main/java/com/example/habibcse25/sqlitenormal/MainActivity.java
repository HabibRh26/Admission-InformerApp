package com.example.habibcse25.sqlitenormal;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    DB_helperCls helperCls;
    EditText name,surname,marks,updateID;
    Button updatebtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        helperCls = new DB_helperCls(this);

        name = findViewById(R.id.editTxtName);
        surname = findViewById(R.id.editTxtSurName);
        marks = findViewById(R.id.editTxtMarks);
        updateID = findViewById(R.id.updateID);
        updatebtn = findViewById(R.id.updatebtn);

        updatebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String id = updateID.getText().toString();
                String nm = name.getText().toString();
                String surnm = surname.getText().toString();
                int mark =  Integer.parseInt(marks.getText().toString());

              Boolean ans =  helperCls.updateData(id,nm,surnm,mark);
              if(ans){
                  Toast.makeText(MainActivity.this,"update compeleted successfully",Toast.LENGTH_LONG).show();
              }
              else
              {
                  Toast.makeText(MainActivity.this,"update operation failed",Toast.LENGTH_LONG).show();
              }

            }
        });
    }
    public void deleteData(View view) {
        String id = updateID.getText().toString();
        Boolean rslt = helperCls.delMethod(id);
        if(rslt){
            Toast.makeText(MainActivity.this,"Delete compeleted successfully",Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(MainActivity.this,"Delete operation failed",Toast.LENGTH_LONG).show();
        }



    }

    public void save(View view) {
        String nm = name.getText().toString();
        String surnm = surname.getText().toString();
        int mark =  Integer.parseInt(marks.getText().toString());

        long id = helperCls.insertData(nm,surnm,mark);
        if(id<0){
            Message.MsgShow(this,"successful data insertion in db");
        }
        else{
            Message.MsgShow(this,"successful data insertion in db");
        }

    }

    public void getData(View view) {
        SQLiteDatabase db = helperCls.getWritableDatabase();

        Cursor cursor = db.rawQuery("select * from Mystudnt",null);
        int nameCol = cursor.getColumnIndex("NAME");
        int surnameCol  = cursor.getColumnIndex("SURNAME");
        int marksCol = cursor.getColumnIndex("MARKS");

        cursor.moveToFirst();
        String retrievedData = " ";
        if((cursor!=null) && cursor.getCount()>0 ){
            do{
                String nameC = cursor.getString(nameCol);
                String surnameC = cursor.getString(surnameCol);
                String marksC = cursor.getString(marksCol);

                retrievedData = retrievedData +"name : "+ nameC+" surname : "+surnameC+" marks : "+marksC+"\n";


            }while (cursor.moveToNext());
            Toast.makeText(this,retrievedData,Toast.LENGTH_LONG).show();

        }
        else{
            Toast.makeText(this,"error in showing data",Toast.LENGTH_LONG).show();
        }

    }



}
