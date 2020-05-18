package wallet;

public class InsufficientFundsException extends  Exception {
    public InsufficientFundsException() {
        super("Insufficient deposit on your account");
    }
}
