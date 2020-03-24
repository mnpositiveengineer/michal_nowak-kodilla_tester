package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import java.util.Random;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ConfigurationClass {

    Random random = new Random();


    @Bean
    public Car getCar () {
        int season = random.nextInt(4);
        if (season == 0 ) {
            System.out.println("This is Spring.");
            return new Sedan();
        } else if (season == 1) {
            System.out.println("This is Summer.");
            return new Cabrio();
        } else if (season == 2) {
            System.out.println("This is Autumn.");
            return new Sedan();
        } else {
            System.out.println("This is Winter.");
            return new Suv();
        }
    }
}
