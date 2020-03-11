package com.kodilla.stream.exception;

import javax.crypto.spec.PSource;
import javax.swing.*;
import java.util.Scanner;

public class UserDialogs {
    public static int getNumbersOfRounds(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter value: ");
            String s = scanner.nextLine();
            try {
                return Integer.parseInt(s);
            } catch (Exception e) {
                System.out.println("Wrong value");
            }
        }
    }
}
