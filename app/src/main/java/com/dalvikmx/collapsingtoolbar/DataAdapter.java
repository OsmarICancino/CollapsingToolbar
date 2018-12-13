package com.dalvikmx.collapsingtoolbar;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.dalvikmx.collapsingtoolbar.filings.Cheese;

import java.util.List;


/**
 * Created by JuanGabriel on 11/10/17.
 */

public class DataAdapter extends RecyclerView.Adapter<ViewHolder> {

    private List<Cheese> cheeses;


    public DataAdapter(List<Cheese> cheeses){
        this.cheeses = cheeses;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        Context context = parent.getContext();

        LayoutInflater inflater = LayoutInflater.from(context);

        View cheeseView = inflater.inflate(R.layout.ingredient_item, parent, false);

        ViewHolder viewHolder = new ViewHolder(cheeseView);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Cheese cheese = cheeses.get(position);

        ImageView imageView = holder.imageView;
        imageView.setImageResource(cheese.getImage());

        TextView textView = holder.textView;
        textView.setText(cheese.getName());

    }

    @Override
    public int getItemCount() {
        return cheeses.size();
    }



    public void removeItem(int position){
        cheeses.remove(position);
        notifyItemRemoved(position);
        notifyItemRangeChanged(position, cheeses.size());
    }

}
