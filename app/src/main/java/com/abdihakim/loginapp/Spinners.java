package com.abdihakim.loginapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Spinners extends AppCompatActivity{

    String[] names = {"Hakim","Joel","Chege","Newton","Dennis"};
    ArrayAdapter adapter;
    Spinner spinnerObj;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spinner);
        spinnerObj=findViewById(R.id.spinner);
        adapter = new ArrayAdapter(Spinners.this,android.R.layout.simple_list_item_1,names);
        adapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
        spinnerObj.setAdapter(adapter);


    }
}
