package com.example.misbahtogglebutton1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.tbt1);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean a= t1.isChecked();
                if(a){
                    t1.setText("Current Status is On");
                }
                else{
                    t1.setText("Current Status is Off");
                }
            }
        });
    }
}
