package com.youtube.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleExamples {
    public static void main(String[] args) {
    // INPUTING NUMBERS - ArithmeticException
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
            } catch (ArithmeticException e) {
                System.out.println("You cant divide by 0. Try again.");
            }
        }while (x == 1);

        // CREATING BANK ACCOUNT e.printStackTrace and SOUT

        BankAccount bankAccount = new BankAccount("aaa", 100);

        try {
            bankAccount.withdrawAmount(200);
        } catch (Exception e) {
            e.printStackTrace();
        }

        BankAccount bankAccount2 = new BankAccount("bbb", 100);

        try {
            bankAccount2.withdrawAmount(200);
        } catch (Exception e) {
            System.out.println("Not enough money.");;
        }

        // CREATING CUSTOM EXCEPTION InsufficientFundsException

        BankAccount bankAccount3 = new BankAccount("bbb", 100);

        try {
            bankAccount3.withdrawAmount2(200);
        } catch (InsufficientFundsException e) {
            e.printStackTrace();
        }

        // CREATE NULL STRING NullPointerException

        String nullString = null;

        try {

            System.out.println(nullString.length());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // TRYING TO WRITE STRING AS INTEGER NumberFormatException

//        try {
//            int num = Integer.parseInt("String");
//        } catch (InvalidArgumentException e) {
//            System.out.println("NumberFormatException");
//        }

        // ARRAY OUT OF BOUND EXCEPTION

        int[] a = new int[5];
        try {
            a[7] = 9;
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        // TRY IN TRY

//        try {
//            try {
//                int num = Integer.parseInt("Edureka");
//                System.out.println(num);
//            } catch (InvalidArgumentException e) {
//                System.out.println(e);
//            }
//            try {
//                int[] b = new int[5];
//                a[7] = 9;
//            } catch (ArrayIndexOutOfBoundsException e) {
//                System.out.println(e);
//            }
//            System.out.println("Other Statement");
//        } catch (Exception e) {
//            System.out.println("Handled and recovered");
//        }

//        // MULTIPLE CATCH
//
//        System.out.println("---------------------------");
//
//        try {
//            int num = Integer.parseInt("Edureka");
//            System.out.println(num);
//        } catch (InvalidArgumentException e) {
//            System.out.println(e);
//        } catch (Exception e) {
//            System.out.println("Handled");
//        }
//
//        System.out.println("another multiply catch example");
//
//        try {
//            int[] table = new int[5];
//            table[5] = 1;
//        } catch (ArithmeticException e){
//            System.out.println("This is arithmetic exception.");
//        } catch (InvalidArgumentException e) {
//            System.out.println("This is number format exception.");
//        } catch (NullPointerException e) {
//            System.out.println("This is null pointer exception.");
//        } catch (IndexOutOfBoundsException e) {
//            System.out.println("This is Index Out Of Bound Exception.");
//        } catch (Exception e) {
//            System.out.println("This is some unknown exception.");
//        }

        // THROW AN EXCEPTION FOR FUN

        throwExceptionForFun();

        // DELEGATING EXCEPTION TO HIGHER LEVEL

        System.out.println("---------------------------");

        try {

            result();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }

        try {
            getFile("/file.csv");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        //INPUT MISS MATCH EXCEPTION

        System.out.println("How old are you?");
        int age = checkValidAge();

        if (age != 0) {
            System.out.println("You are " + age + " years old.");
        }


    }

    public static void throwExceptionForFun(){
        try {
            throw new ForFunException();
        } catch (ForFunException e){
            e.printStackTrace();
        }
    }

    public static int result() {
        return 10/0;
    }

    static Scanner scanner = new Scanner(System.in);

    public static int checkValidAge(){
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            scanner.next();
            return 0;
        }
    }

    public static void getFile(String fileName) throws FileNotFoundException {
        FileInputStream file = new FileInputStream(fileName);
    }
}
