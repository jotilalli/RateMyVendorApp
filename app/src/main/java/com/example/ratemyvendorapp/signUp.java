package com.example.ratemyvendorapp;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class signUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
/*
        final EditText etfirstname = (EditText) findViewById(R.id.etFirstName);
        final EditText etlastname = (EditText) findViewById(R.id.etLastName);
        final EditText etlocation = (EditText) findViewById(R.id.etLocation);
        final EditText etemail = (EditText) findViewById(R.id.etEmail);
        final EditText etpassword = (EditText) findViewById(R.id.etPassword);
        Button bSignup = (Button) findViewById(R.id.bSignUp);

        bSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String firstname = etfirstname.getText().toString();
                final String lastname = etlastname.getText().toString();
                final String location = etlocation.getText().toString();
                final String email = etemail.getText().toString();
                final String password = etpassword.getText().toString();


                Response.Listener<String> responseListener = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonResponse = new JSONObject(response);
                            boolean success = jsonResponse.getBoolean("success");

                            if (success) {
                                Intent intent = new Intent(signUp.this, MainActivity.class);
                                startActivity(intent);
                            } else {
                                AlertDialog.Builder builder = new AlertDialog.Builder(signUp.this);
                                builder.setMessage("Register Failed")
                                        .setNegativeButton("Retry", null)
                                        .create()
                                        .show();

                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                };


                RegisterRequest registerRequest = new RegisterRequest(firstname, lastname, location, email, password, responseListener);
                RequestQueue queue = Volley.newRequestQueue(signUp.this);
                queue.add(registerRequest);

            }
        });*/
    }

    public void BasicToast(View view){
        Context context = getApplicationContext();
        CharSequence text = "Welcome to Rate My Vendor!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context,text,duration);
        toast.show();
    }
}