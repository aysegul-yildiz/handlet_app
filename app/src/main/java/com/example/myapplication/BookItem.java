package com.example.myapplication;

import android.widget.ImageView;


public class BookItem extends Item {

    private String bookAuthor;
    private String booktitle;
    private String publishDate;
    private int pageCount;

    public BookItem(String itemName, String itemID, int itemPrice, User user, String info, ImageView image) {
        super(itemName, itemID, itemPrice, user, info, image);
    }
}
