package com.order.service;

import com.book.service.BookService;
import com.order.dao.OrderDao;
import com.order.model.Order;

import java.time.LocalDate;

public class OrderService {

    private BookService bookService;

    private OrderDao orderDao;

    public OrderService(BookService bookService,
                        OrderDao orderDao) {
        this.bookService = bookService;
        this.orderDao = orderDao;
    }

    public void createOrder() {
        var book = this.bookService.getBook();
        var order = new Order(book.name(), LocalDate.now());

        this.orderDao.orderCreate(order);
    }
}
