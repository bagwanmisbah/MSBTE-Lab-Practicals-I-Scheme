package com.example.misbahservices;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void start(View v){
        Intent intent = new Intent(this,MyServices.class);
        startService(intent);
    }
    public void stop(View v){
        Intent intent = new Intent(this,MyServices.class);
        startService(intent);
    }
}

