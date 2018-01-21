package com.example.yagel.barbari;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    private static EditText pass_et, username_et;
    private static Button login_btm;
    private static TextView forget_tv, creat_tv, guest_tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        clickGuestListener();
    }
    public void clickGuestListener(){
        pass_et=(EditText) findViewById(R.id.pass_et);
        username_et=(EditText) findViewById(R.id.username_et);
        login_btm=(Button) findViewById(R.id.login_btm);
        forget_tv=(TextView)findViewById(R.id.forget_tv);
        creat_tv=(TextView)findViewById(R.id.creat_tv);
        guest_tv=(TextView)findViewById(R.id.guest_tv);

        guest_tv.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent2=new Intent(getApplicationContext(),SearchActivity.class);
                        startActivity(intent2);
                    }
                }
        );
    }

}
