package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class _05_AccountDetails {

    DialogContent dc = new DialogContent();

    @Then("User Account details on the click")
    public void userAccountDetailsOnTheClick() {

        dc.myClick(dc.account1);
    }

    @And("User should see Transaction Details")
    public void userShouldSeeTransactionDetails() {

        dc.myClick(dc.transactionBtn);
    }
}
