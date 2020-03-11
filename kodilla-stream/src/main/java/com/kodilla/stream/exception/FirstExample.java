package com.kodilla.stream.exception;

public class FirstExample {
    public static void main(String[] args) {
        String username = "John";
        String[] parts = username.split(" ");
        System.out.println("Firstname: " + parts[0]);
        System.out.println("Secondname: " + parts[1]);
    }
}
