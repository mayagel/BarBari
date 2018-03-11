package com.example.yagel.barbari;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Chronometer;
import android.widget.ImageView;

/**
 * Created by Yagel on 23/01/2018.
 * this is class that represent the SQLite of all Bar's
 * that sign in to the app
 */

class Bar extends SQLiteOpenHelper {
//the database and table name
    public static final String DATABASE_NAME="barari.db";
    public static final String TABLE_NAME="bar_table";
    //all the column at the SQlite name
    public static final String COL_1="ID";//aoutomaticlly arrenge as 1,2,3.. for each bar.
    public static final String COL_2="NAME";//the name of the bar
    public static final String COL_3="PLACE";//where the bar location is.
    public static final String COL_4="DESCRIPTION";//a litle brief on the bar. the menthalic atmosphere the music, the type of chair and people, etc...
    public static final String COL_5="OPEN_TIME";//when the bar is open. from-X till-Y.
    public static final String COL_6="IMAGE_BAR"; //the logo image of the bar

/*
this function takes the context and create SQLite table from it
 */
    public Bar(Context context){
        super(context, DATABASE_NAME,null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
