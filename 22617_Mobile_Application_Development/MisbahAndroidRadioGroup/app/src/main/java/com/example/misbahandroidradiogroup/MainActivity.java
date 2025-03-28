package com.example.misbahandroidradiogroup;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Button;
import android.view.View;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity
{
    Button btn1;
RadioGroup rg1;
RadioButton rgb;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg1=findViewById(R.id.rg1);
        btn1=findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                int a=rg1.getCheckedRadioButtonId();
                rgb=findViewById(a);
                String str="";
                str=str+ " "+rgb.getText();
                Toast.makeText(MainActivity.this,str,Toast.LENGTH_LONG).show();
            }
        });

    }
}
