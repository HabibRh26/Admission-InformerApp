package com.example.habibcse25.sqlitedb;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText userName,password;
    DB_AdapterCls db_adapterCls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userName = findViewById(R.id.editTxtName);
        password = findViewById(R.id.editTxtPass);

        db_adapterCls = new DB_AdapterCls(this);

    }

    public void addUser(View view) {
        String user = userName.getText().toString();
        String pass = password.getText().toString();
       long id = db_adapterCls.insertData(user,pass);

       if(id<0){
           Toast.makeText(this,"unsuccessful and return value is neg from row insertion",Toast.LENGTH_SHORT).show();
       }
       else{
           Toast.makeText(this,"successful insertion in row",Toast.LENGTH_SHORT).show();
       }
    }
}
