package com.example.misbahcircularpb1;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    Button btn1;
    ProgressBar pb1;
    protected void onCreate(Bundle SavedInstanceState)
    {
        super.onCreate(SavedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=findViewById(R.id.btn1);
        pb1=findViewById(R.id.pb1);
        btn1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                pb1.setVisibility(View.VISIBLE);
            }
        });
    }
}