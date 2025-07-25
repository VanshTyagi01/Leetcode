package com.shop.db;

public class Order implements IOrder{
    public void showOrder(){
        System.out.println("Show Order");
        summary(2, 5);
    }
    public void summary(int a, int b){
        System.out.println("Summary");
    }
    public void callDel(){

    }
}
