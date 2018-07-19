package com.example.android.pocketlends;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    Button RButton, LButton;
    EditText LUsername, LPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // I really think i am setting variables(Hopefully)
       LUsername = (EditText)findViewById(R.id.username);
       LPassword = (EditText)findViewById(R.id.loginPswd);
       RButton = (Button)findViewById(R.id.RegistrationPageButton);
       LButton = (Button)findViewById(R.id.loginButton);

       LButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

           }
       });

        }
    }



}


