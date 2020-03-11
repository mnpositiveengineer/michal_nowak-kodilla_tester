package com.kodilla.stream.exception.homework;

import com.kodilla.stream.exception.FirstExample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Warehouse {

    List<Order> orderList = new ArrayList<>();

    public void addOrder(Order order) {
        orderList.add(order);
    }

    public Order getOrder(String number) throws OrderDoesntExistException {
        return orderList.stream()
                .filter(u -> u.getNumber() == number).findFirst().orElseThrow(OrderDoesntExistException::new);
    }
}
               //.filter(u -> u.getNumber() == number).findFirst().get()

//.filter(u -> u.getNumber() == number).findFirst().orElseThrow(()->new Exception("Error"));