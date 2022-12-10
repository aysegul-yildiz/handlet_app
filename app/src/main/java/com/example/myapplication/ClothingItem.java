package com.example.myapplication;

import android.widget.ImageView;

public class ClothingItem extends Item{

    private String type;
    private String color;
    private String gender;
    private String size;
    private String brand;

    public ClothingItem(String itemName, String itemID, int itemPrice, User user, String info, ImageView image) {
        super(itemName, itemID, itemPrice, user, info, image);
    }
}
