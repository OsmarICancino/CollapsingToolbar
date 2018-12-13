package com.dalvikmx.collapsingtoolbar.filings;


import com.dalvikmx.collapsingtoolbar.R;

public class Gorgonzola extends Cheese implements Filling {
    @Override
    public String getName() {
        return "Gorgonzola";
    }

    @Override
    public int getImage() {
        return R.drawable.gorgonzola;
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
        return 0.95f;
    }
}

