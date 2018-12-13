package com.dalvikmx.collapsingtoolbar;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by JuanGabriel on 11/10/17.
 */

public class ViewHolder extends RecyclerView.ViewHolder {

    public ImageView imageView;
    public TextView textView;

    public ViewHolder(View v){
        super(v);

        imageView = v.findViewById(R.id.item_image);
        textView = v.findViewById(R.id.item_name);
    }



}
