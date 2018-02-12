package com.example.yagel.barbari;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;

public class LoginActivity extends AppCompatActivity {
    private static EditText pass_et, username_et;
    private static Button login_btm;
    private static TextView forget_tv, creat_tv, guest_tv;

    //for facebook login
    private static TextView txt_status;
    private TextView info;
    private static LoginButton login_button;
    private static CallbackManager callbackManager;


    @Override
   protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FacebookSdk.sdkInitialize(getApplicationContext());
        setContentView(R.layout.activity_login);
        clickGuestListener();
        clickForgotPass();
        initializeControls();
        loginWithFacebook();
    }

    public void clickGuestListener() {
        pass_et = (EditText) findViewById(R.id.pass_et);
        username_et = (EditText) findViewById(R.id.username_et);
        login_btm = (Button) findViewById(R.id.login_btm);
        forget_tv = (TextView) findViewById(R.id.forget_tv);
        creat_tv = (TextView) findViewById(R.id.creat_tv);
        guest_tv = (TextView) findViewById(R.id.guest_tv);

        guest_tv.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent2 = new Intent(getApplicationContext(), SearchActivity.class);
                        startActivity(intent2);
                    }
                }
        );
        creat_tv.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), CreatUserActivity.class);
                        startActivity(intent);
                    }
                }
        );
    }

    private void initializeControls() {
        callbackManager = CallbackManager.Factory.create();
        txt_status = (TextView) findViewById(R.id.txt_status);
        login_button = (LoginButton) findViewById(R.id.login_button);

    }

    private void loginWithFacebook()
    {
        LoginManager.getInstance().registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {
                txt_status.setText("LoginSucces\n");
            }

            @Override
            public void onCancel() {
                txt_status.setText("login Canceled\n");
            }

            @Override
            public void onError(FacebookException error) {
                txt_status.setText("login Error\n"+error.getMessage());
            }
        });

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        callbackManager.onActivityResult(requestCode, resultCode, data);
        super.onActivityResult(requestCode, resultCode, data);

    }

    public void clickForgotPass(){
        forget_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this, Pop.class));
            }
        });
    }

}
