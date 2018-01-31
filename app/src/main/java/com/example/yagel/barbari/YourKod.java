package com.example.yagel.barbari;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class YourKod extends AppCompatActivity {

    private TextView the_kod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your_kod);
        theKod();
    }

    public void theKod(){
        the_kod=(TextView) findViewById(R.id.the_kod);
        the_kod.setText(String.valueOf(TheBar.the_kod));
    }
}
