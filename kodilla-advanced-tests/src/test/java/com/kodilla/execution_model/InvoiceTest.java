package com.kodilla.execution_model;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class InvoiceTest {

    Invoice invoice = new Invoice();

    @BeforeEach
    public void initializeInvoice(){
        invoice.addItems(new Item("Shoes", 255));
        invoice.addItems(new Item("T-shirt", 70));
        invoice.addItems(new Item("Dress", 1700));
    }

    @AfterEach
    public void showStatus() {
        System.out.println("Test executed");
    }

    @AfterAll
    public static void showFinalStatus() {
        System.out.println("Finishing tests");
    }


    @Test
    public void ShouldAddNewItemsToTheList(){
        int result = invoice.getSize();
        assertEquals(3, result);
    }

    @Test
    public void ShouldAddThreeItemsAndGetTheSecondItemProperly(){
        Item pickedItem = invoice.getItems(1);
        Item expectedItem = new Item ("T-shirt", 70);
        assertTrue(pickedItem.equals(expectedItem));
        assertEquals(expectedItem, pickedItem);
    }

    @Test
    public void ShouldReturnNullWhenPickedItemWithMinusIndex() {
        assertNull(invoice.getItems(-1));
    }

    @Test
    public void ShouldReturnNullWhenPickedItemWithToLargeIndex(){
        assertNull(invoice.getItems(10));
    }

    @Test
    public void ShouldClearAllTheItems() {
        invoice.clear();
        assertEquals(0, invoice.getSize());
    }
}