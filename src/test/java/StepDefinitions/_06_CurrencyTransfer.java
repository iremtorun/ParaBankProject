package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _06_CurrencyTransfer {
    DialogContent dc = new DialogContent();
    @When("User clicks on transfer funds")
    public void userClicksOnTransferFunds() {
        dc.myClick(dc.transferFunds);

    }

    @Then("User fills their info")
    public void userFillsTheirInfo() {
        dc.mySendKeys(dc.amountToTransfer,"100");
    }

    @And("User clicks on transfer button")
    public void userClicksOnTransferButton() {
        dc.myClick(dc.transfer);
    }

    @Then("User gets verify message")
    public void userGetsVerifyMessage() {
        dc.verifyContainsText(dc.transferCompleteText,"Transfer Complete!");
    }
}
