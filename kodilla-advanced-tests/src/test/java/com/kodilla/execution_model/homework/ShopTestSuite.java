package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.*;
import static org.junit.Assert.*;

public class ShopTestSuite {

    Shop shop = new Shop();

    @BeforeEach
    public void add_To_Orders() throws NullOrderException {
        shop.addOrder(new Order("Order1", 100.99, LocalDate.of(2020, 01, 3),
                "abcd"));
        shop.addOrder(new Order("Order2", 110.99, LocalDate.of(2020, 01, 4),
                "efgh"));
        shop.addOrder(new Order("Order3", 120.99, LocalDate.of(2020, 01, 5),
                "ijkl"));
        shop.addOrder(new Order("Order4", 130.99, LocalDate.of(2020, 01, 6),
                "mnop"));
    }

    @Test
    public void Should_Return_Four_Orders() {
        assertEquals(4, shop.getNumbersOfOrders());
    }

    @Test
    public void Should_Return_Zero_Orders() {
        shop.orders.clear();
        assertEquals(0, shop.getNumbersOfOrders());
    }

    @Test
    public void Should_Return_Exception_When_Adding_Null_Order() {
        try {
            shop.addOrder(null);
        } catch (NullOrderException e){
            assertEquals("Create and order first.", e.getMessage());
        }
    }
    @Test
    public void Should_Return_Exception_When_Adding_Null_Order_Another_Method () {
        Assertions.assertThrows(NullOrderException.class, () ->shop.addOrder(null));
    }

    @Test
    public void Should_Get_Orders_From_Given_Range_Of_Dates() throws NoOrderInGivenRangeException {
        //GIVEN (FOR DATES BETWEEN 04.01.2020 and 06.01.2020)
        List<Order> expectedList = new ArrayList<>();
        expectedList.add(new Order("Order2", 110.99, LocalDate.of(2020, 01, 4),
                "efgh"));
        expectedList.add(new Order("Order3", 120.99, LocalDate.of(2020, 01, 5),
                "ijkl"));
        expectedList.add(new Order("Order4", 130.99, LocalDate.of(2020, 01, 6),
                "mnop"));
        //WHEN (FOR DATES BETWEEN 04.01.2020 and 06.01.2020)
        List<Order> actualList = shop.getOrdersFromGivenRangeOfDates(LocalDate.of(2020, 01, 4),
                LocalDate.of(2020, 01, 6));
        //THEN
        assertEquals(expectedList.get(0), actualList.get(0));
        assertEquals(expectedList.get(1), actualList.get(1));
        assertEquals(expectedList.get(2), actualList.get(2));
    }

    @Test
    public void Should_Return_Exception_When_There_Is_No_Order_In_Given_Range_Of_Dates() {
        try {
            shop.getOrdersFromGivenRangeOfDates(LocalDate.of(2019, 01, 3),
                    LocalDate.of(2019, 01, 6));
        } catch (NoOrderInGivenRangeException e) {
            assertEquals("There is no order in given range", e.getMessage());
        }
    }

    @Test
    public void Should_Return_Exception_When_There_Is_No_Order_In_Given_Range_Of_Dates_Anther_Method() {
        Assertions.assertThrows(NoOrderInGivenRangeException.class, () ->
                shop.getOrdersFromGivenRangeOfDates
                        (LocalDate.of(2019, 01, 3),
                                LocalDate.of(2019, 01, 6)));
    }


    @Test
    public void Should_Get_Orders_From_Given_Range_Of_Values() throws NoOrderInGivenRangeException {
        //GIVEN (FOR PRICES BETWEEN 100 and 130)
        List<Order> expectedList = new ArrayList<>();
        expectedList.add(new Order("Order1", 100.99, LocalDate.of(2020, 01, 3),
                "abcd"));
        expectedList.add(new Order("Order2", 110.99, LocalDate.of(2020, 01, 4),
                "efgh"));
        expectedList.add(new Order("Order3", 120.99, LocalDate.of(2020, 01, 5),
                "ijkl"));
        //WHEN
        Order order1 = shop.getOrdersFromGivenRangeOfValues(100,130).get(0);
        Order order2 = shop.getOrdersFromGivenRangeOfValues(100,130).get(1);
        Order order3 = shop.getOrdersFromGivenRangeOfValues(100,130).get(2);
        //THEN
        assertEquals(expectedList.get(0), order1);
        assertEquals(expectedList.get(1), order2);
        assertEquals(expectedList.get(2), order3);
    }

    @Test
    public void Should_Return_Exception_When_There_Is_No_Order_In_Given_Range_Of_Values() {
        try {
            shop.getOrdersFromGivenRangeOfValues(0, 50);
        } catch (NoOrderInGivenRangeException e) {
            assertEquals("There is no order in given range", e.getMessage());
        }
    }

    @Test
    public void Should_Return_Exception_When_There_Is_No_Order_In_Given_Range_Of_Values_Another_Method() {
        Assertions.assertThrows(NoOrderInGivenRangeException.class, ()-> shop.getOrdersFromGivenRangeOfValues(0,50));
    }

    @Test
    public void Should_Return_Sum_Prices_Of_All_Orders() {
        double expectedSum = 100.99 + 110.99 + 120.99 + 130.99;
        assertEquals(expectedSum, shop.sumPricesOfAllOrders(),0.01);
    }
}