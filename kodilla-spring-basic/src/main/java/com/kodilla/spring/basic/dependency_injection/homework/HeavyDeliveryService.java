package com.kodilla.spring.basic.dependency_injection.homework;

public class HeavyDeliveryService implements DeliveryService {
    @Override
    public boolean deliverPackage(String address, double weight) {
        if (weight < 30) {
            System.out.println("Delivery in progress...");
            return true;
        }
        System.out.println("Use another delivery service.");
        return false;
    }
}
