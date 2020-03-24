package com.kodilla.spring.basic.spring_scopes.homework;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class ClockTestSuite {

    ApplicationContext context = new AnnotationConfigApplicationContext ("com.kodilla.spring.basic");
    Clock clock1 = context.getBean(Clock.class);
    Clock clock2 = context.getBean(Clock.class);
    Clock clock3 = context.getBean(Clock.class);

    @Test
    public void checkTime() {
        Assertions.assertNotEquals(clock1, clock2);
        Assertions.assertNotEquals(clock1, clock3);
        Assertions.assertNotEquals(clock2, clock3);
    }
}