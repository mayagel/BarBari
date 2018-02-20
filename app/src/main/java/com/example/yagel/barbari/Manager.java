package com.example.yagel.barbari;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.yagel.barbari.Bar;
import com.example.yagel.barbari.OrderTable;

/**
 * Created by Yagel on 23/01/2018.
 */

public class Manager extends SQLiteOpenHelper {
    public static final String DATABASE_NAME="manager.db";
    public static final String TABLE_NAME="manager_table";
    public static final String COL_1="ID";
    public static final String COL_2="NAME";
    public static final String COL_3="PASSWORD";
    public static final String COL_4="MY_BAR";
    public static final String COL_5="ORDER_TABLE";


    public Manager(Context context){
        super(context, DATABASE_NAME,null,1);

    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
