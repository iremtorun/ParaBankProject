package StepDefinitions;

import Pages.aycaDialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;


public class _02_login {
    aycaDialogContent adc=new aycaDialogContent();

    @Given("Navigate to Para Bank")
    public void navigate_to_para_bank() {

        GWD.getDriver().get(" https://parabank.parasoft.com/");
    }
    @When("Enter username and password and click login button")
    public void enter_username_and_password_and_click_login_button() {


        adc.mySendKeys(adc.username, "alex_russo");
        adc.mySendKeys(adc.password, "123456789");
        adc.myClick(adc.loginBtn);

    }
    @And("User should login succesfully")
    public void user_should_login_succesfully() {
    adc.verifyContainsText(adc.logOut, "Log Out");


    }
    @Then("User should Log out succesfully")
    public void User_should_Log_out_succesfully(){
        adc.myClick(adc.logOut);
        adc.verifyContainsText(adc.Register, "Register");


    }


}
