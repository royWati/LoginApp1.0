package com.abdihakim.loginapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Container extends AppCompatActivity {

    Button btn_scroll,btn_nested,btn_app_bar;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.container);

        btn_scroll=findViewById(R.id.btn_scrollview);
        btn_nested=findViewById(R.id.btn_nestedscrollview);
        btn_app_bar=findViewById(R.id.btn_appbar);

        btn_scroll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Container.this,ScrollView.class);
                startActivity(intent);
            }
        });
    }
}
