package com.example.misbahbluetoothgetvisible;
import androidx.appcompat.app.AppCompatActivity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Set;
public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4;
    ListView l1;
    BluetoothAdapter BA;
    Set<BluetoothDevice> pairedDevices;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.btn1);
        b2=findViewById(R.id.btn2);
        BA= BluetoothAdapter.getDefaultAdapter();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!BA.isEnabled())
                {
                    Intent turnOn=new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
                    startActivityForResult(turnOn,0);
                    Toast.makeText(getApplicationContext(), "Turned ON", Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(getApplicationContext(), "Already On", Toast.LENGTH_LONG).show();
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BA.disable();
                Toast.makeText(getApplicationContext(), "Turned Off", Toast.LENGTH_LONG).show();

            }

        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent getVisible=new Intent(BluetoothAdapter.ACTION_REQUEST_DISCOVERABLE);
                startActivityForResult(getVisible,0);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pairedDevices =BA.getBondedDevices();
                ArrayList List=new ArrayList();
                for(BluetoothDevice bt : (pairedDevices))List.add(bt.getName());
                Toast.makeText(getApplicationContext(), "Showing Paired Device", Toast.LENGTH_SHORT).show();
                final ArrayAdapter adapter=new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,List);
                l1.setAdapter(adapter);
            }
        });
    }

}

