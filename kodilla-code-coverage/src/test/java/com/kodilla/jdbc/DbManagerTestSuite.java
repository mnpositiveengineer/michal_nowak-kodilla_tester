package com.kodilla.jdbc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.xml.transform.Result;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class DbManagerTestSuite {

    @Test
    public void testConnect() throws SQLException {
        //Given
        //When
        DbManager dbManager = DbManager.getInstance();
        //Then
        Assertions.assertNotNull(dbManager.getConnection());
    }

    @Test
    public void testSelectCustomers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        String countQuery = "SELECT COUNT(*) AS NUMBER FROM SAKILA.CUSTOMER";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(countQuery);
        int count = 0;
        while (rs.next()) {
            count = rs.getInt("NUMBER");
        }
        System.out.println(count);
        String sql = "INSERT INTO CUSTOMER (store_id, first_name, last_name, address_id) VALUES (1, 'Zara', 'Ali', 1)";
        statement.executeUpdate(sql);
        //Then
        String sqlQuery = "SELECT * FROM CUSTOMER";
        rs = statement.executeQuery(sqlQuery);

        int counter = 0;
        while(rs.next()) {
            System.out.println(rs.getInt("customer_id")
                    + ", " + rs.getString("first_name")
                    + ", " + rs.getString("last_name"));
           counter++;
        }

        int expected = count + 1;
        Assertions.assertEquals(expected, counter);
        rs.close();
        statement.close();
    }

    @Test
    public void selectCustomersWithTotalAmountOfPaymentsMoreThan150() throws SQLException {
        //GIVEN
        DbManager dbManager = DbManager.getInstance();
        String customersWithTotalAmountOfPaymentsMoreThan150 =
                "SELECT DISTINCT p.customer_id, c.first_name, c.last_name, sum(p.amount) as debt, avg(p.amount) as average\n" +
                        "FROM sakila.payment as p\n" +
                        "JOIN sakila.customer as c\n" +
                        "ON p.customer_id = c.customer_id\n" +
                        "GROUP BY p.customer_id\n" +
                        "having debt > 150\n" +
                        "ORDER BY debt DESC";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(customersWithTotalAmountOfPaymentsMoreThan150);
        int countCustomers = 0;
        while(rs.next()) {
            countCustomers++;
        }

        //WHEN
        String addFirstCustomer = "INSERT INTO sakila.customer (store_id, first_name, last_name, address_id) VALUES (1, 'Johny', 'Error', 1)";
        String addSecondCustomer = "INSERT INTO sakila.customer (store_id, first_name, last_name, address_id) VALUES (1, 'Alan', 'Smith', 1)";
        String addFirstCustomerPayment = "INSERT INTO sakila.payment (customer_id, staff_id, rental_id, amount) VALUES ((SELECT customer_id FROM sakila.customer where first_name=\"Johny\" and last_name=\"Error\"), 1, 1, 155)";
        String addSecondCustomerPayment = "INSERT INTO sakila.payment (customer_id, staff_id, rental_id, amount) VALUES ((SELECT customer_id FROM sakila.customer where first_name=\"Alan\" and last_name=\"Smith\"), 1, 1, 150)";
        statement.executeUpdate(addFirstCustomer);
        statement.executeUpdate(addSecondCustomer);
        statement.executeUpdate(addFirstCustomerPayment);
        statement.executeUpdate(addSecondCustomerPayment);

        //THEN
        String sqlQuery = "SELECT DISTINCT p.customer_id, c.first_name, c.last_name, sum(p.amount) as debt, avg(p.amount) as average\n" +
                "FROM sakila.payment as p\n" +
                "JOIN sakila.customer as c\n" +
                "ON p.customer_id = c.customer_id\n" +
                "GROUP BY p.customer_id\n" +
                "having debt > 150\n" +
                "ORDER BY debt DESC";
        rs = statement.executeQuery(sqlQuery);
        int actualNumberOfCustomers = 0;
        while (rs.next()) {
            System.out.println(rs.getInt("customer_id") + ", " +
                    rs.getString("first_name") + ", " +
                    rs.getString("last_name") + ", "+
                    rs.getDouble("debt"));
            actualNumberOfCustomers++;
        }

        int expectedNumbersOfcustomers = countCustomers + 1;

        Assertions.assertEquals(expectedNumbersOfcustomers, actualNumberOfCustomers);

        String deleteFirstCustomerPayment = "DELETE FROM sakila.payment where customer_id = (SELECT customer_id FROM sakila.customer where first_name=\"Johny\" and last_name=\"Error\")";
        String deleteSecondCustomerPayment = "DELETE FROM sakila.payment where customer_id = (SELECT customer_id FROM sakila.customer where first_name=\"Alan\" and last_name=\"Smith\")";
        String deleteFirstCustomer = "DELETE FROM sakila.customer where first_name=\"Johny\" and last_name=\"Error\"";
        String deleteSecondCustomer = "DELETE FROM sakila.customer where first_name=\"Alan\" and last_name=\"Smith\"";
        statement.executeUpdate(deleteFirstCustomerPayment);
        statement.executeUpdate(deleteSecondCustomerPayment);
        statement.executeUpdate(deleteFirstCustomer);
        statement.executeUpdate(deleteSecondCustomer);

    }

}