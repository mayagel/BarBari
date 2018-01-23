package com.example.yagel.barbari;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class TheBar extends AppCompatActivity {


private static TextView bar_name1;
private static TextView bar_des;
private static TextView bar_p_t;
private static ImageView bar_img;

private String[] bar_des_l;
private String[] bar_place;
private String[] bar_open_t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_bar);
        showBar();
    }
    public void showBar(){
        bar_name1=(TextView) findViewById(R.id.bar_name);
        bar_des=(TextView) findViewById(R.id.bar_des);
        bar_p_t=(TextView) findViewById(R.id.bar_p_t);

        bar_img=(ImageView) findViewById(R.id.bar_img);

        bar_des_l=getResources().getStringArray(R.array.bar_des);
        bar_place=getResources().getStringArray(R.array.bar_place);
        bar_open_t=getResources().getStringArray(R.array.bar_open_t);


        bar_name1.setText(SearchActivity.bar_name);
        bar_des.setText(bar_des_l[SearchActivity.index_bar]);
        bar_p_t.setText(bar_place[SearchActivity.index_bar]+"    "+bar_open_t[SearchActivity.index_bar]);

        if(SearchActivity.index_bar%2==0)
        bar_img.setImageResource(R.drawable.bar1_img);
        else
            bar_img.setImageResource(R.drawable.bar2_img);

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
