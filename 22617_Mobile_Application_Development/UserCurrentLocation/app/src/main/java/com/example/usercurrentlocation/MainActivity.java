package com.example.usercurrentlocation;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.widget.TextView;
import android.util.Log;
public class MainActivity extends AppCompatActivity implements LocationListener
{
protected LocationManager lm;
protected LocationListener ll;
protected Context c;
protected String latitude,longitude;
protected boolean gps_enabled,network_enabled;
String provider;
TextView txtLat;
String lat;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtLat=findViewById(R.id.txtLat);
        lm=(LocationManager)getSystemService(Context.LOCATION_SERVICE);
        lm.requestLocationUpdates(LocationManager.GPS_PROVIDER,0,0,this);
    }
    @Override
    public void onLocationChanged(Location location)
    {
        txtLat=findViewById(R.id.txtLat);
        txtLat.setText("Latitude : "+location.getLatitude()+ ",Longitude : "+location.getLongitude());
    }
    @Override
    public void onProviderEnabled(String provider)
    {
        Log.d("Latitude","enable");
    }
    @Override
    public void onProviderDisabled(String provider)
    {
        Log.d("Latitude","disable");
    }
    public void onStatusChanged(String provider,int status,Bundle extras)
    {
        Log.d("Latitude","status");
    }

}
