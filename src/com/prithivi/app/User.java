package com.prithivi.app;

public class User {
    private String userName;
    private String userID;
    private String password;
    private String role;

    public User(String name,String id, String pwd, String role){
        this.userName = name;
        this.userID = id;
        this.password = encrypt(pwd);
        this.role = role;
    }

    private String encrypt(String pwd){
        StringBuilder encrypted = new StringBuilder();
        for(char ch:pwd.toCharArray()){
            encrypted.append((char) (ch + 1));
        }
        return encrypted.toString();
    }

    public String getName(){
        return userName;
    }

    public String getID(){
        return userID;
    }

    public String getRole() {
        return role;
    }

    public boolean checkPwd(String pwd){
        return this.password.equals(encrypt(pwd));
    }
}
