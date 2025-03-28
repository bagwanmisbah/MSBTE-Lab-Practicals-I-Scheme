package com.example.misbah18_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        textView = findViewById(R.id.text1);
        Bundle bundle = getIntent().getExtras();
        int a = Integer.parseInt(bundle.getString("st"));
        textView.setText("Factorial "+Factorial(a));
    }
    public int Factorial(int a){
        if (a==0) {
            return 1;
        }
        else{
            return a * Factorial(a-1);
        }
    }
}