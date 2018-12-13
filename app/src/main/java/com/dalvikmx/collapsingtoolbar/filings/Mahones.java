package com.dalvikmx.collapsingtoolbar.filings;


import com.dalvikmx.collapsingtoolbar.R;

public class Mahones extends Cheese implements Filling {
    @Override
    public String getName() {
        return "Mahonés";
    }

    @Override
    public int getImage() {
        return R.drawable.mahones;
    }

    @Override
    public int getKCal() {
        return 165;
    }

    @Override
    public boolean isVeg() {
        return true;
    }

    @Override
    public float getPrice() {
        return 1.6f;
    }
}


