package com.example.ratemyvendorapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button signup2button;
    private Button browseBtn;
    private Button signinBtn;
    private Button adminloginBtn;

    private void eventHandler(){

        signup2button = (Button) findViewById(R.id.signup2Btn);
        browseBtn = (Button) findViewById(R.id.browseBtn);
        signinBtn = (Button) findViewById(R.id.signinBtn);
        adminloginBtn = (Button) findViewById(R.id.btnAdminLogin);


        signup2button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signup = new Intent(MainActivity.this, signUp.class);
                startActivity(signup);
            }
        });

        browseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browse = new Intent(MainActivity.this, findVendor.class);
                startActivity(browse);
            }
        });

        signinBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signin = new Intent(MainActivity.this, mainMenu.class);
                startActivity(signin);
            }
        });

        adminloginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signin = new Intent(MainActivity.this, AdminLoginPage.class);
                startActivity(signin);
            }
        });
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eventHandler();

    }

}
