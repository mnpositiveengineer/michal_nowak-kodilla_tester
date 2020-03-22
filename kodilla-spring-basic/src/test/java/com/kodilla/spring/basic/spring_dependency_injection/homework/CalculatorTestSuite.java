package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CalculatorTestSuite {

    ApplicationContext context =  new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
    Calculator bean = context.getBean(Calculator.class);

    @Test
    void add() {
        double actualResult = bean.add(8.0,2.0);
        Assertions.assertEquals(10, actualResult);
    }

    @Test
    void subtract() {
        double actualResult = bean.subtract(8.0,2.0);
        Assertions.assertEquals(6, actualResult);
    }

    @Test
    void multiply() {
        double actualResult = bean.multiply(8.0,2.0);
        Assertions.assertEquals(16, actualResult);
    }

    @Test
    void divide() {
        double actualResult = bean.divide(8.0,2.0);
        Assertions.assertEquals(4, actualResult);
    }
}