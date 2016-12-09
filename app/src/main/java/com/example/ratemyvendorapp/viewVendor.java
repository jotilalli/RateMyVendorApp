package com.example.ratemyvendorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class viewVendor extends AppCompatActivity {

    private TextView presentationRating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_vendor);

        presentationRating = (TextView) findViewById(R.id.presentationResult);


    }
}
