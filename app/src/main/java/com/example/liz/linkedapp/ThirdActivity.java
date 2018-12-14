package com.example.liz.linkedapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {
    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        list=findViewById(R.id.ListOne);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ThirdActivity.this, "King at position"+position, Toast.LENGTH_SHORT).show();
                if (position==0){
                    Intent intent=new Intent(ThirdActivity.this,MainActivity.class);
                    startActivity(intent);
                }
                else if(position==1){
                    Intent intent=new Intent(ThirdActivity.this,MainActivity.class);
                    startActivity(intent);

                }else if (position==2){
                    Toast.makeText(ThirdActivity.this, "Add your Own stuffs", Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(ThirdActivity.this, "The rest Clicked", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
