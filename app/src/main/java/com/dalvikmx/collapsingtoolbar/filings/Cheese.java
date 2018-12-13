package com.dalvikmx.collapsingtoolbar.filings;

public abstract class Cheese implements Filling {

    private String name;
    private int image;
    private String description;
    private int kcal;
    private boolean vegetarian;
    private float price;


    public abstract String getName();

    public abstract int getImage();

    public abstract int getKCal();

    public abstract boolean isVeg();

    public abstract float getPrice();
}
