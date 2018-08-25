package com.example.yagel.barbari;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;

/**
 * to login or get as guest or create user or forget password
 */
public class LoginActivity extends AppCompatActivity {

    private static Button manager_btm;

    private static EditText pass_et, username_et;//the password and username to fill for login
    private static Button login_btm;//the button to click on for login
    private static TextView forget_tv, creat_tv, guest_tv;//the textview to click on for get as guest or create user or forget password

    //for facebook login
    private static TextView txt_status;//the text that change according to the facebook login status
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

    /*
    the function when the get as geust clicked
     */
    public void clickGuestListener() {
        pass_et = (EditText) findViewById(R.id.pass_et);
        username_et = (EditText) findViewById(R.id.username_et);
        login_btm = (Button) findViewById(R.id.login_btm);
        forget_tv = (TextView) findViewById(R.id.forget_tv);
        creat_tv = (TextView) findViewById(R.id.creat_tv);
        guest_tv = (TextView) findViewById(R.id.guest_tv);
        manager_btm= (Button) findViewById(R.id.manager_btm);

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
        login_btm.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (username_et.getText().toString()=="yagel" && pass_et.getText().toString()=="123456"){
                            Toast.makeText(getApplicationContext(), "wellcome "+username_et.getText()+" you can now manage your bar in buttom below", Toast.LENGTH_SHORT).show();
                            manager_btm.setVisibility(view.VISIBLE);
                        }
                        else
                            Toast.makeText(getApplicationContext(), "sorry but the username or password are not found ", Toast.LENGTH_SHORT).show();

                    }
                }
        );
        manager_btm.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), ManageBarActivity.class);
                        startActivity(intent);
                    }
                }
        );
    }
    /*
    all below for facebook login
     */
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
                Intent intent = new Intent(getApplicationContext(), PopWindowActivity.class);
                startActivity(intent);
            }
        });
    }

}
