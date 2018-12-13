package com.dalvikmx.collapsingtoolbar.filings;


import com.dalvikmx.collapsingtoolbar.R;

public class Cheddar extends Cheese implements Filling {
    @Override
    public String getName() {
        return "Cheddar";
    }

    @Override
    public int getImage() {
        return R.drawable.cheddar;
    }

    @Override
    public int getKCal() {
        return 125;
    }

    @Override
    public boolean isVeg() {
        return true;
    }

    @Override
    public float getPrice() {
        return 0.5f;
    }
}


