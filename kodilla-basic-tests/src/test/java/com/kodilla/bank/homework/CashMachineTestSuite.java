package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CashMachineTestSuite {
    @Test //sprawdzenie czy wartości są dodawane do tablicy
    public void ShouldAddTheFirstAmountToTheArray(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(100);
        int[] history = cashMachine.getHistory();
        assertEquals(100, history[0]);
    }
    @Test //sprawdzenie czy zlicza ilość transakcji
    public void ShouldCountTheNumberOfTransaction(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(100);
        cashMachine.addTransaction(-100);
        int numberOfTransaction = cashMachine.getTransactionNumber();
        assertEquals(2, numberOfTransaction);
    }
    @Test //sprawdzanie czy pozwoli na wypłatę większej ilości pieniędzy niż saldo
    public void ShouldNotLetYouWithdrawMoreMoneyThatInCashMashine(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(100);
        cashMachine.addTransaction(100);
        cashMachine.addTransaction(-300);
        int numberOfTransaction = cashMachine.getTransactionNumber();
        int[] history = cashMachine.getHistory();
        assertEquals(2, numberOfTransaction);
    }
    @Test //sprawdzenie czy bierzę pod uwagę 0 wartość
    public void ShouldSkipTheZeroValueOfCashAmount(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(100);
        cashMachine.addTransaction(0);
        cashMachine.addTransaction(-50);
        int numberOfTransaction = cashMachine.getTransactionNumber();
        int[] history = cashMachine.getHistory();

        assertEquals(2, numberOfTransaction);
        assertEquals(-50, history[1]);
    }
    @Test // sprawdzenie czy oblicza poprawnie saldo
    public void ShouldPresentTheSaldoOfAccount(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(100);
        cashMachine.addTransaction(-200);
        cashMachine.addTransaction(-100);
        cashMachine.addTransaction(0);
        cashMachine.addTransaction(500);
        cashMachine.addTransaction(-1000);

        int saldoAccount = cashMachine.getSaldo();

        assertEquals(500,saldoAccount);
    }
}
