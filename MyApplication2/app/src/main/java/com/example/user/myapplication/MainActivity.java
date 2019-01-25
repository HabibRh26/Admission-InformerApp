package com.example.user.myapplication;

import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.user.myapplication.model.Mycls;

import org.w3c.dom.Text;

import java.io.File;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button toastbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toastbtn = findViewById(R.id.toastbtn);

        toastbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("this is custom toast");
            }
        });
    }

    private void showToast(String message) {
        View toastview = getLayoutInflater().inflate(R.layout.toast,(ViewGroup)findViewById(R.id.linlay));
        TextView msgtoast = toastview.findViewById(R.id.texttoast);
        msgtoast.setText(message);

        Toast toast = new Toast(MainActivity.this);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(toastview);
        toast.setGravity(Gravity.FILL_HORIZONTAL,0,0);
        toast.show();


    }

    public void btnmethod(View view) {
        Intent intent=null,chooser=null;
        String listofpic[] ;
        if(view.getId()==R.id.radiobtn1){
            try{
                File pictures = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
                 listofpic = pictures.list();
                Uri uri = null;
                ArrayList<Uri> uriArrayList = new ArrayList<Uri>();
                for(String picture: listofpic){
                    uri = Uri.parse("file://"+pictures.toString()+"/"+picture);
                    uriArrayList.add(uri);
                    intent = new Intent(Intent.ACTION_SEND_MULTIPLE);
                    intent.setType("image/*");
                    intent.putExtra(Intent.EXTRA_STREAM,uriArrayList);
                }

            }catch (Exception e){
                e.printStackTrace();
            }


            chooser = Intent.createChooser(intent,"send img using");
            startActivity(chooser);
    }
}

    public void toasting(View view) {

        Toast toast=Toast.makeText(this,"this is the toast",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.LEFT,100,200);
        toast.show();

    }
}
