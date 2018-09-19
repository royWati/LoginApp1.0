package com.abdihakim.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.abdihakim.loginapp.adapters.gridViewAdapter;
import com.abdihakim.loginapp.adapters.utilitiesAdapter;

public class GridView extends AppCompatActivity {

    int[] images ={R.mipmap.img_electricty_bill,
            R.mipmap.img_water_bill,
            R.mipmap.img_mobile_bill
            ,R.mipmap.img_landline_bill
            ,R.mipmap.img_live_tv
            ,R.mipmap.img_internet};
    String[] texts ={"ELECTRICITY","WATER","MOBILE","LANDLINE","CABLE TV","INTERNET"};

    int[] images_tickets ={R.mipmap.img_movie,
            R.mipmap.img_event_ticket,
            R.mipmap.img_sport};
    String[] texts_tickets = {"MOVIE","EVENT","SPORT"};
    android.widget.GridView gridView,gridViewTickets;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_paybill);

        gridView = findViewById(R.id.grid_utilities);
        gridViewTickets = findViewById(R.id.grid_tickets);

        utilitiesAdapter adapter = new utilitiesAdapter(GridView.this,
                images,texts);
        gridView.setAdapter(adapter);

        utilitiesAdapter adapter_tickets = new utilitiesAdapter(GridView.this,
                images_tickets,texts_tickets);
        gridViewTickets.setAdapter(adapter_tickets);

    }
}
