package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Shop {
    Set<Order> orders = new HashSet<>();

    public void addOrder(Order order) throws NullOrderException{
        orders.add(order);
    }

    public List<Order> getOrdersFromGivenRangeOfDates(LocalDate min, LocalDate max) throws NoOrderInGivenRangeException {
        LocalDate newMin = min.minusDays(1);
        LocalDate newMax = max.plusDays(1);
        return orders.stream().filter(u->u.getDate().isAfter(newMin)).filter(u->u.getDate().isBefore(newMax)).sorted(Comparator.comparing(Order::getDate)).collect(Collectors.toList());
    }

    public List<Order> getOrdersFromGivenRangeOfValues(double min, double max) throws NoOrderInGivenRangeException {
        return orders.stream().filter(u->u.getPrice()>=min).filter(u->u.getPrice()<=max).sorted(Comparator.comparing(Order::getPrice)).collect(Collectors.toList());
    }

    public int getNumbersOfOrders(){
        return orders.size();
    }

    public double sumPricesOfAllOrders() {
        return orders.stream().map(u->u.getPrice()).mapToDouble(u->u).sum();
    }

}
