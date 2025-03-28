package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    Button button;
    CheckBox a,b,c,d,e;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        a=findViewById(R.id.checkbox);
        b=findViewById(R.id.checkbox1);
        c=findViewById(R.id.checkbox2);
        d=findViewById(R.id.checkbox3);
        e=findViewById(R.id.checkbox4);

    }
    public void show(View view){
        String str = "";
        if (a.isChecked()){
            str=a.getText().toString();
        }
        if (b.isChecked()){
            str=str+" "+b.getText().toString();
        }
        if (c.isChecked()){
            str=str+" "+c.getText().toString();
        }
        if (d.isChecked()){
            str=str+" "+d.getText().toString();
        }
        if (e.isChecked()){
            str=str+" "+e.getText().toString();
        }
        str="BOOKS SELECTED ARE :"+str;
        Toast.makeText(MainActivity.this,str,Toast.LENGTH_LONG).show();
    }

}
