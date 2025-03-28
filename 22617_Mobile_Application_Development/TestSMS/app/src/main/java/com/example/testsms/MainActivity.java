package com.example.testsms;
import androidx.appcompat.app.AppCompatActivity;
import android.telephony.SmsManager;
import android.widget.Button;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;
import android.view.View;
public class MainActivity extends AppCompatActivity
{
    EditText mobiletxt;
    EditText msgtxt;
    Button btnsms;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mobiletxt = findViewById(R.id.mobiletxt);
        msgtxt = findViewById(R.id.msgtxt);
        btnsms = findViewById(R.id.btnsms);
        btnsms.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                try
                {
                    SmsManager smgr = SmsManager.getDefault();
                    smgr.sendTextMessage(mobiletxt.getText().toString(), null, msgtxt.getText().toString(), null, null);
                    Toast.makeText(MainActivity.this, "Sms sent successfully", Toast.LENGTH_SHORT).show();
                } catch (Exception e)
                {
                    Toast.makeText(MainActivity.this, "Sms failed to send", Toast.LENGTH_LONG).show();

                }
            }
        });
    }
}

