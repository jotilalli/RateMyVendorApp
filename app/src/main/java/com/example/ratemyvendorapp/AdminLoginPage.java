package com.example.ratemyvendorapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdminLoginPage extends AppCompatActivity {


    private Button btnAdminLogin;

    private void eventHandler() {

        btnAdminLogin = (Button) findViewById(R.id.AdminSigninBtn);

        btnAdminLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent search = new Intent(AdminLoginPage.this, mainMenuAdmin.class);
                startActivity(search);
            }
        });
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login_page);
        eventHandler();
    }
}
