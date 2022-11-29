package com.example.finalproject.ListView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


import com.example.finalproject.R;

import java.util.ArrayList;

public class CustomListViewAdapter extends ArrayAdapter<BeerItem> {
    public CustomListViewAdapter(@NonNull Context context, ArrayList<BeerItem> items){
        super(context, 0, items);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @Nullable ViewGroup parent) {

        if (convertView == null) {
            convertView =
                    LayoutInflater.from(getContext())
                    .inflate(R.layout.item_view, parent, false);

        }
        //gets the beer name
        TextView name = (TextView) convertView.findViewById(R.id.beer_name);
        name.setText(getItem(position).getName());
        //gets the beer description
        TextView description = convertView.findViewById(R.id.description);
        description.setText(getItem(position).getDescription());
        return convertView;
    }
}
