package com.kodilla.bank.homework;

public class Bank {
    // tworzę obiekty - 5 różnych bankomatów
    CashMachine machine1 = new CashMachine();
    CashMachine machine2 = new CashMachine();
    CashMachine machine3 = new CashMachine();
    CashMachine machine4 = new CashMachine();
    CashMachine machine5 = new CashMachine();
    // tworzę tablicę z bankomatami
    CashMachine[] machines = new CashMachine[] {machine1, machine2, machine3, machine4, machine5};

    //tworzę metody wpłat i wypłat w bankomatach

    public int[] addToMachine1 (int value){
        return machine1.addTransaction(value);
    }

    public int[] addToMachine2 (int value){
        return machine2.addTransaction(value);
    }

    public int[] addToMachine3 (int value){
        return machine3.addTransaction(value);
    }

    public int[] addToMachine4 (int value){
        return machine4.addTransaction(value);
    }

    public int[] addToMachine5 (int value){
        return machine5.addTransaction(value);
    }

    // tworzę metody zwracania tablic ze zrealizowanymi transakcjami

    public int[] historyOfMachine1(){
        return machine1.getHistory();
    }

    public int[] historyOfMachine2(){
        return machine2.getHistory();
    }

    public int[] historyOfMachine3(){
        return machine3.getHistory();
    }

    public int[] historyOfMachine4(){
        return machine4.getHistory();
    }

    public int[] historyOfMachine5(){
        return machine5.getHistory();
    }

    // całkowity bilans ze wszystkich transakcji

    public int totalSaldo(){
        return machine1.getSaldo() + machine2.getSaldo() + machine3.getSaldo() + machine4.getSaldo() + machine5.getSaldo();
    }

    // ilość transakcji związanych z wypłatą

    public int totalInMinusTransaction(){
        return machine1.getInMinusTransaction() + machine2.getInMinusTransaction() + machine3.getInMinusTransaction() + machine4.getInMinusTransaction() + machine5.getInMinusTransaction();
    }

    // ilość transakcji związanych z wpłątą

    public int totalInPlusTransaction(){
        return machine1.getInPlusTransaction() + machine2.getInPlusTransaction() + machine3.getInPlusTransaction() + machine4.getInPlusTransaction() + machine5.getInPlusTransaction();
    }

    // suma transakcji związanych z wypłatą - do średniej

    public int totalSumOfInMinusTransaction(){
        return machine1.getSumOfInMinusTransaction() + machine2.getSumOfInMinusTransaction() + machine3.getSumOfInMinusTransaction() + machine4.getSumOfInMinusTransaction() + machine5.getSumOfInMinusTransaction();
    }

    // suma transakcji związanych z wpłatą - do średniej

    public int totalSumOfInPlusTransaction(){
        return machine1.getSumOfInPlusTransaction() + machine2.getSumOfInPlusTransaction() + machine3.getSumOfInPlusTransaction() + machine4.getSumOfInPlusTransaction() + machine5.getSumOfInPlusTransaction();
    }

    // średnia wartość wypłaty

    public double averageOfInMinusTransaction(){
        return totalSumOfInMinusTransaction()/totalInMinusTransaction();
    }

    // średnia wartość wpłaty

    public double averageOfInPlusTransaction(){
        return totalSumOfInPlusTransaction()/totalInPlusTransaction();
    }
}
