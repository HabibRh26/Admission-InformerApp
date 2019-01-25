package com.example.user.activitylifecycle;

import android.content.Intent;
import android.renderscript.ScriptGroup;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

//import com.awesomedialog.blennersilva.awesomedialoglibrary.AwesomeErrorDialog;

import lict.wg.activitylifecycle.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showToast("On create!");

    }

    public void onStart() {

        super.onStart();
    }
    private void showToast(String s) {
    }

    public void jump(View view) {
        Intent intent =new Intent(MainActivity.this,Main2Activity.class);
        intent.putExtra("hi","hello from first activity");
        intent.putExtra("intVal",420);
        startActivity(intent);

    }


}
