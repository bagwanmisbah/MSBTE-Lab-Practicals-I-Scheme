package com.example.misbahprogressbar2;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    Button button;
    ProgressDialog progressDoalog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.btn1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressDoalog = new ProgressDialog(MainActivity.this);
                progressDoalog.setMax(100);
                progressDoalog.setTitle("File downloading ...");
                progressDoalog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
                progressDoalog.show();
                new Thread(() -> {
                    try {
                        while (progressDoalog.getProgress() <= progressDoalog
                                .getMax()) {
                            Thread.sleep(200);
                            handle.sendMessage(handle.obtainMessage());
                            if (progressDoalog.getProgress() == progressDoalog
                                    .getMax()) {
                                progressDoalog.dismiss();
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }).start();
            }

            @SuppressLint("HandlerLeak")
            final Handler handle = new Handler() {
                @Override
                public void handleMessage(Message msg) {
                    super.handleMessage(msg);
                    progressDoalog.incrementProgressBy(1);
                }
            };
        });
    }
}
