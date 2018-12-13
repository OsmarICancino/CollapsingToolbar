package com.dalvikmx.collapsingtoolbar.filings;


import com.dalvikmx.collapsingtoolbar.R;

public class Manchego extends Cheese implements Filling {
    @Override
    public String getName() {
        return "Manchego";
    }

    @Override
    public int getImage() {
        return R.drawable.manchego;
    }

    @Override
    public int getKCal() {
        return 215;
    }

    @Override
    public boolean isVeg() {
        return true;
    }

    @Override
    public float getPrice() {
        return 1.7f;
    }
}


