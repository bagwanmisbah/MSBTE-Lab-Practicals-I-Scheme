package com.example.zoomc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ZoomControls;

public class MainActivity extends AppCompatActivity {
    ZoomControls z;
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        z = findViewById(R.id.ZoomC);
        b1= findViewById(R.id.Show);
        b2 = findViewById(R.id.Hide);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                z.show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                z.hide();
            }
        });
    }
}