package com.example.myapplication;

import android.widget.ImageView;

public class StationaryItem extends Item{

    private String type;
    private String color;

    public StationaryItem(String itemName, String itemID, int itemPrice, User user, String info, ImageView image) {
        super(itemName, itemID, itemPrice, user, info, image);
    }
}
