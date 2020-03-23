package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.stereotype.Component;

@Component
public interface DeliveryService {

    public boolean deliverPackage(String address, double weight);
}
