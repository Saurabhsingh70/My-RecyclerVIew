package com.example.recycler_adapter_final_tutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class Onclick_check extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onclick_check);
        
        Intent intent = getIntent();
        String name = intent.getStringExtra("txttitle");

        Toast.makeText(this, "name", Toast.LENGTH_SHORT).show();
    }
}