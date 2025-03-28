package com.example.misbahautocompleteextviewsubjects;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    String a[] ={"MAD","EDE","ETI","PWP","WBP","CPE","MGT"};
    AutoCompleteTextView T;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        T = findViewById(R.id.txt);
        ArrayAdapter <String> k = new ArrayAdapter <String>(this,android.R.layout.select_dialog_item,a);
        T.setAdapter(k);
        T.setThreshold(1);
    }
}

