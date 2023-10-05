package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class _02_Login {
    DialogContent dc = new DialogContent();

    @Given("Navigate to Para Bank")
    public void navigate_to_para_bank() {

        GWD.getDriver().get(" https://parabank.parasoft.com/");
    }

    @When("Enter username and password and click login button")
    public void enter_username_and_password_and_click_login_button() {

        dc.mySendKeys(dc.userName, "alex_russo");
        dc.mySendKeys(dc.password, "123456789");
        dc.myClick(dc.logInButton);
    }
}
