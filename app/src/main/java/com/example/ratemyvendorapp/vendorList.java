package com.example.ratemyvendorapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class vendorList extends AppCompatActivity {


    private Button btnOriginalCakerie;
    private Button btnEliteDecor;
    private Button btnChocolateBakery;
    private Button btnRockinDj;

    private void eventHandler() {

        btnOriginalCakerie = (Button) findViewById(R.id.btnoriginalCakerie);
        btnEliteDecor = (Button) findViewById(R.id.btnEliteDecor);
        btnChocolateBakery = (Button) findViewById(R.id.btnChocolateBakery);
        btnRockinDj = (Button) findViewById(R.id.btnRockinDj);


        btnOriginalCakerie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent search = new Intent(vendorList.this, submitReview.class);
                startActivity(search);
            }
        });

        btnEliteDecor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent search = new Intent(vendorList.this, eliteDecorReview.class);
                startActivity(search);
            }
        });

        btnChocolateBakery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent search = new Intent(vendorList.this, chocolateBakeryReview.class);
                startActivity(search);
            }
        });

        btnRockinDj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent search = new Intent(vendorList.this, rockinDjReview.class);
                startActivity(search);
            }
        });


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vendor_list);
        eventHandler();
    }
}
