package com.kodilla.collections.interfaces.homework;

public class Porshe implements Car {

    private int speed;
    private int increase;
    private int decrease;
    private String carName;

    public Porshe(int speed) {
        this.speed = speed;
        this.increase = 50;
        this.decrease = 70;
        this.carName = "Porshe";
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
