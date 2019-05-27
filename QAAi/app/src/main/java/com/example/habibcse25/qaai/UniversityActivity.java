package com.example.habibcse25.qaai;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class UniversityActivity extends AppCompatActivity implements View.OnClickListener{
    Dialog connection_error_Dialog;
    ImageView imgVwConnectionDialog_error,imgVwConnectionDialog_close,ImgVwPublic,ImgVwPrivate,ImgVwEngr;
    TextView txtvw_net_connection_Title;
    Button btnPublic,btnPrivate,btnEngr,btn_connection_error;
    Intent intentPublic,intentPrivate,intentEngr;
    Toolbar toolbarUniv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_university);

       btnPublic = findViewById(R.id.btnPublic);
        ImgVwPublic = findViewById(R.id.ImgVwPublic);
        btnEngr = findViewById(R.id.btnEngr);
        ImgVwEngr = findViewById(R.id.ImgVwEngr);
        btnPrivate = findViewById(R.id.btnPrivate);
        ImgVwPrivate = findViewById(R.id.ImgVwPrivate);

        btnPublic.setOnClickListener(this);
        btnEngr.setOnClickListener(this);
        btnPrivate.setOnClickListener(this);
        ImgVwPublic.setOnClickListener(this);
        ImgVwEngr.setOnClickListener(this);
        ImgVwPrivate.setOnClickListener(this);


        toolbarUniv = findViewById(R.id.univ_toolbar);
        setSupportActionBar(toolbarUniv);
        getSupportActionBar().setTitle("University Categories");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.ImgVwPublic){
            if (check_Internet_Connection()) {

                intentPublic = new Intent(this,PublicActivity.class);
                startActivity(intentPublic);

            }
            else {

                showDialog();
            }


        }
        else if(view.getId()==R.id.ImgVwEngr){

            if (check_Internet_Connection()) {

                intentEngr = new Intent(this,EngrActivity.class);
                startActivity(intentEngr);

            }
            else {

                showDialog();
            }

        }
       else if(view.getId()==R.id.btnVarsity){
            if (check_Internet_Connection()) {

                intentPublic = new Intent(this,PublicActivity.class);
                startActivity(intentPublic);

            }
            else {

                showDialog();
            }


        }
        else if(view.getId()==R.id.btnEngr){

            if (check_Internet_Connection()) {

                intentEngr = new Intent(this,EngrActivity.class);
                startActivity(intentEngr);

            }
            else {

                showDialog();
            }

        }
       else if(view.getId()==R.id.btnPrivate){
            if (check_Internet_Connection()) {

                intentPrivate = new Intent(this,PrivateActivity.class);
                startActivity(intentPrivate);

            }
            else {

                showDialog();
            }


        }


        else{
            if(view.getId()==R.id.ImgVwPrivate){
                if (check_Internet_Connection()) {

                    intentPrivate = new Intent(this,PrivateActivity.class);
                    startActivity(intentPrivate);

                }
                else {

                    showDialog();
                }


            }

        }


    }

    private void showDialog() {
        connection_error_Dialog = new Dialog(this);
        connection_error_Dialog.setContentView(R.layout.net_connection_dialog);
        imgVwConnectionDialog_error = connection_error_Dialog.findViewById(R.id.imgVw_net_connection_error);
        imgVwConnectionDialog_close = connection_error_Dialog.findViewById(R.id.ImgVw_connection_diaglog_close);
        btn_connection_error = connection_error_Dialog.findViewById(R.id.btn_net_connection_dialog);
        txtvw_net_connection_Title = connection_error_Dialog.findViewById(R.id.txtvw_net_connection_Title);

        imgVwConnectionDialog_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                connection_error_Dialog.dismiss();
            }
        });
        btn_connection_error.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                connection_error_Dialog.dismiss();
            }
        });

        connection_error_Dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        connection_error_Dialog.show();

    }

    private boolean check_Internet_Connection() {


        boolean connected = false;
        try {
            ConnectivityManager cm = (ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo nInfo = cm.getActiveNetworkInfo();
            connected = nInfo != null && nInfo.isAvailable() && nInfo.isConnected();
            return connected;
        } catch (Exception e) {
            Log.e("Connectivity Exception", e.getMessage());
        }
        return connected;
    }
}
