package com.abdihakim.loginapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class registration extends AppCompatActivity {
    EditText ed_name, ed_email, ed_password, ed_confpass;
    Button ed_register;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        ed_name = findViewById(R.id.name);
        ed_email = findViewById(R.id.email);
        ed_password = findViewById(R.id.password);
        ed_confpass = findViewById(R.id.confirmpass);
        ed_register = findViewById(R.id.button2);

        ed_register.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View v) {
         String pass= ed_password.getText().toString();
         String conf = ed_confpass.getText().toString();


         if(pass.equals(conf)){


             Toast.makeText(getApplicationContext(),"Password match",Toast.LENGTH_SHORT).show();

             Intent intentObj=
                     new Intent(registration.this,RadiosAndCheckBoxes.class);
             startActivity(intentObj);
         }
         else{

            Toast.makeText(getApplicationContext(),"Password dont match",Toast.LENGTH_SHORT).show();
         }
     }
 });
    }
}