package com.example.yagel.barbari;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Thread mythread = new Thread(){
            @Override
            public void run(){
             try {
                 sleep(3000);
                 Intent intent = new Intent(getApplicationContext(),LoginActivity.class);
                 startActivity(intent);
                 finish();
             }catch (InterruptedException e){
                 e.printStackTrace();
             }
            }
        };
        mythread.start();
    }
}
//if you see this its mean that the github work...