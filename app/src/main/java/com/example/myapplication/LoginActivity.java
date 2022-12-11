package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText mail, password;
    Button loginbtn;
    DBHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mail = findViewById(R.id.emailinput);
        password = findViewById(R.id.passwordinput);
        loginbtn = (Button) findViewById(R.id.loginbtn);
        DB = new DBHelper(this);

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userMail = mail.getText().toString();
                String userPass = password.getText().toString();

                if(TextUtils.isEmpty(userMail) || TextUtils.isEmpty(userPass) ){
                    Toast.makeText(LoginActivity.this, "All fields have to be filled!", Toast.LENGTH_SHORT).show();
                }
                else{
                    Boolean checkUserPass = DB.checkUserPassword(userMail, userPass);
                    if(checkUserPass == true){
                        Toast.makeText(LoginActivity.this, "Login successful!", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
                        intent.putExtra("mail", userMail);
                        startActivity(intent);
                    }
                    else{
                        Toast.makeText(LoginActivity.this, "Log in failed", Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });
    }
}