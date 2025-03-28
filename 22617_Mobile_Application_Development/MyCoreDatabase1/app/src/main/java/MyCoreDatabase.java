package com.example.mycoredatabase1.MyCoreDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.Cursor;

import android.annotation.SuppressLint;
import android.database.sqlite.SQLiteDatabase;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Context;
import android.util.Log;
import java.lang.String;
import java.lang.StringBuilder;

public class MyCoreDatabase extends SQLiteOpenHelper
{
    private static final String DB_NAME="BVJNIOT";
    private static final String DB_TABLE="student_info";
    private static final int DB_VER=1;
    SQLiteDatabase myDB;
    Context ctx;

    public MyCoreDatabase(Context ct)
    {
        super(ct,DB_NAME,null,DB_VER);
        ctx=ct;
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase)
    {
        sqLiteDatabase.execSQL
                ("CREATE TABLE "+DB_TABLE+"(_id integer primary key autoincrement,rollno integer,name text,branch text,marks integer,percentage integer );");
        Log.i("DATABASE","Table Created");
    }
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase,int i,int i1)
    {
        sqLiteDatabase.execSQL("drop table if exists "+DB_TABLE);
        onCreate(sqLiteDatabase);
    }
    public void insertData(int i1,String s1,String s2,int i2,int i3)
    {
        myDB=getWritableDatabase();
        myDB.execSQL("insert into "+DB_TABLE+" (rollno,name,branch,marks,percentage)values("+i1+","+s1+","+s2+","+i2+","+i3+")");
        Toast.makeText(ctx,"DATA SAVED",Toast.LENGTH_SHORT).show();
    }
    public void getAll(TextView txt1)
    {
        myDB=getReadableDatabase();
        @SuppressLint("Recycle")
        Cursor cr=myDB.rawQuery("select * from "+DB_TABLE,null);
        StringBuilder sb=new StringBuilder();
        while(cr.moveToNext())
        {
            String s1=cr.getString(1);
            String s2=cr.getString(2);
            String s3=cr.getString(3);
            String s4=cr.getString(4);
            String s5=cr.getString(5);
            sb.append(s1).append("").append(s1).append("").append(s2).append("").append(s3).append("").append(s4).append("").append(s5).append("\n");
        }
        txt1.setText(sb.toString());
    }
}
