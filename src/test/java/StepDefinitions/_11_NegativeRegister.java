package StepDefinitions;

import Pages.SODialogContent;
import io.cucumber.java.en.Then;

public class _11_NegativeRegister {

    SODialogContent dc = new SODialogContent();

    @Then("Username already exist message is displayed")
    public void usernameAlreadyExistMessageIsDisplayed() {

        dc.verifyContainsText(dc.existsMessage, "exists");
    }

    @Then("Password did not match message is displayed")
    public void passwordDidNotMatchMessageIsDisplayed() {

        dc.verifyContainsText(dc.passwordMatchMessage, "not match");
    }
}
