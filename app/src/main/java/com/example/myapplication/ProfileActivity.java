package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    ImageButton  chatb, searchb, helpbtn, settingbtn, additembtn;
    TextView name, mail;
    String usermail;
    DBHelper DB;
    User user;
    ImageView userImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Intent intent = getIntent();
        usermail = intent.getStringExtra("mail");

        searchb = (ImageButton) findViewById(R.id.searchbtn);
        chatb = (ImageButton) findViewById(R.id.chatbtn);
        helpbtn = (ImageButton) findViewById(R.id.helpbtn);
        settingbtn = (ImageButton) findViewById(R.id.settingbtn);
        userImage = findViewById(R.id.profileImage);
        additembtn = (ImageButton) findViewById(R.id.additembtn);

        name = (TextView) findViewById(R.id.name);
        mail = (TextView) findViewById(R.id.mail);

        //user = DB.getUser(usermail);

        //name.setText(user.getName());
        //mail.setText(user.getMail());

        searchb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        chatb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        helpbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProfileActivity.this, HelpPageActivity.class);
                startActivity(intent);
            }
        });

        settingbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProfileActivity.this, SettingsActivity.class);
                startActivity(intent);
            }
        });
        additembtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProfileActivity.this, AddItemActivity.class);
                startActivity(intent);
            }
        });
    }
}