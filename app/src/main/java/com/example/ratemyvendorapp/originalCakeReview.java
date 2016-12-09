package com.example.ratemyvendorapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class originalCakeReview extends AppCompatActivity {


    private Button btnSubmitNewReview;

    private void eventHandler() {

        btnSubmitNewReview = (Button) findViewById(R.id.submitNewReviewBtn);


        btnSubmitNewReview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent search = new Intent(originalCakeReview.this, submitReview.class);
                startActivity(search);
            }
        });

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_original_cake_review);

        Intent i = getIntent();
        Bundle dataBundle = i.getExtras();
        String dataString= dataBundle.getString("DATA");

        TextView tv = (TextView)findViewById(R.id.commentsTextView);
        tv.setText(dataString);

     /*   Intent presIntent = getIntent();
        Bundle presBundle = presIntent.getExtras();
        String presString= presBundle.getString("PRES");

        TextView presRate = (TextView)findViewById(R.id.presentationResult);
        presRate.setText(presString);
        */

        eventHandler();
    }
}
