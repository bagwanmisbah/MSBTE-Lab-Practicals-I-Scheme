package com.example.misbahdatepickersingle;

import androidx.appcompat.app.AppCompatActivity;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    EditText editText1;
    Button button1;
    int Year,Month,Day;
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

    }
}