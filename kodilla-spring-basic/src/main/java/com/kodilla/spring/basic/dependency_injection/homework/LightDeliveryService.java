package com.kodilla.spring.basic.dependency_injection.homework;

public class LightDeliveryService implements DeliveryService {
    @Override
    public boolean deliverPackage(String address, double weight) {
        if (weight < 20) {
            System.out.println("Delivery in progress...");
            return true;
        }
        System.out.println("Use another delivery service.");
        return false;
    }
}
