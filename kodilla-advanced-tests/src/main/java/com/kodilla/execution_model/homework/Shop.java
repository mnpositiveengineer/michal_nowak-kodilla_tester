package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Shop {
    Set<Order> orders = new HashSet<>();

    public void addOrder(Order order){
        orders.add(order);
    }

    public List<Order> getOrdersFromGivenRangeOfDates(LocalDate min, LocalDate max) throws NoOrderException{
        return null;
    }

    public List<Order> getOrdersFromGivenRangeOfValues(double min, double max) throws NoOrderException{
        return null;
    }

    public int getNumbersOfOrders(){
        return 0;
    }

    public double sumPricesOfAllOrders() {
        return 0;
    }

}
