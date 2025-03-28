package com.example.misbahlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    ListView lang;
    String[] str={"Android","Java","Php","Hadoop","Sap","Python",
            "Ajax","C++","Ruby","Rails","Javascript","HTML","XML","CSS"};
    ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lang = findViewById(R.id.lst);
        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,str);
        lang.setAdapter(adapter);
        lang.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, ""+str[i], Toast.LENGTH_SHORT).show();
            }
        });

    }
}