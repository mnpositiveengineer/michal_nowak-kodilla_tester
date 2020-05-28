package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name = "invoices")
public class Invoice {

    @Id
    @NotNull
    @GeneratedValue
    @Column(name = "invoice_id", unique = true)
    private int id;
    @NotNull
    @Column(name = "number")
    private String number;
    @OneToMany(targetEntity = Item.class, mappedBy = "invoice", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Item> items = new ArrayList<>();

    public Invoice() {
    }

    public Invoice(@NotNull String number) {
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public List<Item> getItems() {
        return items;
    }

}
