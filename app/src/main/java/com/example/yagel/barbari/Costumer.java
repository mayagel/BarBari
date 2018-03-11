package com.example.yagel.barbari;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Yagel on 23/01/2018.
 * this class represent the SQLite pattern of costumer table
 */

class Costumer extends SQLiteOpenHelper {
    public static final String DATABASE_NAME="barbari.db";//the name of the dataBase that include the costumer variable
    public static final String TABLE_NAME="costumer_table";//the table name that include the costumer variable
    public static final String COL_1="ID";//the id number of each costumer (fill automatically)
    public static final String COL_2="NAME";//the name of costumer
    public static final String COL_3="PASSWORD";//the password of the costumer
    public static final String COL_4="PLACE";//when the costumer live
    public static final String COL_5="KOD";//the kod of the costumer when he click the happyHour button
    public static final String COL_6="E-MAIL";//the email of the costumer
    public static final String COL_7="BAR_ID";//the id of the bar that this costumer in right now if he dont in bar it will be null




    public Costumer(Context context){
        super(context, DATABASE_NAME,null,1);
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
