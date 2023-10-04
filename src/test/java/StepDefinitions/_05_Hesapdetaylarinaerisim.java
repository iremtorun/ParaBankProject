package StepDefinitions;

import Pages.DialogContentNurhayat1;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class _05_Hesapdetaylarinaerisim {
    DialogContentNurhayat1 dc = new DialogContentNurhayat1();

    @Given("Navigate to ste")
    public void navigateToSte() {
        GWD.getDriver().get("https://parabank.parasoft.com/");
    }

    @When("User must log in")
    public void userMustLogIn() {
        dc.mySendKeys(dc.username, "nur");
        dc.mySendKeys(dc.pasword, "123456");
        dc.myClick(dc.loginBtn);

    }

    @Then("User Account details on the click")
    public void userAccountDetailsOnTheClick() {
        dc.myClick(dc.account1);
    }

    @And("User should see Transaction Details")
    public void userShouldSeeTransactionDetails() {

        dc.myClick(dc.transactionBtn);

    }
}
