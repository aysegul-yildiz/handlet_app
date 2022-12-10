package com.example.myapplication;

import android.widget.ImageView;

public class FurnitureItem extends Item{

    private String brand;
    private String color;

    public FurnitureItem(String itemName, String itemID, int itemPrice, User user, String info, ImageView image) {
        super(itemName, itemID, itemPrice, user, info, image);
    }
}
