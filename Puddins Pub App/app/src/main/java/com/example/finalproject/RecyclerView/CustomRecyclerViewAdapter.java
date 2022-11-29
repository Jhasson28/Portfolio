package com.example.finalproject.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.finalproject.R;

import java.util.ArrayList;
//Creates my RecyclerViewAdapter
public class CustomRecyclerViewAdapter extends RecyclerView.Adapter<CustomViewHolder> {
    private ArrayList<Term> items;

    public CustomRecyclerViewAdapter(ArrayList<Term> items) {this.items = items;}
    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_row, parent, false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        Term item = items.get(position);
        holder.merch_name.setText(item.getitems());
        holder.merch_description.setText(item.getItemDescription());
        holder.merch_image.setImageResource(item.getItemPhoto());

    }

    @Override
    public int getItemCount() {
        if (items != null) {
            return items.size();
        }
        return 0;
    }
}

class CustomViewHolder extends RecyclerView.ViewHolder{
    protected TextView merch_name;
    protected TextView merch_description;
    protected ImageView merch_image;

    //sets my custom view holder
    public CustomViewHolder(@NonNull View itemView){
        super(itemView);
        this.merch_name = itemView.findViewById(R.id.merch_name);
        this.merch_description = itemView.findViewById(R.id.merch_description);
        this.merch_image = itemView.findViewById(R.id.merch_image);
    }
}
