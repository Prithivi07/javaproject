package com.prithivi.app;

import java.util.ArrayList;
import java.util.Scanner;

public class Manager extends User{

    Scanner sc = new Scanner(System.in);

    public Manager(String name,String id, String pwd){
        super(name,id,pwd,"manager");
    }
    public void mngOps(ArrayList<Item> itemList){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1->Add Item\n2->Edit Item\n3->Delete Item\n4->View Items\n0->Logout");
            switch (sc.nextInt()) {
                case 1:
                    addItem(itemList);
                    break;
                case 2:
                    editItem(itemList);
                    break;
                case 3:
                    deleteItem(itemList);
                    break;
                case 4:
                    viewItemList(itemList);
                    break;
                case 0:
                    return;
            }
        }
    }
    public void addItem(ArrayList<Item> itemList){
        System.out.println("Enter item name: ");
        String prdName = sc.nextLine();
        System.out.println("Enter item description: ");
        String prdInfo = sc.nextLine();
        System.out.println("Enter item price: ");
        String prdPrice = sc.nextLine();
        System.out.println("Enter item quantity: ");
        int quantity = sc.nextInt();
        itemList.add(new Item(prdName, prdInfo,prdPrice,quantity));
        System.out.println("Item added");
    }
    public void deleteItem(ArrayList<Item> itemList){
        if(itemList.isEmpty()){
            System.out.println("No items to delete");
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the item name");
        String prdName = sc.nextLine();
        for(Item item:itemList){
            if(item.getPrdName().equals(prdName)){
                itemList.remove(item);
                System.out.println("Item removed successfully");
                return;
            }
        }
        System.out.println("Item not found");
    }

    public void updateItem(Item item) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("What you change?\n0->Description\n1->Price\n2->No changes");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 0:
                    item.updPrdInfo(sc.nextLine());
                    System.out.println("Updated");
                    break;
                case 1:
                    item.updPrdPrice(sc.nextLine());
                    System.out.println("Updated");
                    break;
                case 2:
                    return;
            }
        }
    }

    public void editItem(ArrayList<Item> itemList) {
        if (itemList.isEmpty()) {
            System.out.println("No items to edit");
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter item name");
        String prdName = sc.nextLine();
        for (Item item : itemList) {
            if (item.getPrdName().equals(prdName)) {
                updateItem(item);
                return;
            }
        }
        System.out.println("Item not found");
    }

    public void viewItemList(ArrayList<Item> itemList){
        if(itemList.isEmpty()){
            System.out.println("No items to display");
            return;
        }
        for(Item item:itemList){
            System.out.println("Item: "+item.getPrdName() + "| Info: "+item.getPrdInfo() +
                    "| Price: "+item.getPrdPrice()+"| quantity: "+item.getQuantity());
        }
    }
}
