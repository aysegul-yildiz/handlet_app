package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignupActivity extends AppCompatActivity {

    EditText mail, name, password, repassword;
    Button signupbutton;
    DBHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        name = findViewById(R.id.username);
        mail = findViewById(R.id.mailtext);
        password = findViewById(R.id.passwordtext);
        repassword = findViewById(R.id.repasswordtext);
        signupbutton = (Button) findViewById(R.id.signupbtn);
        DB = new DBHelper(this);

        signupbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userMail = mail.getText().toString();
                String userPass = password.getText().toString();
                String userRepass = repassword.getText().toString();
                String userName = name.getText().toString();

                if(TextUtils.isEmpty(userMail) || TextUtils.isEmpty(userPass) || TextUtils.isEmpty(userRepass) || TextUtils.isEmpty(userName)){
                    Toast.makeText(SignupActivity.this, "All fields have to be filled!", Toast.LENGTH_SHORT).show();
                }
                else{
                    if(userPass.equals(userRepass)){
                        Boolean checkUser = DB.checkUserMail(userMail);
                        if(checkUser==false){
                            Boolean insertData = DB.insertData(userMail, userPass, userName);
                            if(insertData==true){
                                Toast.makeText(SignupActivity.this, "Signed up successfully!", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
                                startActivity(intent);
                            }
                            else{
                                Toast.makeText(SignupActivity.this, "Sign up process failed.", Toast.LENGTH_SHORT).show();
                            }
                        }
                        else{
                            Toast.makeText(SignupActivity.this, "User already exists.", Toast.LENGTH_SHORT).show();
                        }
                    }
                    else{
                        Toast.makeText(SignupActivity.this, "Passwords are not matching.", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

    }
}