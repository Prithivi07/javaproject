package com.prithivi.app;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args){
        Inventory inv = new Inventory(new Admin("Prithivi","ID123","1234"));
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter your choice:\n1-->Login\n0-->Exit");
            switch(sc.nextInt()){
                case 1:
                    inv.loginOperation();
                    break;
                case 0:
                    return;
                default:
                    System.out.print("Enter a valid choice");
            }
        }
    }
}
