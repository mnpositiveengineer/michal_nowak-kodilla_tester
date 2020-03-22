package com.kodilla.stream.exception.homework;

import java.util.Random;

public class Utils {

    public int getRandomInt(int min, int max) {
        return new Random().nextInt(min)+max;
    }
}
