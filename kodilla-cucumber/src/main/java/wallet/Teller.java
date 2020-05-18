package wallet;

public class Teller {

    private CashSlot cashSlot;

    public Teller(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public void deposit(Wallet wallet, int amount) throws WrongDeposit {
        if (amount > 0) {
            cashSlot.dispense(amount);
            wallet.deposit(amount);
        } else {
            throw new WrongDeposit();
        }
    }

    public void withdraw(Wallet wallet, int amount) throws InsufficientFundsException {
        if (amount > wallet.getBalance()) {
            throw new InsufficientFundsException();
        } else {
            cashSlot.dispense(amount);
            wallet.withdraw(amount);
        }
    }
}
