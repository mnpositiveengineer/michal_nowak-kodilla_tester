package com.youtube.exceptions;

import java.util.Scanner;

public class SimpleExamples {
    public static void main(String[] args) {
    // INPUTING NUMBERS
        int x = 1;
        do {
            try {

                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter first number. ");
                int n1 = scanner.nextInt();
                System.out.println("Enter second number");
                int n2 = scanner.nextInt();
                int sum = n1 / n2;
                System.out.println(sum);
                x = 2;
            } catch (Exception e) {
                System.out.println("You cant divide by 0. Try again.");
            }
        }while (x == 1);

    }
}
