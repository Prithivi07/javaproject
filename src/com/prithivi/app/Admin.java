package com.prithivi.app;

import java.util.ArrayList;
import java.util.Scanner;

public class Admin extends User {

    public Admin(String name, String id, String pwd) {
        super(name, id, pwd, "admin");
    }

    private void createUser(ArrayList<User> userList) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter User ID: ");
        String userid = sc.nextLine();
        System.out.print("Enter Password: ");
        String password = sc.nextLine();
        System.out.println("Choose role:\n0->Admin\n1->Manager\n2->Customer");
        int ch = sc.nextInt();
        switch (ch){
            case 0 -> userList.add(new Admin(name,userid,password));
            case 1 -> userList.add(new Manager(name,userid,password));
            case 2 -> userList.add(new User(name,userid,password,"customer"));
        }
        System.out.println("User created successfully.");
    }
    private void getUserList(ArrayList<User> userList){
        for(User i:userList){
            System.out.println(i.getName() + " " + i.getRole());
        }
    }

    private void deleteUser(ArrayList<User> userList){
        Scanner sc = new Scanner(System.in);
        String userID = sc.nextLine();
        System.out.println("Enter your password");
        String pwd = sc.nextLine();
        if(this.checkPwd(pwd)){
            for(User user:userList){
                if(user.getID().equals(userID))
                {
                    userList.remove(user);
                    System.out.println("Removed successfully");
                    return;
                }
            }
            System.out.println("Not found");
        }
    }

    public void adminOps(ArrayList<User> ad){
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter your choice:\n1->Create User\n2->View users\n" +
                    "3->Delete User\n0->Logout");
            switch(sc.nextInt())
            {
                case 1:
                    this.createUser(ad);
                    break;
                case 2:
                    this.getUserList(ad);
                    break;
                case 3:
                    this.deleteUser(ad);
                    break;
                case 0:
                    return;
            }
        }
    }
}
