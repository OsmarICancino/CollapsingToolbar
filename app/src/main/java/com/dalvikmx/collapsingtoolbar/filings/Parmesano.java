package com.dalvikmx.collapsingtoolbar.filings;


import com.dalvikmx.collapsingtoolbar.R;

public class Parmesano extends Cheese implements Filling {
    @Override
    public String getName() {
        return "Parmesano";
    }

    @Override
    public int getImage() {
        return R.drawable.parmesano;
    }

    @Override
    public int getKCal() {
        return 75;
    }

    @Override
    public boolean isVeg() {
        return true;
    }

    @Override
    public float getPrice() {
        return 0.85f;
    }
}


