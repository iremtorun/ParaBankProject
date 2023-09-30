package StepDefinitions;

import Pages.SODialogContent;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _01_Register {

    SODialogContent dc = new SODialogContent();

    @Given("Navigate to website")
    public void navigateToWebsite() {

        GWD.getDriver().get("https://parabank.parasoft.com/");
    }

    @When("User clicks on register button")
    public void userClicksOnRegisterButton() {

        dc.myClick(dc.registerButton);
    }

    @And("User fills the necessary data")
    public void userFillsTheNecessaryData(DataTable dt) {

        List<List<String>> items = dt.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {
            WebElement e = dc.getElement(items.get(i).get(0));
            dc.mySendKeys(e, items.get(i).get(1));
        }
        dc.myClick(dc.submitButton);
    }

    @Then("Successful message is displayed")
    public void successfulMessageIsDisplayed() {

        dc.verifyContainsText(dc.successMessage, "success");
    }
}
