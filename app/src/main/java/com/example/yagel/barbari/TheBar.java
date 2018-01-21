package com.example.yagel.barbari;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class TheBar extends AppCompatActivity {

    ArrayAdapter<String> adapter;

private static TextView bar_name1;
private static TextView bar_des;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_bar);
        showBar();
    }
    public void showBar(){
        bar_name1=(TextView) findViewById(R.id.bar_name);
        bar_des=(TextView) findViewById(R.id.bar_des);

        bar_name1.setText(SearchActivity.bar_name);
/*
        ArrayList<String> arrayBar= new ArrayList<>();
        arrayBar.addAll(Arrays.asList(getResources().getStringArray(R.array.bar_des)));

        adapter=new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                arrayBar
        );
        */

    }


}
