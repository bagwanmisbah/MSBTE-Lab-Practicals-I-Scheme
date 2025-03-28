package com.example.misbahcustomtoastalertorder;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox c1,c2,c3;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c1 = findViewById(R.id.cb1);
        c2 = findViewById(R.id.cb2);
        c3 = findViewById(R.id.cb3);
        button = findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            String str = "Selected Items:";
            int Total = 0;
            @Override
            public void onClick(View view) {
                if (c1.isChecked()){
                    str = str + "\n" +c1.getText().toString()+" 200Rs";
                    Total = 200;
                }
                if (c2.isChecked()){
                    str = str + "\n" +c2.getText().toString()+" 50Rs";
                    Total = Total + 50;
                }
                if (c3.isChecked()){
                    str = str + "\n" +c3.getText().toString()+" 120Rs";
                    Total = Total + 120;
                }
                if (Total != 0){
                    str = str + "\nTotal " + Total + "Rs";
                }
                Toast.makeText(MainActivity.this, str, Toast.LENGTH_SHORT).show();
                Total = 0;
                str = "Selected Items:";
            }
        });
    }
}