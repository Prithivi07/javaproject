package com.prithivi.app;

import java.util.ArrayList;
import java.util.Scanner;

public class Inventory {
    private ArrayList<User> users = new ArrayList<>();
    private ArrayList<Item> items = new ArrayList<>();

    public Inventory(User adminuser){
        this.users.add(adminuser);
    }
    private User login(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter UserID: ");
        String id = sc.nextLine();
        System.out.println("Enter Password: ");
        String pwd = sc.nextLine();

        for(User i:users){
            if(id.equals(i.getID()) && i.checkpwd(pwd)){
                System.out.println("Logged in successfully");
                return i;
            }
        }
        return null;
    }

    public ArrayList<User> getUser(){
        return this.users;
    }

    public void loginOperation(){
        User loguser = login();
        switch(loguser.getRole()){
            case "admin" ->
                    ((Admin) loguser).adminops(this.users);
        }
    }
}
