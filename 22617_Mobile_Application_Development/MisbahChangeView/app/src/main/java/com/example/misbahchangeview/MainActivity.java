package com.example.misbahchangeview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Button button;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        imageView = findViewById(R.id.image);
    }
    public void ChangeImg(View view){
        imageView.setImageResource(R.drawable.gomac);
    }
}