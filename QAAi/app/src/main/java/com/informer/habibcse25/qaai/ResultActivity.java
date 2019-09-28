package com.informer.habibcse25.qaai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.informer.habibcse25.qaai.R;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
    }

    public void viewResut(View view) {
        Intent resultIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/1OBeYCm8XM7LnD31vOm33ENOcDmzLRPgC"));
        startActivity(resultIntent);
    }
}
