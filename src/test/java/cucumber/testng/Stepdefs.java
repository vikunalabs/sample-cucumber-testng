package cucumber.testng;

import cucumber.api.java8.En;
import org.testng.annotations.AfterClass;

import static org.testng.Assert.assertEquals;

public class Stepdefs implements En {

    private String today;
    private String actualAnswer;

    public Stepdefs() {
        Given("^today is \"([^\"]*)\"$", (String day) -> {
            this.today = day;
        });

        When("^I ask whether it's Friday yet$", () -> {
            this.actualAnswer = IsItFriday.isItFriday(today);
        });
        Then("^I should be told \"([^\"]*)\"$", (String expectedAnswer) -> {
            assertEquals(expectedAnswer, this.actualAnswer);
        });
    }
}

class IsItFriday {
    static String isItFriday(String today) {
        return "Friday".equals(today) ? "TGIF" : "Nope";
    }
}
