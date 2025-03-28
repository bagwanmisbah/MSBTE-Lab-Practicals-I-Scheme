package com.example.misbahpracticebluetooth;

import androidx.appcompat.app.AppCompatActivity;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Set;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity
{
Button b1,b2,b3,b4;
private BluetoothAdapter BA;
private Set<BluetoothDevice> pairedDevices;
ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        BA=BluetoothAdapter.getDefaultAdapter();
        lv=findViewById(R.id.lv);
    }
    public void on(View v)
    {
       if(!BA.isEnabled())
       {
           Intent turnon=new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
           startActivityForResult(turnon,0);
           Toast.makeText(getApplicationContext(),"Turned ON",Toast.LENGTH_LONG).show();
       }
       else
       {
           Toast.makeText(getApplicationContext(),"Already ON",Toast.LENGTH_LONG).show();
       }
    }
    public void off(View v)
    {
        BA.disable();
        Toast.makeText(getApplicationContext(),"Turned Off",Toast.LENGTH_LONG).show();
    }
    public void getVisible(View v)
    {
        Intent getVisible=new Intent(BluetoothAdapter.ACTION_REQUEST_DISCOVERABLE);
        startActivityForResult(getVisible,0);
    }
    public void list(View v)
    {
        pairedDevices=BA.getBondedDevices();
        ArrayList list=new ArrayList();
        for(BluetoothDevice bt:pairedDevices)list.add(bt.getName());
        Toast.makeText(getApplicationContext(),"Showing devices",Toast.LENGTH_SHORT).show();
        final ArrayAdapter a=new ArrayAdapter(this,android.R.layout.simple_list_item_1,list);
        lv.setAdapter(a);
    }
}
