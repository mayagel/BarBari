package com.example.yagel.barbari;

import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

/**
 * the page for the manager bar to manage his bar
 */
public class ManageBarActivity extends AppCompatActivity implements View.OnClickListener{

    private static final int RESULT_LOAD_IMAGE=1;

    EditText in_des, in_title;
    Button b_up_im;
    ImageView bar_pic;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_bar);

        in_des=(EditText) findViewById(R.id.in_des);
        in_title=(EditText) findViewById(R.id.in_title);
        b_up_im=(Button) findViewById(R.id.b_up_im);
        bar_pic=(ImageView) findViewById(R.id.bar_pic);

        b_up_im.setOnClickListener(this);
        bar_pic.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.b_up_im:

                break;

            case R.id.bar_pic:
                Intent gallaryIntent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(gallaryIntent, RESULT_LOAD_IMAGE);
                break;

        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==RESULT_LOAD_IMAGE && resultCode==RESULT_OK && data!=null){
            Uri selectedImage=data.getData();
            bar_pic.setImageURI(selectedImage);
        }
    }
}
