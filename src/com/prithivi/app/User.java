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
        String encrypted = "";
        for(char ch:pwd.toCharArray()){
            encrypted += (char)(ch + 1);
        }
        return encrypted;
    }

    public String getname(){
        return this.userName;
    }

    public String getID(){
        return this.userID;
    }

    public String getRole() {
        return role;
    }

    public boolean checkpwd(String pwd){
        return this.password.equals(encrypt(pwd));
    }
}
