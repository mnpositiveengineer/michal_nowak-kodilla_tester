package com.kodilla.stream.exception.homework;

import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;

public class WarehouseTestSuite {

    @Test
    public void ShouldReturnOrderWhenItExists() throws OrderDoesntExistException {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("1"));
        Optional<Order> result = warehouse.getOrder("1");
        assertEquals("1", result.get().getNumber());
    }

    @Test (expected = OrderDoesntExistException.class)
    public void ShouldReturnExceptionWhenOrderDoesNotExist() throws OrderDoesntExistException {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("1"));
        Optional<Order> result = warehouse.getOrder("2");
    }
}