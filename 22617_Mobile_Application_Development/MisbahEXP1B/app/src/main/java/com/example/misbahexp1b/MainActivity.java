package com.example.misbahexp1b;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1;
    EditText t1,t2;
    TextView t3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.bt1);
        t1=findViewById(R.id.etxt1);
        t2=findViewById(R.id.etxt2);
        t3=findViewById(R.id.txt3);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Editable a= t1.getText();
                Editable b= t2.getText();
                t3.setText("Name:"+a+" Age:"+b);
            }
        });
    }
}
