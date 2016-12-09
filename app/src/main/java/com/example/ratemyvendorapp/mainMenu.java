package com.example.ratemyvendorapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mainMenu extends AppCompatActivity {


    private Button btnSearch;
    private Button btnMyReview;

    private void eventHandler() {

        btnSearch = (Button) findViewById(R.id.btnSearchVendor);
        btnMyReview = (Button) findViewById(R.id.btnMyReviews);


        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent search = new Intent(mainMenu.this, vendorList.class);
                startActivity(search);
            }
        });

        btnMyReview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myreview = new Intent(mainMenu.this, myReviews.class);
                startActivity(myreview);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        eventHandler();
    }
}
