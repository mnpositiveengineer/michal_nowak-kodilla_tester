package com.kodilla.spring.basic.spring_configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
public class RandomAnimal {

    @Bean
    public Animal createAnimal() {
        Random random = new Random();
        int chosen = random.nextInt(3);
        if (chosen == 0) {
            return new Dog();
        } else if (chosen == 1) {
            return new Cat();
        } else {
            return new Duck();
        }
    }
}
