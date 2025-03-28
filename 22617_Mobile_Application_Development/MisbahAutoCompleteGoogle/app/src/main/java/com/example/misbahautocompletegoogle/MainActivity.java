package com.example.misbahautocompletegoogle;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;


public class MainActivity extends AppCompatActivity
{
    String a[]={"Misbah","Maths","Iqbal","Bagwan"};
    AutoCompleteTextView at;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        at=findViewById(R.id.at1);
        ArrayAdapter <String>  k = new ArrayAdapter <String>(this,android.R.layout.select_dialog_item,a);
        at.setAdapter(k);
        at.setThreshold(1);

    }
}
