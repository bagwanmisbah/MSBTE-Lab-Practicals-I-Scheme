package com.example.misbahtogglebuttonqb;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity
{
    Button btn1;
    ToggleButton tb1;
    protected void onCreate(Bundle SavedInstanceState)
    {
      super.onCreate(SavedInstanceState);
      setContentView(R.layout.activity_main);
      btn1=findViewById(R.id.btn1);
      tb1=findViewById(R.id.tb1);
      btn1.setOnClickListener(new View.OnClickListener()
      {
          @Override
          public void onClick(View view)
          {
              boolean a=tb1.isChecked();
              if(a)
              {
                  tb1.setText("ON");
              }
              else
              {
                  tb1.setText("OFF");
              }
          }
      });
    }
}