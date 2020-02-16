package com.kodilla.bank.homework;

import java.util.List;
import java.util.ArrayList;

public class Bank {

    //tworzę kolekcję do której będę dodawał nowe bankomaty

    List<CashMachine> machines = new ArrayList<>();

    //tworzę metody wpłat i wypłat w bankomatach

    public int[] addToMachine(CashMachine anyMachine, int value) {
        return anyMachine.addTransaction(value);
    }

    // tworzę metody zwracania tablic ze zrealizowanymi transakcjami

    public int[] historyOfMachine(CashMachine anyMachine) {
        return anyMachine.getHistory();
    }

    // całkowity bilans ze wszystkich transakcji

    public int totalSaldo() {
        int totalSaldo = 0;
        for (int i = 0; i < machines.size(); i++) {
            totalSaldo = totalSaldo + machines.get(i).getSaldo();
        }
        return totalSaldo;
    }

    // ilość transakcji związanych z wypłatą

    public int totalInMinusTransaction() {
        int totalInMinusTransaction = 0;
        for (int i = 0; i < machines.size(); i++) {
            totalInMinusTransaction = totalInMinusTransaction + machines.get(i).getInMinusTransaction();
        }
        return totalInMinusTransaction;
    }

    // ilość transakcji związanych z wpłątą

    public int totalInPlusTransaction() {
        int totalInPlusTransaction = 0;
        for (int i = 0; i < machines.size(); i++) {
            totalInPlusTransaction = totalInPlusTransaction + machines.get(i).getInPlusTransaction();
        }
        return totalInPlusTransaction;
    }

    // suma transakcji związanych z wypłatą - do średniej

    public int totalSumOfInMinusTransaction() {
        int totalSumOfInMinusTransaction = 0;
        for (int i = 0; i < machines.size(); i++) {
            totalSumOfInMinusTransaction = totalSumOfInMinusTransaction + machines.get(i).getSumOfInMinusTransaction();
        }
        return totalSumOfInMinusTransaction;
    }

    // suma transakcji związanych z wpłatą - do średniej

    public int totalSumOfInPlusTransaction() {
        int totalSumOfInPlusTransaction = 0;
        for (int i = 0; i < machines.size(); i++) {
            totalSumOfInPlusTransaction = totalSumOfInPlusTransaction + machines.get(i).getSumOfInPlusTransaction();
        }
        return totalSumOfInPlusTransaction;
    }

    // średnia wartość wypłaty

    public double averageOfInMinusTransaction() {
        return totalSumOfInMinusTransaction() / totalInMinusTransaction();
    }

    // średnia wartość wpłaty

    public double averageOfInPlusTransaction() {
        return totalSumOfInPlusTransaction() / totalInPlusTransaction();
    }
}
