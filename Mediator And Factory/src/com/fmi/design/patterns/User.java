package com.fmi.design.patterns;

public class User extends ChatUser {

    public User(String username) {
        this.username = username;
    }

    @Override
    public void receive(String message) {
        System.out.println(username + " <-- " + message);
    }

}
