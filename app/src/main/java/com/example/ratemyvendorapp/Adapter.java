package com.example.ratemyvendorapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by jotilalli on 2016-11-02.
 */

public class Adapter extends BaseAdapter implements Filterable{

    Context c;
    ArrayList<Vendor> vendors;
    ArrayList<Vendor> filterlist;
    CustomFilter filter;

    public Adapter(Context ctx, ArrayList<Vendor> vendors){

        this.c = ctx;
        this.vendors = vendors;
        this.filterlist=vendors;

    }

    @Override
    public int getCount() {
        return vendors.size();
    }

    @Override
    public Object getItem(int position) {
        return vendors.get(position);
    }

    @Override
    public long getItemId(int position) {
        return vendors.indexOf(getItem(position));
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater =(LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if(convertView==null) {
            convertView = inflater.inflate(R.layout.model, parent, false);
        }

        TextView nameTxt;
        nameTxt = (TextView)convertView.findViewById(R.id.vendorItem);

        //set data
        nameTxt.setText(vendors.get(position).getName());

        return convertView;
    }

    @Override
    public Filter getFilter() {

        if(filter == null)
        {
            filter=new CustomFilter();
        }
        return filter;
    }

    //INNER Class

    class CustomFilter extends Filter{

        @Override
        protected FilterResults performFiltering(CharSequence constraint) {

            FilterResults results = new FilterResults();

            if(constraint != null && constraint.length()>0)
            {
                //constraint to upper

                constraint=constraint.toString().toUpperCase();

                ArrayList<Vendor> filters=new ArrayList<Vendor>();

                //Filtering
                for(int i=0;i<filterlist.size();i++)
                {
                    if(filterlist.get(i).getName().toUpperCase().contains(constraint))
                    {
                        Vendor v=new Vendor(filterlist.get(i).getName());
                        filters.add(v);
                    }
                }
                results.count=filters.size();
                results.values=filters;
            }else
            {
                results.count=filterlist.size();
                results.values=filterlist;
            }
            return results;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {

            vendors= (ArrayList<Vendor>) results.values;
            notifyDataSetChanged();

        }
    }
}