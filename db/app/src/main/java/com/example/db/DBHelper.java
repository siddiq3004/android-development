package com.example.db;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME="student.db";
    public DBHelper(Context context){
        super(context,DATABASE_NAME,null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table register(bf TEXT,gf TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS register");
        onCreate(db);
    }

    public void insertdata(String bf, String gf){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv= new ContentValues();
        cv.put("bf",bf);
        cv.put("gf",gf);
        db.insert("register",null,cv);
    }

    public Cursor getalldata(){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from register",null);
        return res;
    }
}