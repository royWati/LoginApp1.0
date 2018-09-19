package com.abdihakim.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.abdihakim.loginapp.adapters.gridViewAdapter;

public class GridView extends AppCompatActivity {

    int[] images ={R.mipmap.img_buy_goods,R.mipmap.img_buy_goods,
            R.mipmap.img_buy_goods,R.mipmap.img_buy_goods};
    String[] texts ={"Buy Goods","Pay Bill","Send To Mpesa","Buy Airtime"};


    android.widget.GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);

        gridView = findViewById(R.id.grid_view);

        gridViewAdapter adapter = new gridViewAdapter(GridView.this,
                images,texts);
        gridView.setAdapter(adapter);
    }
}
