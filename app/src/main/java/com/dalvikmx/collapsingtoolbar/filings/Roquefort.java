package com.dalvikmx.collapsingtoolbar.filings;


import com.dalvikmx.collapsingtoolbar.R;

public class Roquefort extends Cheese implements Filling {
    @Override
    public String getName() {
        return "Roquefort";
    }

    @Override
    public int getImage() {
        return R.drawable.roquefort;
    }

    @Override
    public int getKCal() {
        return 175;
    }

    @Override
    public boolean isVeg() {
        return true;
    }

    @Override
    public float getPrice() {
        return 2.0f;
    }
}
