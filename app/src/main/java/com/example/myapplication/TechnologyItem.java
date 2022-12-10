package com.example.myapplication;

import android.widget.ImageView;

public class TechnologyItem extends Item{

    private String brand;
    private String type;
    private String model;

    public TechnologyItem(String itemName, String itemID, int itemPrice, User user, String info, ImageView image) {
        super(itemName, itemID, itemPrice, user, info, image);
    }
}
