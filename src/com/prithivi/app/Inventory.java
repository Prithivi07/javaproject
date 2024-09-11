package com.prithivi.app;

import java.util.ArrayList;
import java.util.Scanner;

public class Inventory {
    private final ArrayList<User> users = new ArrayList<>();
    private final ArrayList<Item> items = new ArrayList<>();

    public Inventory(User adminuser){
        this.users.add(adminuser);
    }

    private User login(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter UserID: ");
        String id = sc.nextLine();
        System.out.println("Enter Password: ");
        String pwd = sc.nextLine();

        for(User user:users){
            if(id.equals(user.getID()) && user.checkPwd(pwd)){
                System.out.println("Logged in successfully");
                return user;
            }
        }
        return null;
    }

    public void loginOperation(){
        User loguser = login();
        if(loguser!=null){
        switch(loguser.getRole()){
            case "admin":
                ((Admin) loguser).adminOps(this.users);
                break;
            case "manager":
                ((Manager) loguser).mngOps(this.items);
                break;
            case "customer":
                break;
        }}
        else{
            System.out.println("Incorrect user id or password");
        }
    }
}
