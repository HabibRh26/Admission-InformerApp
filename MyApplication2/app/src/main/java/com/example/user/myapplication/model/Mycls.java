package com.example.user.myapplication.model;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by HabibCse25 on 5/26/2018.
 */

public class Mycls {
    public static void m(String message){
        Log.d("vivz",message);
    }
    public static void s(Context context, String message){
        Toast.makeText(context,message,Toast.LENGTH_SHORT).show();
    }
}
