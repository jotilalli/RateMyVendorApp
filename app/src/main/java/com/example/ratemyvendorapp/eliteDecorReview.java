package com.example.ratemyvendorapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class eliteDecorReview extends AppCompatActivity {

    private Button btnSubmitNewReview;

    private void eventHandler() {

        btnSubmitNewReview = (Button) findViewById(R.id.submitNewReviewBtn);


        btnSubmitNewReview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent search = new Intent(eliteDecorReview.this, submitReview.class);
                startActivity(search);
            }
        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elite_decor_review);
        eventHandler();
    }
}
