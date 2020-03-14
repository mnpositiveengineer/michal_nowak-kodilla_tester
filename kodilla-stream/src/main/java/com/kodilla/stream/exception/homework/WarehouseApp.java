package com.kodilla.stream.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) throws OrderDoesntExistException {
        Warehouse warehouse = new Warehouse();

        warehouse.addOrder(new Order("1"));
        warehouse.addOrder(new Order("2"));
        warehouse.addOrder(new Order("3"));
        warehouse.addOrder(new Order("4"));

        try {
            warehouse.getOrder("5");
            System.out.println("You have picked your order");
        } catch (OrderDoesntExistException e) {
            throw new OrderDoesntExistException();
        } finally {
            System.out.println("Thank you");
        }
    }
}
