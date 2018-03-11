package com.example.yagel.barbari;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Random;


public class TheBarActivity extends AppCompatActivity {


    OrderTable order_table;


private static TextView bar_name1;
private static TextView bar_des;
private static TextView bar_p_t;
private static ImageView bar_img;

private static Button get_kod_btm;

private String[] bar_des_l;
private String[] bar_place;
private String[] bar_open_t;

private Random rand;
public static int the_kod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_bar);
        showBar();
        btmClickListener();
        order_table=new OrderTable(this);
    }
    public void showBar() {
        bar_name1 = (TextView) findViewById(R.id.bar_name);
        bar_des = (TextView) findViewById(R.id.bar_des);
        bar_p_t = (TextView) findViewById(R.id.bar_p_t);

        bar_img = (ImageView) findViewById(R.id.bar_img);

        bar_des_l = getResources().getStringArray(R.array.bar_des);
        bar_place = getResources().getStringArray(R.array.bar_place);
        bar_open_t = getResources().getStringArray(R.array.bar_open_t);


        bar_name1.setText(SearchActivity.bar_name);
        bar_des.setText(bar_des_l[SearchActivity.index_bar]);
        bar_p_t.setText(bar_place[SearchActivity.index_bar] + "    " + bar_open_t[SearchActivity.index_bar]);

        if (SearchActivity.index_bar % 2 == 0)
            bar_img.setImageResource(R.drawable.bar1_img);
        else
            bar_img.setImageResource(R.drawable.bar2_img);
    }
        public void btmClickListener(){
            get_kod_btm=(Button) findViewById(R.id.get_kod_btm);

            get_kod_btm.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            rand=new Random();
                            the_kod=rand.nextInt(9999999)+1;
                            Toast.makeText(TheBarActivity.this,"Your kod is "+String.valueOf(the_kod),Toast.LENGTH_LONG).show();
                            Intent intent=new Intent(getApplicationContext(), YourKodActivity.class);
                            startActivity(intent);
                        }
                    }
            );
    }
}



