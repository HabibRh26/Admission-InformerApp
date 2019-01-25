package com.example.habibcse25.qaai;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;

public class RegActivity extends AppCompatActivity implements View.OnClickListener {
    EditText ETmail,ETpassword;
    TextView textLogin;
    Button btnsignup;
    ProgressBar progressBar;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mAuth = FirebaseAuth.getInstance();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);
        ETmail = findViewById(R.id.adminEmail);
        ETpassword = findViewById(R.id.password);
        progressBar = findViewById(R.id.progressbar);
        btnsignup = findViewById(R.id.btnsignup);
        textLogin = findViewById(R.id.textLogin);
        findViewById(R.id.textLogin).setOnClickListener(this);
        findViewById(R.id.btnsignup).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnsignup :
                registerUser();
                break;
            case R.id.textLogin :
                startActivity(new Intent(this,MainActivity.class));

        }

    }

    private void registerUser() {
        String adminEmail = ETmail.getText().toString().trim();
        String adminPassword = ETpassword.getText().toString().trim();
        if(adminEmail.isEmpty()){
            ETmail.setError("Email is required");
            ETmail.requestFocus();
            return;
        }
        if(!Patterns.EMAIL_ADDRESS.matcher(adminEmail).matches()){
            ETmail.setError("please enter a valid mail");
            ETmail.requestFocus();
            return;
        }
        if(adminPassword.isEmpty()){
            ETpassword.setError("Password is required");
            ETpassword.requestFocus();
            return;
        }
        if(adminPassword.length()<6){
            ETpassword.setError("Minimum length of password should be 6");
            ETpassword.requestFocus();
            return;

        }
        progressBar.setVisibility(View.VISIBLE);
        mAuth.createUserWithEmailAndPassword(adminEmail, adminPassword).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    progressBar.setVisibility(View.GONE);
                    Toast.makeText(getApplicationContext(),"your reg successful",Toast.LENGTH_SHORT).show();
                }
                else if(task.getException() instanceof FirebaseAuthUserCollisionException){
                    Toast.makeText(getApplicationContext(),"you are already registered",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),"some error occured",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
