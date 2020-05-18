package fizzbuzzchecker;

import fizzbuzz.FizzBuzz;
import io.cucumber.java8.En;
import org.junit.Assert;

public class FizzBuzzCheckerSteps implements En {

    private int number;
    private String answer;

    public FizzBuzzCheckerSteps() {

        Given("The number is {int}", (Integer int1) -> {
            // Write code here that turns the phrase above into concrete actions
            this.number = int1;
        });

        When("Fizz when divisible by three, Buzz when divisible by five, FizzBuzz when divisible by three and five, None when non divisible by three or five", () -> {
            // Write code here that turns the phrase above into concrete actions
            FizzBuzz fizzBuzz = new FizzBuzz();
            this.answer = fizzBuzz.checkIfFizzBuzz(this.number);
        });

        Then("The answer is {string}", (String string) -> {
            // Write code here that turns the phrase above into concrete actions
            Assert.assertEquals(this.answer, string);
        });

    }
}
