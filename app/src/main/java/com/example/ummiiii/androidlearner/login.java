package com.example.ummiiii.androidlearner;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class login extends AppCompatActivity {
    EditText e1,e2;
    FirebaseAuth auth;
    Button btnsingup;
    Button reset;
    ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        e1= (EditText)findViewById(R.id.login1);
        e2 = (EditText)findViewById(R.id.login2);
        btnsingup = (Button)findViewById(R.id.signuphere);
        reset = (Button)findViewById(R.id.btn_reset_password);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        auth = FirebaseAuth.getInstance();

        if(auth.getCurrentUser() != null){
            //close this activity
            finish();
            //opening profile activity
            startActivity(new Intent(getApplicationContext(), MainActivity.class));
        }

    }

    public void loginUser(View view){

        if (e1.getText().toString().equals("")&& e2.getText().toString().equals("")){
            Toast.makeText(getApplicationContext(),"Blank fields not allowed",Toast.LENGTH_LONG).show();
        }

        else {
            progressBar.setVisibility(View.VISIBLE);
            auth.signInWithEmailAndPassword(e1.getText().toString(),e2.getText().toString())
                    .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            progressBar.setVisibility(View.GONE);
                            if(task.isSuccessful()){
                                Toast.makeText(getApplicationContext(),"User Logged in Successfully",Toast.LENGTH_LONG).show();

                                finish();
                                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                                startActivity(i);
                            }
                            else
                            {
                                Toast.makeText(getApplicationContext(),"User could not be Logged in",Toast.LENGTH_LONG).show();
                            }

                        }
                    });
        }

    }
    public void SignUphere(View view){
        Intent i = new Intent(getApplicationContext(),Register.class);
        startActivity(i);
    }
    public  void ResetPassword (View view){
        Intent i = new Intent(getApplicationContext(),resetpassword.class);
        startActivity(i);
    }
}