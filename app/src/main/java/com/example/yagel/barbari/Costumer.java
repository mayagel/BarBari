package com.example.yagel.barbari;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Yagel on 23/01/2018.
 */

class Costumer extends SQLiteOpenHelper {
    public static final String DATABASE_NAME="costumer.db";
    public static final String TABLE_NAME="costumer_table";
    public static final String COL_1="ID";
    public static final String COL_2="NAME";
    public static final String COL_3="PASSWORD";
    public static final String COL_4="PLACE";
    public static final String COL_5="KOD";
    public static final String COL_6="E-MAIL";

    private static  int _no_of_costumers=0;
    private int _id;
    private String _name;
    private String _pass;
    private String _place;
    private int _kod;
    private String _email;

    public Costumer(Context context){
        super(context, DATABASE_NAME,null,1);
    }



    //get and set methoud
    public void setKod(int _kod) {
        this._kod = _kod;
    }

    public void setName(String _name) {
        this._name = _name;
    }

    public void setPlace(String _place) {
        this._place = _place;
    }

    public int getKod() {
        return _kod;
    }

    public String getName() {
        return _name;
    }

    public String getPlace() {
        return _place;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
