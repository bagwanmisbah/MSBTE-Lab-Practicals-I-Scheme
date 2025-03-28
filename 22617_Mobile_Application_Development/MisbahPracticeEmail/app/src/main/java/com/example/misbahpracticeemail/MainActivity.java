package com.example.misbahpracticeemail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity
{
    EditText sendto,subject,msg;
    Button b1;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sendto=findViewById(R.id.sendto);
        subject=findViewById(R.id.subject);
        msg=findViewById(R.id.msg);
        b1=findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String emailsendto=sendto.getText().toString();
                String emailsubject=sendto.getText().toString();
                String msg=sendto.getText().toString();
                Intent intent=new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_SUBJECT,emailsubject);
                intent.putExtra(Intent.EXTRA_TEXT,msg);
                intent.putExtra(Intent.EXTRA_EMAIL,new String[]{emailsendto });
                intent.setType("message/rfc822");
                startActivity(Intent.createChooser(intent, "Choose an Email client :"));

            }
        });
    }
}
