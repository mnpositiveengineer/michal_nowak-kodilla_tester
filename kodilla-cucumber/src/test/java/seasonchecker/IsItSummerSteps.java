package seasonchecker;

import io.cucumber.java8.En;
import org.junit.Assert;

import java.time.MonthDay;

public class IsItSummerSteps implements En {

    private MonthDay today;
    private String answer;

    public IsItSummerSteps() {
        Given("today is last day of Spring", () -> {
            // Write code here that turns the phrase above into concrete actions
            this.today = MonthDay.of(6,20);
        });
        Given("today is first day of Autumn", () -> {
            // Write code here that turns the phrase above into concrete actions
            this.today = MonthDay.of(9,24);
        });
        Given("today is first day of Summer", () -> {
            // Write code here that turns the phrase above into concrete actions
            this.today = MonthDay.of(6,21);
        });
        Given("today is last day of Summer", () -> {
            // Write code here that turns the phrase above into concrete actions
            this.today = MonthDay.of(9,23);
        });

        When("I ask whether it's Summer", () -> {
            // Write code here that turns the phrase above into concrete actions
            SeasonChecker seasonChecker = new SeasonChecker();
            this.answer = seasonChecker.checkIfSummer(this.today);
        });

        Then("I should be told {string}", (String string) -> {
            // Write code here that turns the phrase above into concrete actions
            Assert.assertEquals(string, this.answer);
        });
    }
}
