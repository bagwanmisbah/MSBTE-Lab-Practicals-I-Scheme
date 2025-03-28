package com.example.misbahdialer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.lang.String;

public class MainActivity extends AppCompatActivity {
    Button button;
    Intent intent;
    EditText ed1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=findViewById(R.id.ed1);
        button = findViewById(R.id.btn);
        String str=ed1.getText().toString();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Uri u=Uri.parse("tel:"+ed1.getText().toString());
                intent=new Intent(Intent.ACTION_DIAL,u);
                startActivity(intent);
            }
        });
    }
}