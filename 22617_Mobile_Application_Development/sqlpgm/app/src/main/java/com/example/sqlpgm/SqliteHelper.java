package com.example.sqlpgm;

import android.database.sqlite.SQLiteOpenHelper;

        import androidx.annotation.Nullable;

public class SqliteHelper extends SQLiteOpenHelper {


    public SqliteHelper(@Nullable context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String Stud = "create table Student(" + "id integer primary key,name text," + "mobile text)";
        db.execSQL(Stud);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public long SaveStudentInfo(String name, String number) {
        long rw = 0;
        SQLiteDatabase db=this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put("name",name);
        values.put("mobile",number);
        rw=db.insert("Student", null,values);

        return rw;
    }
}


