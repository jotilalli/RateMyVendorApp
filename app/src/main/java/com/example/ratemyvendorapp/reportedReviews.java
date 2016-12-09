package com.example.ratemyvendorapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class reportedReviews extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reported_reviews);
    }

    public void IgnoreToast(View view){
        Context context = getApplicationContext();
        CharSequence text = "Report Ignored";
        int duration = Toast.LENGTH_SHORT;

        Toast toast1 = Toast.makeText(context,text,duration);
        toast1.show();
    }

    public void RemoveToast(View view){
        Context context = getApplicationContext();
        CharSequence text = "Report Removed!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast2 = Toast.makeText(context,text,duration);
        toast2.show();
    }
}
