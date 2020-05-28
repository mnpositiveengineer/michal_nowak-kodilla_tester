package com.kodilla.hibernate.invoice.repository;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class InvoiceRepositoryTestSuite {

    @Autowired
    private InvoiceRepository invoiceRepository;
    @Autowired
    private ItemRepository itemRepository;
    @Autowired
    private ProductRepository productRepository;

    @Test
    public void testInvoiceRepositorySave() {
        //GIVEN
        Invoice invoice1 = new Invoice("INVOICE1");
        Invoice invoice2 = new Invoice("INVOICE2");

        Product product1 = new Product("product1");
        Product product2 = new Product("product2");
        Product product3 = new Product("product3");

        Item item1 = new Item(product1, new BigDecimal(30), 10);
        Item item2 = new Item(product2, new BigDecimal(40), 5);
        Item item3 = new Item(product3, new BigDecimal(50), 2);
        Item item4 = new Item(product1, new BigDecimal(30), 20);
        Item item5 = new Item(product3, new BigDecimal(50), 4);

        product1.getItems().add(item1);
        product1.getItems().add(item4);
        product2.getItems().add(item2);
        product3.getItems().add(item3);
        product3.getItems().add(item5);

        invoice1.getItems().add(item1);
        invoice1.getItems().add(item2);
        invoice1.getItems().add(item3);
        invoice2.getItems().add(item4);
        invoice2.getItems().add(item5);

        item1.setInvoice(invoice1);
        item2.setInvoice(invoice1);
        item3.setInvoice(invoice1);
        item4.setInvoice(invoice2);
        item5.setInvoice(invoice2);

        //WHEN
        invoiceRepository.save(invoice1);
        invoiceRepository.save(invoice2);
        //THEN
        Assertions.assertEquals(2, invoiceRepository.count());
        Assertions.assertEquals(5, itemRepository.count());
        Assertions.assertEquals(3, productRepository.count());
        //CLEANUP
        invoiceRepository.deleteAll();
        itemRepository.deleteAll();
        productRepository.deleteAll();
        //THEN
        Assertions.assertEquals(0, invoiceRepository.count());
        Assertions.assertEquals(0, itemRepository.count());
        Assertions.assertEquals(0, productRepository.count());
    }

}