package com.example.misbahtimepicker2;


import androidx.appcompat.app.AppCompatActivity;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    EditText editText1,editText2;
    Button button1,button2;
    int Year,Month,Day,Hour,Minute;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = findViewById(R.id.ed1);
        editText2 = findViewById(R.id.ed2);
        button1 = findViewById(R.id.btn1);
        button2 = findViewById(R.id.btn2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DateTime(view);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DateTime(view);
            }
        });
    }
    public void DateTime(View v) {

        if (v == button1) {
            final Calendar c = Calendar.getInstance();
            Year = c.get(Calendar.YEAR);
            Month = c.get(Calendar.MONTH);
            Day = c.get(Calendar.DAY_OF_MONTH);
            DatePickerDialog datePickerDialog = new DatePickerDialog(this,
                    new DatePickerDialog.OnDateSetListener() {
                        @Override
                        public void onDateSet(DatePicker view, int year,
                                              int monthOfYear, int dayOfMonth) {

                            editText1.setText(dayOfMonth + "-" + (monthOfYear + 1) + "-" + year);

                        }
                    }, Year, Month, Day);
            datePickerDialog.show();
        }
        if (v == button2) {
            final Calendar c = Calendar.getInstance();
            Hour = c.get(Calendar.HOUR_OF_DAY);
            Minute = c.get(Calendar.MINUTE);
            TimePickerDialog timePickerDialog = new TimePickerDialog(this,
                    new TimePickerDialog.OnTimeSetListener() {
                        @Override
                        public void onTimeSet(TimePicker view, int hourOfDay,
                                              int minute) {

                            editText2.setText(hourOfDay + ":" + minute);
                        }
                    }, Hour, Minute, false);
            timePickerDialog.show();
        }
    }
}