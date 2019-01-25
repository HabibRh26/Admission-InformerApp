package lict.willow.relativelayoutexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText eTUsername, eTPhoneNo, eTEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eTUsername = findViewById(R.id.editTextUsername);
        eTPhoneNo = findViewById(R.id.editTextPhone);
        eTEmail = findViewById(R.id.editTextEmail);
    }

    public void saveData(View view) {
        String userName = eTUsername.getText().toString();
        String phoneNo = eTPhoneNo.getText().toString();
        String email = eTUsername.getText().toString();

        if(userName.isEmpty()){
            eTUsername.setError("Username is missing!");
        }else{
            if(userName.length()<6){
                eTUsername.setError("Username is too short!");
            }
        }

        if(phoneNo.isEmpty()){
            eTPhoneNo.setError("Phone No is required!");
        }else if(phoneNo.length()==11){
            if(phoneNo.startsWith("017") || phoneNo.startsWith("019") || phoneNo.startsWith("018")){

            }else{
                eTPhoneNo.setError("Phone No is not valid!");
            }
        }else{
            eTPhoneNo.setError("Phone No should be 11 digit!");
        }
    }
}
