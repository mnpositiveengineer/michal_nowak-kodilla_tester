package com.kodilla.stream.exception.homework;

public class MainApp {
    public static void main(String[] args) throws Exception {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("number 1"));
        warehouse.addOrder(new Order("number 2"));
        warehouse.addOrder(new Order("number 3"));
        warehouse.addOrder(new Order("number 4"));

        try {
            warehouse.getOrder("number 5");
            System.out.println("You have got the order: ");
        } catch (OrderDoesntExistException e) {
            System.out.println("Order does not exist. Try again.");
        } finally {
            System.out.println("Thank you for being with us.");
        }
    }
}
