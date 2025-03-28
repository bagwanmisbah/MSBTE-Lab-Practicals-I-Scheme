package com.example.misbahbroadcastrecievertimezone;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class TimeZoneChangedReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        String actionstr= intent.getAction();
        Toast.makeText(context,actionstr, Toast.LENGTH_SHORT).show();
    }
}
