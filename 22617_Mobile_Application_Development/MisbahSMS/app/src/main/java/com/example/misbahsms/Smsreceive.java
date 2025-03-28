package com.example.misbahsms;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.telephony.SmsMessage;
import android.widget.Toast;
import android .content.Intent;

public class Smsreceive extends BroadcastReceiver {
    @Override
    public void onReceive(Context context,Intent intent)
    {
        Bundle bundle=intent.getExtras();
        Object messages[]=(Object[])bundle.get("");
        SmsMessage[] smsMessage =new SmsMessage[messages.length];
        for(int n=0;n<messages.length;n++)
        {
            smsMessage[n]= SmsMessage.createFromPdu((byte[])messages[n]);

        }
        Toast toast=Toast.makeText(context,"Recieved SMS :"+smsMessage[0].getMessageBody(),Toast.LENGTH_LONG);
        toast.show();

    }
}



