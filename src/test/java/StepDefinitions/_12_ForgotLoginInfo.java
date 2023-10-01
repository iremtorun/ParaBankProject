package StepDefinitions;

import Pages.SODialogContent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _12_ForgotLoginInfo {

    SODialogContent dc = new SODialogContent();

    @When("User clicks on forgot login info")
    public void userClicksOnForgotLoginInfo() {

        dc.myClick(dc.forgotLoginButton);
    }

    @And("User fills the necessary info")
    public void userFillsTheNecessaryInfo(DataTable dt) {

        List<List<String>> items = dt.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {
            WebElement e = dc.getElement(items.get(i).get(0));
            dc.mySendKeys(e, items.get(i).get(1));
        }
    }

    @And("User clicks on find my login info button")
    public void userClicksOnFindMyLoginInfoButton() {

        dc.myClick(dc.findMyInfoButton);
    }

    @Then("Logged in message is displayed")
    public void loggedInMessageIsDisplayed() {

        dc.verifyContainsText(dc.loggedInMessage, "logged in");
    }
}
