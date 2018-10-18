package com.example.ummiiii.androidlearner;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;

public class Register extends AppCompatActivity {
    EditText e1, e2;
    FirebaseAuth auth;
    Button btnlogin;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        
        e1 = (EditText) findViewById(R.id.signup1);
        e2 = (EditText) findViewById(R.id.signup2);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        btnlogin = (Button) findViewById(R.id.loginhere);
        auth = FirebaseAuth.getInstance();
    }

    public void createUser(View view) {

        String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
        String email = e1.getText().toString().trim();
        String password  = e2.getText().toString().trim();



        if(TextUtils.isEmpty(email)||!email.matches(emailPattern)){
            Toast.makeText(this,"Please enter a valid email i.e xyz@gmail.com.com",Toast.LENGTH_LONG).show();
            return;
        }
        if(TextUtils.isEmpty(password) || password.length()<8 ){
            Toast.makeText(this,"Please enter a valid password, your password must be 8 characters long",Toast.LENGTH_LONG).show();
            return;
        }



        if (e1.getText().toString().equals("") && e2.getText().toString().equals("")) {
            Toast.makeText(getApplicationContext(), "Blank not allowed", Toast.LENGTH_LONG).show();
        } else {

            progressBar.setVisibility(View.VISIBLE);
            auth.createUserWithEmailAndPassword(email, password)
                    .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            progressBar.setVisibility(View.GONE);
                            if (task.isSuccessful()) {
                                Toast.makeText(getApplicationContext(), "User Created Successfully", Toast.LENGTH_LONG).show();

                                finish();
                                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                                startActivity(i);
                            } else {
                                Toast.makeText(getApplicationContext(), "User could not be created", Toast.LENGTH_LONG).show();
                            }

                        }
                    });
        }
    }
        public void loginhere (View view){
            Intent i = new Intent(getApplicationContext(), login.class);
            startActivity(i);
        }

    }
