package com.example.yagel.barbari;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CreatUserActivity extends AppCompatActivity {

    OrderTable dbOrderTable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creat_user);
        dbOrderTable= new OrderTable(this);
    }
}
