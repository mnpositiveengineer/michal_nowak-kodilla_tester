package com.kodilla.collections.interfaces.homework;

public class Jaguar implements Car {

    private int speed;
    private int increase;
    private int decrease;
    private String carName;

    public Jaguar(int speed) {
        this.speed = speed;
        this.increase = 30;
        this.decrease = 50;
        this.carName = "Jaguar";
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
