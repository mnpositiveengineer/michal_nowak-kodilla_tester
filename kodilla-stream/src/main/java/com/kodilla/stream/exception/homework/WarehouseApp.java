package com.kodilla.stream.exception.homework;

import java.util.Random;
import java.util.Set;

public class WarehouseApp {
    Utils utils = new Utils();
    public static void main(String[] args) throws OrderDoesntExistException {
        generateOrders();
        Warehouse warehouse = new Warehouse();
        Random random = new Random();
        Integer order = random.nextInt(100) + 1;
        String orderString = Integer.toString(order);

        try {
            warehouse.getOrder(orderString);
            System.out.println("You have picked your order number: " + orderString);
        } catch (OrderDoesntExistException e) {
            e.getMessage();
        } finally {
            System.out.println("Thank you.");
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
