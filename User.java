package com.example.myapplication;

public class User {
    private String name, password, mail;
    private int rating;

    public User(String name, String mail, String password) {
        this.name = name;
        this.mail = mail;
        this.password = password;
    }

    public String getMail() {
        return mail;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public int getRating() {
        return rating;
    }
}
