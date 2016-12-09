package com.example.ratemyvendorapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.ratemyvendorapp.R.id.presentationRating;

public class submitReview extends AppCompatActivity {

    public RatingBar rbPresentation;
    private TextView rbPresText;
  //  private TextView rbPresText2;

    public RatingBar rbService;
    private TextView rbServText;

    public RatingBar rbPrice;
    private TextView rbPriceText;

    public RatingBar rbProf;
    private TextView rbProfText;

    public RatingBar rbOverall;
    private TextView rbOverallText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit_review);


        rbPresentation = (RatingBar) findViewById(R.id.presentationRating);
        rbPresText = (TextView) findViewById(R.id.presentationTitle);
      //  rbPresText2 = (TextView) findViewById(R.id.presentationTitle);

        rbService = (RatingBar) findViewById(R.id.serviceRating);
        rbServText = (TextView) findViewById(R.id.serviceTitle);

        rbPrice = (RatingBar) findViewById(R.id.priceRating);
        rbPriceText = (TextView) findViewById(R.id.priceTitle);

        rbProf = (RatingBar) findViewById(R.id.professionalRating);
        rbProfText = (TextView) findViewById(R.id.professionalTitle);

        rbOverall = (RatingBar) findViewById(R.id.overallRating);
        rbOverallText = (TextView) findViewById(R.id.OverallTitle);

        rbPresentation.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {

                rbPresText.setText("Presentation: " + rating);
             //   rbPresText2.setText(""+ rating);
            }
        });

        rbService.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {

                rbServText.setText("Service: " + rating);
            }
        });

        rbPrice.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {

                rbPriceText.setText("Price: " + rating);
            }
        });

        rbProf.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {

                rbProfText.setText("Professionalism: " + rating);
            }
        });

        rbOverall.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {

                rbOverallText.setText("Overall Experience: " + rating);
            }
        });


        Button b = (Button)findViewById(R.id.submitReviewBtn);
        final EditText commenttext = (EditText)findViewById(R.id.commentBox);
     //   final TextView presentationtext = (TextView)findViewById(R.id.rbPresText);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = commenttext.getText().toString();

                Intent i = new Intent(getApplicationContext(),originalCakeReview.class);
                i.putExtra("DATA",data);
                startActivity(i);

               /* String presentationText = rbPresText2.getText().toString();

                Intent presIntent = new Intent(getApplicationContext(),originalCakeReview.class);
                i.putExtra("PRES",presentationText);


                startActivity(presIntent); */
            }
        });

    }



}
