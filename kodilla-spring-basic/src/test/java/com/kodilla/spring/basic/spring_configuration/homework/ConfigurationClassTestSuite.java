package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
class ConfigurationClassTestSuite {

    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
    Car car = (Car) context.getBean("getCar");
    Car car1= (Car) context.getBean("getCar");

    @Test
    public void checkCars() {
        Assertions.assertEquals(car, car1);
    }

    @Test
    public void getCarTesting() {
        //When
        String carType = car.getCarType();
        List<String> possibleCarTypes = Arrays.asList("Car Type - Suv.", "Car Type - Cabrio.", "Car Type - Sedan.");
        //Then
        System.out.println(carType);
        Assertions.assertTrue(possibleCarTypes.contains(carType));
    }

    @Test
    public void LightsTesting_Six_AM() {
        //when
        boolean lights = car.hasHeadlightsTurnedOn(6);
        //then
        Assertions.assertTrue(lights);
    }

    @Test
    public void LightsTesting_Eight_PM() {
        //when
        boolean lights = car.hasHeadlightsTurnedOn(20);
        //then
        Assertions.assertTrue(lights);
    }

    @Test
    public void LightsTesting_Seven_AM() {
        //when
        boolean lights = car.hasHeadlightsTurnedOn(7);
        //then
        Assertions.assertFalse(lights);
    }

    @Test
    public void LightsTesting_Seven_PM() {
        //when
        boolean lights = car.hasHeadlightsTurnedOn(19);
        //then
        Assertions.assertFalse(lights);
    }

}