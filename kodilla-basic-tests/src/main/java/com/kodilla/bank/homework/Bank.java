package com.kodilla.bank.homework;

public class Bank {
    CashMachine machine1 = new CashMachine();
    CashMachine machine2 = new CashMachine();
    CashMachine machine3 = new CashMachine();
    CashMachine machine4 = new CashMachine();
    CashMachine machine5 = new CashMachine();

    //tworzę metody wpłat i wypłat w bankomatach

    public int[] addToMachine (CashMachine anyMachine, int value) {
        return anyMachine.addTransaction(value);
    }

    // tworzę metody zwracania tablic ze zrealizowanymi transakcjami

    public int[] historyOfMachine(CashMachine anyMachine){
        return anyMachine.getHistory();
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
