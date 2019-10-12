package cucumber.testng;

import cucumber.api.java8.En;

public class Stepdefs implements En {
    public Stepdefs() {
        Given("^today is Sunday$", () -> {
            //do nothing
        });
        When("^I ask whether it's Friday yet$", () -> {
            //do nothing
        });
        Then("^I should be told \"([^\"]*)\"$", (String arg0) -> {
            //do nothing
        });
    }
}
