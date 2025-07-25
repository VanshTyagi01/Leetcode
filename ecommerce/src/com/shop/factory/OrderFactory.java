package com.shop.factory;

import com.shop.db.IOrder;
import com.shop.db.Order;

public class OrderFactory {
    public static IOrder getIOrder(){
        return new Order();
    }
}
