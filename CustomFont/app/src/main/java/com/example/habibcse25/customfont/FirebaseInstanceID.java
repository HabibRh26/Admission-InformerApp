package com.example.habibcse25.customfont;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by HabibCse25 on 7/31/2018.
 */

public class FirebaseInstanceID extends FirebaseInstanceIdService {
    private static final String REG_TOKEN = "REG_TOKEN";
    @Override
    public void onTokenRefresh() {

        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d(REG_TOKEN,refreshedToken);


        sendRegistrationToServer(refreshedToken);
    }


    public void sendRegistrationToServer(String token) {

    }
}
