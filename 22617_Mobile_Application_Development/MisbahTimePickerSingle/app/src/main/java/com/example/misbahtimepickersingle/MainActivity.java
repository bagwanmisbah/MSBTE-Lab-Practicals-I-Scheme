package com.example.misbahtimepickersingle;

import androidx.appcompat.app.AppCompatActivity;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TimePicker;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    EditText editText1;
    Button button1;
    int Hour,Minute;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = findViewById(R.id.ed1);
        button1 = findViewById(R.id.btn1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DateTime(view);
            }
        });
    }
    public void DateTime(View v)
    {
        if (v == button1) {
            final Calendar c = Calendar.getInstance();
            Hour = c.get(Calendar.HOUR_OF_DAY);
            Minute = c.get(Calendar.MINUTE);
            TimePickerDialog timePickerDialog = new TimePickerDialog(this,
                    new TimePickerDialog.OnTimeSetListener() {
                        @Override
                        public void onTimeSet(TimePicker view, int hourOfDay,
                                              int minute) {

                            editText1.setText(hourOfDay + ":" + minute);
                        }
                    }, Hour, Minute, false);
            timePickerDialog.show();
        }
    }
}