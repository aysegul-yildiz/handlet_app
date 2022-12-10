package com.example.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;
import android.widget.ImageView;

public class DBHelper extends SQLiteOpenHelper {
    ContentValues values = new ContentValues();

    public static final String DBNAME = "login.db";
    public DBHelper(Context context) {
        super(context, "login.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table users(mail TEXT primary key, password TEXT, name TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("drop table if exists users");
    }

    public Boolean insertData(String mail, String name, String password){
        SQLiteDatabase db = this.getWritableDatabase();

        values.put("mail", mail);
        values.put("password", password);
        values.put("name", name);

        long result = db.insert("users", null, values);

        if(result==-1) return false;
        else return true;
    }

    public Boolean checkUserMail(String mail){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("select * from users where mail=?", new String[] {mail});

        if(cursor.getCount()>0) return true;
        else return false;
    }

    public Boolean checkUserPassword(String mail, String password){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("select * from users where mail=? and password=?", new String[] {mail, password});

        if(cursor.getCount()>0) return true;
        else return false;
    }

    public Boolean checkUserName(String mail, String password, String name){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("select * from users where mail=? and password=? and name=?", new String[] {mail, password,name});

        if(cursor.getCount()>0) return true;
        else return false;
    }

    public User getUser(String mail){
        SQLiteDatabase db = this.getReadableDatabase();

        return (User)values.get(mail);
    }



}
