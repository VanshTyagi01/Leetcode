package com.shop.ui;

import com.shop.db.Order;
import com.shop.factory.OrderFactory;
import com.shop.db.IOrder;

public class Customer {
   int id;
   String name; 

   void buy(){
        IOrder order = OrderFactory.getIOrder();
        order.showOrder();
        //order.summary();
   }


   public static void main(String[] args) {
    Customer customer = new Customer();
        customer.buy();
        
   }
}
