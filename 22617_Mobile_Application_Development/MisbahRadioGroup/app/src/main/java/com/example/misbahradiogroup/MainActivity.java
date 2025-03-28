package com.example.misbahradiogroup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    RadioGroup radioGroup;
    RadioButton radioButton,radioButton1,radioButton2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.btn);
        radioGroup = findViewById(R.id.radioG);
        radioButton = findViewById(R.id.radio);
        radioButton1 = findViewById(R.id.radio1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = radioGroup.getCheckedRadioButtonId();
                radioButton2 = findViewById(a);
                String str = "Selected Radio Button:";
                if (radioButton.isChecked()){
                    str = str + " " + radioButton.getText();
                }
                if (radioButton1.isChecked()){
                    str = str + " " + radioButton1.getText();
                }
                str = str + " " + radioButton2.getText();
                Toast.makeText(MainActivity.this,str,Toast.LENGTH_LONG).show();
            }
        });
    }
}