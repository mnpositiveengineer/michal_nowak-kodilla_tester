package com.kodilla.stream.exception.homework;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Optional;

import static org.junit.Assert.*;

public class WarehouseTestSuite {

    Warehouse warehouse = new Warehouse();

    @Test
    public void ShouldReturnOrderWhenItExists() throws OrderDoesntExistException {
        warehouse.addOrder(new Order("1"));
        Order result = warehouse.getOrder("1");
        assertEquals("1", result.getNumber());
    }

    @Test (expected = OrderDoesntExistException.class)
    public void ShouldReturnExceptionWhenOrderDoesNotExist() throws OrderDoesntExistException {
        warehouse.addOrder(new Order("1"));
        Order result = warehouse.getOrder("2");
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void ShouldReturnExceptionWhenOrderDoesNotExistSecondAttempt() throws OrderDoesntExistException {
        thrown.expect(OrderDoesntExistException.class);
        thrown.expectMessage("Order does not exist dude!");
        warehouse.addOrder(new Order("1"));
        Order result = warehouse.getOrder("2");
    }
}