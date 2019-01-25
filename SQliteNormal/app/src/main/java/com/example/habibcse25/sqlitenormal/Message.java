package com.example.habibcse25.sqlitenormal;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by HabibCse25 on 04-Jan-19.
 */

public class Message {
    public static void MsgShow(Context context,String m_sg){
        Toast.makeText(context,m_sg,Toast.LENGTH_LONG).show();
    }
}
