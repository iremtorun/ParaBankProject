package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;

public class _08_RequestLoan {

    DialogContent dc = new DialogContent();

    @When("User clicks on request loan")
    public void userClicksOnRequestLoan() {

        dc.myClick(dc.requestLoanButton);
    }

    @Then("User fills the necessary money data")
    public void userFillsTheNecessaryMoneyData() {

        dc.mySendKeys(dc.loanAmount, "2000");
        dc.mySendKeys(dc.downPayment, "400");
    }

    @And("User selects an account number")
    public void userSelectsAnAccountNumber() {

        Select ddMenu = new Select(dc.fromAccountId);
        ddMenu.selectByIndex(0);
    }

    @Then("User clicks on apply now")
    public void userClicksOnApplyNow() {

        dc.myClick(dc.applyNowButton);
    }

    @And("Loan request processed information is verified")
    public void loanRequestProcessedInformationIsVerified() {

        dc.verifyContainsText(dc.loanStatus, "Approved");
    }

    @And("Approved message is displayed")
    public void approvedMessageIsDisplayed() {

        dc.verifyContainsText(dc.approvedMessage, "approved");
    }

    @And("User clicks on new account number")
    public void userClicksOnNewAccountNumber() {

        dc.myClick(dc.newAccountId);
    }

    @Then("Account details information is verified")
    public void accountDetailsInformationIsVerified() {

        dc.verifyContainsText(dc.accountType, "LOAN");
        dc.verifyContainsText(dc.balance, "2000");
        dc.verifyContainsText(dc.availableBalance, "2000");
        dc.verifyContainsText(dc.transactionMessage, "No");
    }
}
