package com.kodilla.stream.exception.homework;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class Warehouse {
    private Set<Order> orders = new HashSet<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public Optional<Order> getOrder(String number) throws OrderDoesntExistException {
        if (orders.contains(new Order(number))) {
            Optional<Order> order = orders
                    .stream()
                    .filter(u -> u.getNumber().equals(number))
                    .findFirst();
            return order;
        } else {
            throw new OrderDoesntExistException();
        }
    }
}
