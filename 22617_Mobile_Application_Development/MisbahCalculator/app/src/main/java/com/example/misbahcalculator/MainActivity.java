package com.example.misbahcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4;
    TextView t1;
    EditText e1,e2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.btn1);
        b2 = findViewById(R.id.btn2);
        b3 = findViewById(R.id.btn3);
        b4 = findViewById(R.id.btn4);
        t1 = findViewById(R.id.txt2);
        e1 = findViewById(R.id.ede1);
        e2 = findViewById(R.id.ede2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float a = Float.parseFloat(e1.getText().toString());
                Float b = Float.parseFloat(e2.getText().toString());
                Float c = a+b;
                t1.setText("Addition "+c);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float a = Float.parseFloat(e1.getText().toString());
                Float b = Float.parseFloat(e2.getText().toString());
                Float c = a-b;
                t1.setText("Subtraction "+c);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float a = Float.parseFloat(e1.getText().toString());
                Float b = Float.parseFloat(e2.getText().toString());
                Float c = a*b;
                t1.setText("Multiplication "+c);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float a = Float.parseFloat(e1.getText().toString());
                Float b = Float.parseFloat(e2.getText().toString());
                Float c = a/b;
                t1.setText("Division "+c);
            }
        });
    }
}