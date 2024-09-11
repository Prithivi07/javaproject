package com.prithivi.app;

public class Manager extends User{
    public Manager(String name,String id, String pwd){
        super(name,id,pwd,"manager");
    }
    public void mngOps(){
        System.out.println("1->Add Item\n2->Edit Item\n3->Delete Item");
    }
}
