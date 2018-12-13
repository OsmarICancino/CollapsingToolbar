package com.dalvikmx.collapsingtoolbar.filings;


import com.dalvikmx.collapsingtoolbar.R;


public class Brie extends Cheese implements Filling {
    @Override
    public String getName() {
        return "Brie";
    }

    @Override
    public int getImage() {
        return R.drawable.brie;
    }

    @Override
    public int getKCal() {
        return 120;
    }

    @Override
    public boolean isVeg() {
        return true;
    }

    @Override
    public float getPrice() {
        return 0.7f;
    }
}
