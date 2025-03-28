package com.example.misbahe27_1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText p,u;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        p=findViewById(R.id.pas);
        u=findViewById(R.id.usr);
        b=findViewById(R.id.b1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (u.getText().toString().equals("MISBAH") & p.getText().toString().equals("90673")){
                    Toast.makeText( getApplicationContext(),"Username and password is correct",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText( getApplicationContext(),"Wrong username and Password",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}