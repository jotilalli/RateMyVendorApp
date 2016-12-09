package com.example.ratemyvendorapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mainMenuAdmin extends AppCompatActivity {

    private Button AdminSearchVendor;
    private Button AdminMyReviews;
    private Button btnviewReports;

    private void eventHandler() {

        AdminSearchVendor = (Button) findViewById(R.id.btnAdminSearchVendor);
        AdminMyReviews = (Button) findViewById(R.id.btnAdminMyReviews);
        btnviewReports = (Button) findViewById(R.id.btnViewReports);


        AdminSearchVendor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signup = new Intent(mainMenuAdmin.this, vendorList.class);
                startActivity(signup);
            }
        });

        AdminMyReviews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browse = new Intent(mainMenuAdmin.this, myReviews.class);
                startActivity(browse);
            }
        });

        btnviewReports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signin = new Intent(mainMenuAdmin.this, reportedReviews.class);
                startActivity(signin);
            }
        });
    }

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu_admin);
            eventHandler();
    }
}
