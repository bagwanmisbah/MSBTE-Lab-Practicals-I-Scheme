package com.example.mycoredatabase1;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity
{
    EditText rollno,stud_name,branch,marks,percentage;
    TextView txt1;
    MyCoreDatabase myCoreDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rollno=findViewById(R.id.ed1);
        stud_name=findViewById(R.id.ed2);
        branch=findViewById(R.id.ed3);
        marks=findViewById(R.id.ed4);
        percentage=findViewById(R.id.ed5);
        txt1=findViewById(R.id.txt1);
        myCoreDatabase=new MyCoreDatabase(this);
    }
    public void doSave(View view)
    {
        myCoreDatabase.insertData
                (
                Integer.parseInt(rollno.getText().toString()),
                stud_name.getText().toString().trim(),
                branch.getText().toString().trim(),
                Integer.parseInt(marks.getText().toString()),
                Integer.parseInt(percentage.getText().toString())
                );
    }
    public void doLoad(View view)
    {
        myCoreDatabase.getAll(txt1);
    }
}
