package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class AddItemActivity extends AppCompatActivity {

    Button bookbtn, techbtn, furniturebtn, clothingbtn, stationarybtn ;
    ImageButton searchbtn, chatbtn, helpbtn, settingbtn, profilebtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_item);

        bookbtn = (Button) findViewById(R.id.bookbtn);
        clothingbtn = (Button) findViewById(R.id.clotingbtn);
        techbtn = (Button) findViewById(R.id.technologybtn);
        furniturebtn = (Button) findViewById(R.id.furniturebtn);
        stationarybtn = (Button) findViewById(R.id.stationarybtn);
        searchbtn = (ImageButton) findViewById(R.id.searchbtn);
        chatbtn = (ImageButton) findViewById(R.id.chatbtn);
        helpbtn = (ImageButton) findViewById(R.id.helpbtn);
        settingbtn = (ImageButton) findViewById(R.id.settingbtn);
        profilebtn = (ImageButton) findViewById(R.id.profilebtn);

        bookbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AddItemActivity.this, BookActivity.class);
                startActivity(intent);
            }
        });
        clothingbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AddItemActivity.this, ClothingActivity.class);
                startActivity(intent);
            }
        });
        techbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AddItemActivity.this, TechnologyActivity.class);
                startActivity(intent);
            }
        });
        furniturebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AddItemActivity.this, FurnitureActivity.class);
                startActivity(intent);
            }
        });
        stationarybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AddItemActivity.this, StationaryActivity.class);
                startActivity(intent);
            }
        });
        profilebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AddItemActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });

        searchbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        chatbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        helpbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AddItemActivity.this, HelpPageActivity.class);
                startActivity(intent);
            }
        });

        settingbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AddItemActivity.this, SettingsActivity.class);
                startActivity(intent);
            }
        });
    }
}