package com.abdihakim.loginapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadiosAndCheckBoxes extends AppCompatActivity {

    RadioGroup radioGroupGender;
    RadioButton rd_female,rd_male;

    CheckBox ch_email,ch_sms,ch_push;
    Button next_ui;

    @Override
    protected void onCreate(Bundle bundle){
        super.onCreate(bundle);
        setContentView(R.layout.radios_and_checkboxes);
        setTitle(R.string.radio_and_checkboxes_title);

        radioGroupGender=findViewById(R.id.group_gender);
        rd_female=findViewById(R.id.radio_female);
        rd_male=findViewById(R.id.radio_male);

        ch_email=findViewById(R.id.ch_get_emails);
        ch_sms=findViewById(R.id.ch_sms);
        ch_push=findViewById(R.id.ch_enable_push);

        next_ui=findViewById(R.id.btn_next);

        next_ui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RadiosAndCheckBoxes.this,Spinners.class));
            }
        });

        radios();

        checks(ch_email,"email notification");
        checks(ch_sms,"Sms notification");
        checks(ch_push,"Push notification");
    }

    public void radios(){

        radioGroupGender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(rd_female.isChecked())
                    Toast.makeText(getApplicationContext(),
                            "Female has been checked",Toast.LENGTH_SHORT).show();
                else if(rd_male.isChecked())
                    Toast.makeText(getApplicationContext(),
                            "Male has been checked",Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void checks(CheckBox checkBox, final String notification_type){

        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(((CheckBox)v).isChecked())Toast.makeText(getApplicationContext(),notification_type+" is enabled",
                        Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(getApplicationContext(),notification_type+" is disabled",
                            Toast.LENGTH_SHORT).show();
            }
        });
    }


    public void btn(){

    }
}
