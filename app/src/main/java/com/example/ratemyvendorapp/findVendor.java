package com.example.ratemyvendorapp;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SearchView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Spinner;

import java.util.ArrayList;

public class findVendor extends AppCompatActivity {

    GridView gv;
    SearchView sv;

    String[] names={"Original Cakerie","Elite Decor","Chocolate Bakery","Rockin DJ"};

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_vendor);


        gv= (GridView) findViewById(R.id.viewVendor);
        sv= (SearchView) findViewById(R.id.searchvendor);

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
/*
        Spinner spinner = (Spinner) findViewById(R.id.spinnerType);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.vendortypes_array, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner.setAdapter(adapter);*/
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
