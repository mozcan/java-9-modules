package com.order.dao;

import com.order.model.Order;

public class OrderDao {

    public void orderCreate(Order order) {
        System.out.println("""
                Book Name """ + order.bookName() + """
                Book Author """ + order.orderDate());
        System.out.println("New order has been created!");
    }
}
