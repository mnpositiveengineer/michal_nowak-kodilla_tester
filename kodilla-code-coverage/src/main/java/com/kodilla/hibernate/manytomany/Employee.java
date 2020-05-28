package com.kodilla.hibernate.manytomany;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name = "employees")
public class Employee {

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "employee_id", unique = true)
    private long id;
    @NotNull
    @Column(name = "first_name")
    private String firstName;
    @NotNull
    @Column(name = "last_name")
    private String lastName;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "employee_company", joinColumns = {@JoinColumn(name = "employee_id", referencedColumnName = "employee_id")},
    inverseJoinColumns = {@JoinColumn(name = "company_id", referencedColumnName = "company_id")})
    private List<Company> companies = new ArrayList<>();

    public Employee(){}

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<Company> getCompanies() {
        return companies;
    }
}
