package com.example.ratemyvendorapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SearchView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Spinner;

import java.util.ArrayList;

public class findVendor extends AppCompatActivity {

    private final String[] names={"Original Cakerie","Elite Decor","Chocolate Bakery","Rockin DJ"};



    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_vendor);



        GridView gv = (GridView) findViewById(R.id.viewVendor);
        SearchView sv = (SearchView) findViewById(R.id.searchvendor);

        //adapter
        final Adapter adapter = new Adapter(this, this.getVendors());
        gv.setAdapter(adapter);

        sv.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String arg0) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String query) {

                adapter.getFilter().filter(query);
                return false;
            }
        });

    }

    private ArrayList<Vendor> getVendors()
    {
        ArrayList<Vendor> vendors=new ArrayList<Vendor>();
        Vendor v;

        for(int i=0;i<names.length;i++){
            v = new Vendor(names[i]);
            vendors.add(v);
        }
        return vendors;
    }


}
