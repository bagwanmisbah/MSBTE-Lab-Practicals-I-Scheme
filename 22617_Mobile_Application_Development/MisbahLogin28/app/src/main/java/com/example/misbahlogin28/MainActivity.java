package com.example.misbahlogin28;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    EditText p,u;
    Button b;
    String UserName="misbah",Password="767676";
    static int a = 0;
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
                if (TextUtils.isEmpty(u.getText().toString()) && TextUtils.isEmpty(p.getText().toString())){
                    a++;
                    Toast.makeText(MainActivity.this, "Username and Password Field are Empty", Toast.LENGTH_SHORT).show();
                }
                else if (TextUtils.isEmpty(u.getText().toString())){
                    a++;
                    Toast.makeText(MainActivity.this, "Username field is Empty", Toast.LENGTH_SHORT).show();
                }
                else if (TextUtils.isEmpty(p.getText().toString())){
                    a++;
                    Toast.makeText(MainActivity.this, "Password field is Empty", Toast.LENGTH_SHORT).show();
                }
                else if (u.getText().toString().equals(UserName) & p.getText().toString().equals(Password)){
                    Toast.makeText( getApplicationContext(),"Login successful ",Toast.LENGTH_SHORT).show();
                }
                else{
                    a++;
                    Toast.makeText( getApplicationContext(),"Login unsuccessful and unsuccessful attempts "+a,Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

