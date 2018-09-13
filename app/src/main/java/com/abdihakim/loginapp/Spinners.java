package com.abdihakim.loginapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class Spinners extends AppCompatActivity{

    String[] names = {"Hakim","Joel","Chege","Newton","Dennis"};
    ArrayAdapter adapter;
    Spinner spinnerObj;

    Button btn_next;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spinner);
        spinnerObj=findViewById(R.id.spinner);
        adapter = new ArrayAdapter(Spinners.this,android.R.layout.simple_list_item_1,names);
        adapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
        spinnerObj.setAdapter(adapter);
        btn_next=findViewById(R.id.btn_next);

        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Spinners.this,Container.class);
                startActivity(intent);
            }
        });

        spinnerObj.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Snackbar.make(view,
                        "You selected "+names[position],Snackbar.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
