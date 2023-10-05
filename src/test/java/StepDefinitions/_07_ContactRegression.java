package StepDefinitions;

import PagesSS.DialogContentSS;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class _07_ContactRegression {
    DialogContentSS dc = new DialogContentSS();
    String cname;

    @When("Should be click update button")
    public void shouldBeClikUpdateButton() {
        dc.myClick(dc.uptadeContact);
    }


    @Then("Should be see uptade message")
    public void shouldBeSeeUptadeMessage() {

        dc.verifyContainsText(dc.updateMessage, "Updated");

    }

    @Then("Checking the entered information")
    public void checkingTheEnteredInformation()   {
        dc.wait.until(ExpectedConditions.attributeToBe(dc.customerName,"value","bursa"));
        cname = dc.customerName.getAttribute("value");
        Assert.assertEquals(cname, "bursa");


    }

    @Then("Clear firstname,lastName,city")
    public void clearFirstnameLastNameCity() {
        dc.wait.until(ExpectedConditions.visibilityOf(dc.customerName));
        dc.mySendKeys(dc.customerName, "     ");

        dc.wait.until(ExpectedConditions.visibilityOf(dc.customerLastname));
        dc.mySendKeys(dc.customerLastname, "     ");

        dc.wait.until(ExpectedConditions.visibilityOf(dc.customerCity));
        dc.mySendKeys(dc.customerCity, "     ");

        dc.mySendKeys(dc.customerAddress, "hjhsjs");
        dc.mySendKeys(dc.customerState, "hısısj");
        dc.mySendKeys(dc.customerPhone, "321254154");
        dc.mySendKeys(dc.customerZipcode, "5874587");
    }

    @Then("Should be see errormessage")
    public void shouldBeSeeErrormessage() {
        Assert.assertTrue(dc.errorMessage.getText().contains("required"));

    }

}


