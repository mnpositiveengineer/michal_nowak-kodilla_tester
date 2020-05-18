package wallet;

public class Wallet {
    private int balance;

    public Wallet(){

    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int money) {
        this.balance = this.balance + money;
    }

    public void withdraw(int money) {
        this.balance = this.balance - money;
    }
}
