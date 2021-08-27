package com.example.vignesh_interface;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menucategory extends AppCompatActivity {
    public Button button1,button2,button3,button4,button5,button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menucategory);
        button1=(Button) findViewById(R.id.button1);
        button2=(Button) findViewById(R.id.button2) ;
        button3=(Button) findViewById(R.id.button3) ;
        button4=(Button) findViewById(R.id.button4) ;
        button5=(Button) findViewById(R.id.button5) ;
        button6=(Button) findViewById(R.id.button6) ;
        
        button1.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Menucategory.this,SubCategory1.class);
                startActivity(intent);
            }
        }));

        button2.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Menucategory.this,SubCategory2.class);
                startActivity(intent);
            }
        }));

        button3.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Menucategory.this,SubCategory3.class);
                startActivity(intent);
            }
        }));

        button4.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Menucategory.this,SubCategory4.class);
                startActivity(intent);
            }
        }));

        button5.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Menucategory.this,SubCategory5.class);
                startActivity(intent);
            }
        }));

        button6.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Menucategory.this,SubCategory6.class);
                startActivity(intent);
            }
        }));
    }
}