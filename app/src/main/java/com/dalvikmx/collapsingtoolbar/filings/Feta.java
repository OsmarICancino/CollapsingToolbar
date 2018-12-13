package com.dalvikmx.collapsingtoolbar.filings;


import com.dalvikmx.collapsingtoolbar.R;

public class Feta extends Cheese implements Filling {
    @Override
    public String getName() {
        return "Feta";
    }

    @Override
    public int getImage() {
        return R.drawable.feta;
    }

    @Override
    public int getKCal() {
        return 65;
    }

    @Override
    public boolean isVeg() {
        return true;
    }

    @Override
    public float getPrice() {
        return 1.2f;
    }
}


