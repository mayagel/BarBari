package com.example.yagel.barbari;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Chronometer;
import android.widget.ImageView;

/**
 * Created by Yagel on 23/01/2018.
 */

class Bar extends SQLiteOpenHelper {
    public static final String DATABASE_NAME="bar.db";
    public static final String TABLE_NAME="bar_table";
    public static final String COL_1="ID";
    public static final String COL_2="NAME";
    public static final String COL_3="PLACE";
    public static final String COL_4="DESCRIPTION";
    public static final String COL_5="OPEN_TIME";
    public static final String COL_6="THE_COSTUMERS";
    public static final String COL_7="IMAGE_BAR";

    private static int _no_of_bar=0;
    private int _id;
    private String _name;
    private String _place;
    private String _descriotion;
    private String _open_time;
    private Costumer[] _the_costumers ;
    private ImageView _image_bar;

    public Bar(Context context){
        super(context, DATABASE_NAME,null, 1);

    }

    public void setCostumersList(Costumer[] the_costumer){
        _the_costumers=the_costumer;
    }

    public void setPlace(String _place) {
        this._place = _place;
    }

    public void setName(String _name) {
        this._name = _name;
    }

    public void setDescriotion(String _descriotion) {
        this._descriotion = _descriotion;
    }

    public void setOpenTime(String _open_time) {
        this._open_time = _open_time;
    }

    public int getId() {
        return _id;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
