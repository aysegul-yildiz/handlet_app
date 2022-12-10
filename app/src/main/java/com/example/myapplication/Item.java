package com.example.myapplication;

import android.widget.ImageView;

public abstract class Item {


    private String itemName;
    private String itemID;
    private int itemPrice;
    private User user;
    private String info;
    private ImageView image;

    public Item(String itemName, String itemID, int itemPrice, User user, String info, ImageView image) {
        this.itemName = itemName;
        this.itemID = itemID;
        this.itemPrice = itemPrice;
        this.user = user;
        this.info = info;
        this.image = image;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void setImage(ImageView image) {
        this.image = image;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemID() {
        return itemID;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public User getUser() {
        return user;
    }

    public String getInfo() {
        return info;
    }

    public ImageView getImage() {
        return image;
    }
}
