package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;
import org.junit.rules.ExpectedException;

public class WalletSteps implements En {

    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();
    private Teller teller = new Teller(cashSlot);

    public WalletSteps() {
        Given("I have deposited {int} in my wallet", (Integer int1) -> {
            // Write code here that turns the phrase above into concrete actions
            teller.deposit(wallet, int1);
            Assert.assertEquals(int1.intValue(), wallet.getBalance());
        });

        When("I request {int}", (Integer int1) -> {
            // Write code here that turns the phrase above into concrete actions
            teller.withdraw(wallet, int1.intValue());
        });

        Then("{int} should be dispensed", (Integer int1) -> {
            // Write code here that turns the phrase above into concrete actions
            Assert.assertEquals(int1.intValue(), cashSlot.getContents());
        });

        Then("the balance of my wallet should be {int}", (Integer int1) -> {
            // Write code here that turns the phrase above into concrete actions
            Assert.assertEquals(int1.intValue(), wallet.getBalance());
        });
//-----------------------------------------------------------------------------------------------------------------
        Given("I have deposited {int} in my wallet, which is not enough", (Integer int1) -> {
            // Write code here that turns the phrase above into concrete actions
            teller.deposit(wallet, int1);
            Assert.assertEquals(int1.intValue(), wallet.getBalance());
        });

        When("I try to withdraw {int}", (Integer int1) -> {
            // Write code here that turns the phrase above into concrete actions
            try {
                teller.withdraw(wallet, int1.intValue());
            } catch (InsufficientFundsException e) {
                Assert.assertEquals("Insufficient deposit on your account", e.getMessage());
            }
        });

        Then("the balance of my wallet should remain {int}", (Integer int1) -> {
           // Write code here that turns the phrase above into concrete actions
            Assert.assertEquals(int1.intValue(), wallet.getBalance());
        });
//-----------------------------------------------------------------------------------------------------------------
        Given("I have an account", () -> {
            // Write code here that turns the phrase above into concrete actions

        });

        When("I want to deposit {int}", (Integer int1) -> {
            // Write code here that turns the phrase above into concrete actions
            try {
                teller.deposit(wallet, int1.intValue());
            } catch (WrongDeposit e) {
                Assert.assertEquals("Deposit should be more than zero", e.getMessage());
            }
        });

        Then("The message Deposit should be more than zero should appear", () -> {
            // Write code here that turns the phrase above into concrete actions

        });

    }
}
