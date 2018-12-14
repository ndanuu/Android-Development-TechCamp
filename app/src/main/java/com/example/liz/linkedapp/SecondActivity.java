package com.example.liz.linkedapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {
    Button rudi ,third;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        rudi=findViewById(R.id.btnBack);
        third=findViewById(R.id.button);
         rudi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SecondActivity.this,MainActivity.class);
                startActivity(intent);

            }
        });
         third.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
              Intent intent=new Intent(SecondActivity.this,ThirdActivity.class);
              startActivity(intent);
             }
         });

    }
}
