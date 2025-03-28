package com.example.misbahsqlexp26;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText name, mobile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.name);
        mobile = findViewById(R.id.number);
    }

    public void submit(View view) {

        SqliteHelper sql = new SqliteHelper(getApplicationContext(), "StudentData", null, 1);
        long r = sql.SaveStudentInfo(name.getText().toString(), mobile.getText().toString());

        if(r>0){
            Toast.makeText(this,"Record Saved Successfully",Toast.LENGTH_SHORT).show();

        }
        else{
            Toast.makeText(this,"Record not Saved",Toast.LENGTH_SHORT).show();
        }

    }
}


