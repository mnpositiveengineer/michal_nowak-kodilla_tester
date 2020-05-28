package com.kodilla.hibernate.manytomany.repository;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class )
@SpringBootTest
class CompanyRepositoryTestSuite {

    @Autowired
    private CompanyRepository companyRepository;
    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    public void testSaveManyToMany() {
        //GIVEN
        Employee employee1 = new Employee("A", "B");
        Employee employee2 = new Employee("C", "D");
        Employee employee3 = new Employee("E", "F");
        Company company1 = new Company("X");
        Company company2 = new Company("Y");
        Company company3 = new Company("Z");
        employee1.getCompanies().add(company2);
        employee1.getCompanies().add(company3);
        employee2.getCompanies().add(company1);
        employee2.getCompanies().add(company3);
        employee3.getCompanies().add(company1);
        employee3.getCompanies().add(company2);
        company1.getEmployees().add(employee2);
        company1.getEmployees().add(employee3);
        company2.getEmployees().add(employee1);
        company2.getEmployees().add(employee3);
        company3.getEmployees().add(employee1);
        company3.getEmployees().add(employee2);
        //WHEN
        companyRepository.save(company1);
        companyRepository.save(company2);
        companyRepository.save(company3);
        //THEN
        Assertions.assertEquals(3, companyRepository.count());
        Assertions.assertEquals(3, employeeRepository.count());
        //CLEANUP
        companyRepository.deleteAll();
        employeeRepository.deleteAll();
        //AND
        Assertions.assertEquals(0, companyRepository.count());
        Assertions.assertEquals(0, employeeRepository.count());;
    }

}