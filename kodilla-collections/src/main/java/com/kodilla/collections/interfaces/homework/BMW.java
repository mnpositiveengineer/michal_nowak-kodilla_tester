package com.kodilla.collections.interfaces.homework;

public class BMW implements Car {

    private int speed;
    private int increase;
    private int decrease;
    private String carName;

    public BMW(int speed) {
        this.speed = speed;
        this.increase = 60;
        this.decrease = 70;
        this.carName = "BMW";
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public int increaseSpeed() {
        return this.speed = this.speed + this.increase;
    }

    @Override
    public int decreaseSpeed() {
        return this.speed = this.speed - this.decrease;
    }

    @Override
    public String getCarName() {
        return carName;
    }
}
