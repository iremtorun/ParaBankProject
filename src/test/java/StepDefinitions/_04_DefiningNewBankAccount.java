package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _04_DefiningNewBankAccount {

    DialogContent dc = new DialogContent();

    @When("User clicked on the menu to create a current or current account")
    public void userClickedOnTheMenuToCreateACurrentOrCurrentAccount() {

        dc.myClick(dc.openNewAccount);
    }

    @Then("User saw minimum starting balance message")
    public void userSawMinimumStartingBalanceMessage() {

        dc.verifyContainsText(dc.depositedText, "A minimum of");
    }

    @Then("User entered the information and clicked on the open new account button")
    public void userEnteredTheInformationAndClickedOnTheOpenNewAccountButton() throws InterruptedException {

        Thread.sleep(1000);
        dc.myClick(dc.createNewAccount);
    }

    @And("User saw confirmation message and new account number")
    public void userSawConfirmationMessageAndNewAccountNumber() {

        dc.verifyContainsText(dc.accountText, "Account Opened!");
        dc.verifyContainsText(dc.newAccountText, "Your new account number");
    }
}
