package lict.wg.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String value = getIntent().getStringExtra("hi");
        int intVal = getIntent().getIntExtra("intval", 0);
        Toast.makeText(this, value+"\n"+intVal, Toast.LENGTH_LONG).show();
    }
}
