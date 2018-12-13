package com.dalvikmx.collapsingtoolbar.filings;


import com.dalvikmx.collapsingtoolbar.R;

public class Camembert extends Cheese implements Filling {
    @Override
    public String getName() {
        return "Camembert";
    }

    @Override
    public int getImage() {
        return R.drawable.camembert;
    }

    @Override
    public int getKCal() {
        return 87;
    }

    @Override
    public boolean isVeg() {
        return true;
    }

    @Override
    public float getPrice() {
        return 0.65f;
    }
}
