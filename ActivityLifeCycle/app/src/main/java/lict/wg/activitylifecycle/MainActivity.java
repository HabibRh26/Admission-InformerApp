package lict.wg.activitylifecycle;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showToast("On Create!");
    }
    @Override
    public void onStart(){
        super.onStart();
        showToast("On Start!");
    }
    @Override
    public void onResume(){
        super.onResume();
        showToast("On Resume!");
    }
    @Override
    public void onPause(){
        super.onPause();
        showToast("On Pause!");
    }
    @Override
    public void onStop(){
        super.onStop();
        showToast("On Stop!");
    }
    @Override
    public void onDestroy(){
        super.onDestroy();
        showToast("On Destroy!");
    }

    @Override
    public void onBackPressed(){
        AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
        dialog.setTitle("EXIT!").setMessage("Do you want to exit from this useless App?").setCancelable(false);
        dialog.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        dialog.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        dialog.show();
    }

    public void jump(View view) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("hi", "Hello from first activity!");
        intent.putExtra("intval", 420);
        startActivity(intent);
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
