package wallet;

public class WrongDeposit extends Exception {

    public WrongDeposit() {
        super("Deposit should be more than zero");
    }
}
