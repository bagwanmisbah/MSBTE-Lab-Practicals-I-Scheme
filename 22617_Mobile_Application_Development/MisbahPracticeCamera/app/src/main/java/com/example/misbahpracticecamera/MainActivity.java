package com.example.misbahpracticecamera;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity
{
    private static final int pic_id=123;
Button b1;
ImageView img1;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.b1);
        img1 = findViewById(R.id.img1);
        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent camera_intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(camera_intent, pic_id);
            }
        });
    }
    public void onActivityResult(int requestCode,int resultCode,Intent data)
    {
        MainActivity.super.onActivityResult(onActivityResult(requestCode,resultCode,data);
        if(requestCode==pic_id)
        {
            Bitmap photo = (Bitmap) data.getExtras().get("data");
            img1.setImageBitmap(photo);
        }
    }
}
