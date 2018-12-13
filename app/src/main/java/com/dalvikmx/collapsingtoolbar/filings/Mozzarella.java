package com.dalvikmx.collapsingtoolbar.filings;


import com.dalvikmx.collapsingtoolbar.R;

public class Mozzarella extends Cheese implements Filling {
    @Override
    public String getName() {
        return "Mozarella";
    }

    @Override
    public int getImage() {
        return R.drawable.mozzarella;
    }

    @Override
    public int getKCal() {
        return 55;
    }

    @Override
    public boolean isVeg() {
        return true;
    }

    @Override
    public float getPrice() {
        return 0.3f;
    }
}


