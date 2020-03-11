package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Bmw;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Jaguar;
import com.kodilla.collections.interfaces.homework.Porshe;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Car porsche = new Porshe(60);
        cars.add(new Jaguar(50));
        cars.add(porsche);
        cars.add(new Bmw(70));
        System.out.println(cars.size());
        cars.remove(0);
        cars.remove(porsche);
        cars.remove(new Bmw(70));

        System.out.println(cars.size());

        for (Car anyCar : cars){
            CarUtils.describeCar(anyCar);
        }
    }
}
