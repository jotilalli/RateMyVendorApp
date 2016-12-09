package com.example.ratemyvendorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class myReviews extends AppCompatActivity {

    private Button btnViewReview;
    private Button btnEditReview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_reviews);
    }
}
