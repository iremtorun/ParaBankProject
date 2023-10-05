package StepDefinitions;

import Pages.iremDialogContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _05_AccessToAccountDetails {
    iremDialogContent dc=new iremDialogContent();
    @When("User clicks on accounts overview")
    public void userClicksOnAccountsOverview() {
        dc.myClick(dc.accountOverview);

    }

    @Then("User clicks on account details number")
    public void userClicksOnAccountDetailsNumber() {
    }

    @And("User verify customer data")
    public void userVerifyCustomerData() {
    }

    @And("User verify information")
    public void userVerifyInformation() {
    }

    @And("User click on any transaction")
    public void userClickOnAnyTransaction() {
    }

    @And("User verify transaction details")
    public void userVerifyTransactionDetails() {
    }
}
