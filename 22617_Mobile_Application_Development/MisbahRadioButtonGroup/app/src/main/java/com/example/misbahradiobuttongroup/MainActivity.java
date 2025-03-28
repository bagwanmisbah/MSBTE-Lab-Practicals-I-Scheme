package com.example.misbahradiobuttongroup;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Button btn1;
    RadioButton rb1, rb2, rb3;
    RadioGroup rg1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btn1);
        rb1 = findViewById(R.id.rb1);
        rb2 = findViewById(R.id.rb2);
        rg1 = findViewById(R.id.rg1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
             int a=rg1.getCheckedRadioButtonId();
             rb3.findViewById(a);
             String str="Selected Radio Button : ";
             if(rb1.isChecked())
             {
                 str=str + " " +rb1.getText();
             }
             if(rb2.isChecked())
             {
                 str=str + " " +rb1.getText();
             }
             str=str+ " "+rb3.getText();

            }
        });
    }
}