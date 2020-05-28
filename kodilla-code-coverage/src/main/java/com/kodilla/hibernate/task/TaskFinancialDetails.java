package com.kodilla.hibernate.task;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
@Table (name = "financial_details")
public class TaskFinancialDetails {

    @Id
    @NotNull
    @GeneratedValue
    @Column(name = "detail_id")
    private int id;
    @NotNull
    @Column(name = "price")
    private BigDecimal price;
    @NotNull
    @Column(name = "paid")
    private boolean paid;

    public TaskFinancialDetails() {
    }

    public TaskFinancialDetails(@NotNull BigDecimal price, @NotNull boolean paid) {
        this.price = price;
        this.paid = paid;
    }

    public int getId() {
        return id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public boolean isPaid() {
        return paid;
    }
}
