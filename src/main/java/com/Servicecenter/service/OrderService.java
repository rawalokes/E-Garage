package com.Servicecenter.service;

import com.Servicecenter.model.Order;

import java.util.List;

public interface OrderService {
    public Order addOrder(Order order);
    public List<Order> getall();
    public  Order getByid(int id);
    public Order editOrder(int id ,Order order);
    public Order deleteOrder(int id);

}
