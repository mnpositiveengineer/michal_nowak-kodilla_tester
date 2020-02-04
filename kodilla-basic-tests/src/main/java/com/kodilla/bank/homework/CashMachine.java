package com.kodilla.bank.homework;

public class CashMachine {

    //definiuje zmienne prywatne globalne

    private int[] history = new int[0];  //tablica wpłat i wypłat w bankomacie
    private int saldo = 0; //saldo w bankomacie
    private int transactionNumber = 0;  //ilość transakcji
    private int inPlusTransaction = 0; //ilość transakcji na plus
    private int inMinusTransaction = 0; //ilość transakcji na minus
    private int sumOfInMinusTransaction = 0; //suma transakcji na minus
    private int sumOfInPlusTransaction = 0; //suma transakcji na minus

    //tworzę metodę zapisującą historię zrealizowanych transakcji

    public int[] addTransaction(int cashAmount) {
        if ((cashAmount >= (saldo * -1)) && cashAmount != 0) {  //wykonuj tylko jeżeli jest wystarczające saldo
            transactionNumber++;
            int[] newTab = new int[transactionNumber];
            System.arraycopy(history, 0, newTab, 0, history.length);
            newTab[transactionNumber - 1] = cashAmount;
            history = newTab;
            saldo = saldo + cashAmount;
            if (cashAmount < 0){    //zliczam wypłaty (ilość i suma) - potrzebne do średniej
                inMinusTransaction++;
                sumOfInMinusTransaction = sumOfInMinusTransaction + cashAmount;
            }else{                  // zliczam wpłaty (ilość i suma) - potrzebne do średniej
                inPlusTransaction++;
                sumOfInPlusTransaction = sumOfInPlusTransaction + cashAmount;
            }
        }
        return history;
    }

    // gettery do wyciągnięcia w klasach

    public int[] getHistory(){
        return history;
    }

    public int getTransactionNumber(){
        return transactionNumber;
    }

    public int getSaldo(){
        return saldo;
    }

    public int getInPlusTransaction(){
        return inPlusTransaction;
    }

    public int getInMinusTransaction(){
        return inMinusTransaction;
    }

    public int getSumOfInMinusTransaction(){
        return sumOfInMinusTransaction;
    }

    public int getSumOfInPlusTransaction(){
        return sumOfInPlusTransaction;
    }
}
