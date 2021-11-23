package com.example.recycler_adapter_final_tutorial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.programminglist);
        //set layout Mnager
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //set adapter
        String[] lang = {"Java","javascript","Python","DBMS","HTML","CSS","SQL","Java","javascript","Python","DBMS","HTML","CSS","SQL"};
        recyclerView.setAdapter(new Recycle_Adapter(lang));
    }
}