package com.prithivi.app;

import java.util.ArrayList;
import java.util.Scanner;

public class Admin extends User {

    public Admin(String name, String id, String pwd) {
        super(name, id, pwd, "admin");
    }

    private User createUser() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter User ID: ");
        String userid = sc.nextLine();
        System.out.print("Enter Password: ");
        String password = sc.nextLine();
        System.out.print("Enter role: ");
        String userType = sc.nextLine();
        User newUser = new User(name,userid,password,userType);
        System.out.println("User created successfully.");
        return newUser;
    }
    private void userlist(ArrayList<User> userslist){
        for(User i:userslist){
            System.out.println(i.getname() + " " + i.getRole());
        }
    }

    public void adminops(ArrayList<User> ad){
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter your choice:\n1-->Create User\n2-->View users\n0-->Logout");
            switch(sc.nextInt())
            {
                case 0:
                    return;
                case 1:
                    ad.add(createUser());
                    break;
                case 2:
                    userlist(ad);
                default:
            }
        }
    }
}
