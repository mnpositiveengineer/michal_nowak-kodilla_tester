package com.kodilla.stream.exception.homework;

import java.util.Random;
import java.util.Set;

public class WarehouseApp {
    public static void main(String[] args) throws OrderDoesntExistException {
        Warehouse warehouse = new Warehouse();
        System.out.println(generateOrders().size());

        try {
            generateOrders().;
            System.out.println("You have picked your order");
        } catch (OrderDoesntExistException e) {
            String message = new OrderDoesntExistException().getMessage();
            System.out.println(message);
        } finally {
            System.out.println("Thank you");
        }
    }

    private static Set<Order> generateOrders() {
        Warehouse warehouse = new Warehouse();
        Random random = new Random();
        for (int i =0; i < random.nextInt(100) + 1; i++){
           Integer order = random.nextInt(100) + 1;
            String orderString = Integer.toString(order);
            warehouse.addOrder(new Order(orderString));
        }
        return warehouse.getOrders();
    }
}
