package com.example.yagel.barbari;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Yagel on 26/01/2018.
 */

class OrderTable extends SQLiteOpenHelper {
    public static final String DATABASE_NAME="order.db";
    public static final String TABLE_NAME="order_table";
    public static final String COL_1="ID";
    public static final String COL_2="KOD";
    public static final String COL_3="COSTUMER";

    private int _id;
    private String _kod;
    private Costumer _costumer;

    /*
this function takes the context and create SQLite table from it
 */
    public OrderTable (Context context){
        super(context, DATABASE_NAME,null,1);

    }
/*
this function create the colon of the table
 */
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table " + TABLE_NAME +" (ID INTEGER PRIMARY KEY AUTOINCREMENT, KOD INTEGER, COSTUMERKOD STRING)");
    }


    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(sqLiteDatabase);

    }
    public boolean insertData(int kod, Costumer costumer){
        SQLiteDatabase sqLiteDatabase=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(COL_2, kod);
        contentValues.put(COL_3, String);
        long result=sqLiteDatabase.insert(TABLE_NAME, null, contentValues);
        if (result==-1)
            return false;
        else
            return true;
    }
}
