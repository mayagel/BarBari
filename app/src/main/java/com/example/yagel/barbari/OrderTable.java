package com.example.yagel.barbari;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by Yagel on 26/01/2018.
 * the class that represent the pattern of SQLite table for all orderTable
 */

class OrderTable extends SQLiteOpenHelper {
    private static final String TAG="DatabaseHelper";

    public static final String DATABASE_NAME="babari.db";
    public static final String TABLE_NAME="order_table";
    public static final String COL_1="ID";
    public static final String COL_2="KOD";
    public static final String COL_3="COSTUMER_ID";
    public static final String COL_4="BAR_ID";

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
        String createTable="create table " + TABLE_NAME + " (ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COL_2 + "INTEGER," +
                COL_3 + "INTEGER, " +
                COL_4 + "INTEGER)";
        sqLiteDatabase.execSQL(createTable);
    }


    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(sqLiteDatabase);

    }
    public boolean insertData(int kod, int costumer_id, int bar_id){
        SQLiteDatabase sqLiteDatabase=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(COL_2, kod);
        contentValues.put(COL_3, costumer_id);
        contentValues.put(COL_4, bar_id);

        Log.d(TAG, "addData:adding" + costumer_id + "to"+ TABLE_NAME );
        long result=sqLiteDatabase.insert(TABLE_NAME, null, contentValues);
        if (result==-1)
            return false;
        else
            return true;
    }
}
