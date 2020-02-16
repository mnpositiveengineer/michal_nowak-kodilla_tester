package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    @Test // sprawdź czy liczy poprawnie saldo w bankomacie
    public void ShouldCountTotalAmountOfMoneyInTheMachine() {
        Bank bank = new Bank();

        bank.machines.add(new CashMachine());
        bank.machines.add(new CashMachine());
        bank.machines.add(new CashMachine());
        bank.machines.add(new CashMachine());
        bank.machines.add(new CashMachine());

        bank.addToMachine(bank.machines.get(0), 10);
        bank.addToMachine(bank.machines.get(0), -10);
        bank.addToMachine(bank.machines.get(1), 20);
        bank.addToMachine(bank.machines.get(1), -20);
        bank.addToMachine(bank.machines.get(2), 30);
        bank.addToMachine(bank.machines.get(2), -30);
        bank.addToMachine(bank.machines.get(3), 40);
        bank.addToMachine(bank.machines.get(3), -40);
        bank.addToMachine(bank.machines.get(4), 50);
        bank.addToMachine(bank.machines.get(4), -50);

        int totalSaldo = bank.totalSaldo();

        assertEquals(0, totalSaldo);
    }

    @Test // sprawdź czy liczy poprawnie wpłaty
    public void ShouldCountOnlyInPlusTransaction(){
        Bank bank = new Bank();

        bank.machines.add(new CashMachine());
        bank.machines.add(new CashMachine());
        bank.machines.add(new CashMachine());
        bank.machines.add(new CashMachine());
        bank.machines.add(new CashMachine());

        bank.addToMachine(bank.machines.get(0), 10);
        bank.addToMachine(bank.machines.get(0), -10);
        bank.addToMachine(bank.machines.get(1), 20);
        bank.addToMachine(bank.machines.get(1), -30);
        bank.addToMachine(bank.machines.get(2), 30);
        bank.addToMachine(bank.machines.get(2), -30);
        bank.addToMachine(bank.machines.get(3), 40);
        bank.addToMachine(bank.machines.get(3), -50);
        bank.addToMachine(bank.machines.get(4), 50);
        bank.addToMachine(bank.machines.get(4), -50);

        int inPlusTransaction = bank.totalInPlusTransaction();

        assertEquals(5, inPlusTransaction);
    }

    @Test // sprawdź czy liczy poprawnie wypłaty
    public void ShouldCountOnlyInMinusTransaction(){
        Bank bank = new Bank();

        bank.machines.add(new CashMachine());
        bank.machines.add(new CashMachine());
        bank.machines.add(new CashMachine());
        bank.machines.add(new CashMachine());
        bank.machines.add(new CashMachine());

        bank.addToMachine(bank.machines.get(0), 10);
        bank.addToMachine(bank.machines.get(0), -10);
        bank.addToMachine(bank.machines.get(1), 20);
        bank.addToMachine(bank.machines.get(1), -30);
        bank.addToMachine(bank.machines.get(2), 30);
        bank.addToMachine(bank.machines.get(2), -30);
        bank.addToMachine(bank.machines.get(3), 40);
        bank.addToMachine(bank.machines.get(3), -50);
        bank.addToMachine(bank.machines.get(4), 50);
        bank.addToMachine(bank.machines.get(4), -50);

        int inMinusTransaction = bank.totalInMinusTransaction();

        assertEquals(3, inMinusTransaction);
    }

    @Test // sprawdź czy liczy poprawnie średnią wypłat
    public void ShouldCountAverageOfInMinusTransaction(){
        Bank bank = new Bank();

        bank.machines.add(new CashMachine());
        bank.machines.add(new CashMachine());
        bank.machines.add(new CashMachine());
        bank.machines.add(new CashMachine());
        bank.machines.add(new CashMachine());

        bank.addToMachine(bank.machines.get(0), 10);
        bank.addToMachine(bank.machines.get(0), -10);
        bank.addToMachine(bank.machines.get(1), 20);
        bank.addToMachine(bank.machines.get(1), -30);
        bank.addToMachine(bank.machines.get(2), 30);
        bank.addToMachine(bank.machines.get(2), -30);
        bank.addToMachine(bank.machines.get(3), 40);
        bank.addToMachine(bank.machines.get(3), -50);
        bank.addToMachine(bank.machines.get(4), 50);
        bank.addToMachine(bank.machines.get(4), 0);

        double averageInMinusTransaction = bank.averageOfInMinusTransaction();

        assertEquals(-20, averageInMinusTransaction);
    }

    @Test // sprawdź czy liczy poprawnie średnią wpłat
    public void ShouldCountAverageOfInPlusTransaction(){
        Bank bank = new Bank();

        bank.machines.add(new CashMachine());
        bank.machines.add(new CashMachine());
        bank.machines.add(new CashMachine());
        bank.machines.add(new CashMachine());
        bank.machines.add(new CashMachine());

        bank.addToMachine(bank.machines.get(0), 10);
        bank.addToMachine(bank.machines.get(0), -10);
        bank.addToMachine(bank.machines.get(1), 20);
        bank.addToMachine(bank.machines.get(1), -30);
        bank.addToMachine(bank.machines.get(2), 30);
        bank.addToMachine(bank.machines.get(2), -30);
        bank.addToMachine(bank.machines.get(3), 40);
        bank.addToMachine(bank.machines.get(3), -50);
        bank.addToMachine(bank.machines.get(4), 50);
        bank.addToMachine(bank.machines.get(4), 0);

        double averageInPlusTransaction = bank.averageOfInPlusTransaction();

        assertEquals(30, averageInPlusTransaction);
    }

    @Test // prywatne sprawdzenie czy tworzą się odpowiednie tablice transakcji w poszczególnych bankomatach
    public void MyOwnPersonalTestToCheckHistoryOfMachines(){
        Bank bank = new Bank();

        bank.machines.add(new CashMachine());
        bank.machines.add(new CashMachine());
        bank.machines.add(new CashMachine());
        bank.machines.add(new CashMachine());
        bank.machines.add(new CashMachine());

        bank.addToMachine(bank.machines.get(0), 10);
        bank.addToMachine(bank.machines.get(0), -20);
        bank.addToMachine(bank.machines.get(0), 10);
        bank.addToMachine(bank.machines.get(1), 20);
        bank.addToMachine(bank.machines.get(1), 30);
        bank.addToMachine(bank.machines.get(1), -10);
        bank.addToMachine(bank.machines.get(2), -10);
        bank.addToMachine(bank.machines.get(2), -20);
        bank.addToMachine(bank.machines.get(2), 30);
        bank.addToMachine(bank.machines.get(3), 0);
        bank.addToMachine(bank.machines.get(3), 0);
        bank.addToMachine(bank.machines.get(3), 10);
        bank.addToMachine(bank.machines.get(4), 20);
        bank.addToMachine(bank.machines.get(4), -10);
        bank.addToMachine(bank.machines.get(4), -10);

        int[] checkMachine1 = bank.historyOfMachine(bank.machines.get(0));
        int[] checkMachine2 = bank.historyOfMachine(bank.machines.get(1));
        int[] checkMachine3 = bank.historyOfMachine(bank.machines.get(2));
        int[] checkMachine4 = bank.historyOfMachine(bank.machines.get(3));
        int[] checkMachine5 = bank.historyOfMachine(bank.machines.get(4));


        assertEquals(10, checkMachine1[1]);
        assertEquals(-10, checkMachine2[2]);
        assertEquals(30, checkMachine3[0]);
        assertEquals(10, checkMachine4[0]);
        assertEquals(-10, checkMachine5[2]);
    }
}
