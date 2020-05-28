package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
@Table (name = "items")
public class Item {

    @Id
    @GeneratedValue
    @NotNull
    @Column (name = "item_id", unique = true)
    private int id;
    @ManyToOne (cascade = CascadeType.ALL)
    @JoinColumn (name = "product_id")
    private Product product;
    @NotNull
    @Column (name = "price")
    private BigDecimal price;
    @NotNull
    @Column (name = "quantity")
    private int quantity;
    @NotNull
    @Column (name = "value")
    private BigDecimal value;
    @ManyToOne (cascade = CascadeType.ALL)
    @JoinColumn(name = "invoice_id")
    private Invoice invoice;

    public Item() {
    }

    public Item(@NotNull Product product, @NotNull BigDecimal price, @NotNull int quantity) {
        this.product = product;
        this.price = price;
        this.quantity = quantity;
        this.value = price.multiply(new BigDecimal(quantity));
    }

    public int getId() {
        return id;
    }

    public Product getProduct() {
        return product;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public BigDecimal getValue() {
        return value;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
}
