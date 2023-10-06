package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class _05_AccountDetails {
    DialogContent dc = new DialogContent();
    @Then("User clicks on account overview")
    public void userClicksOnAccountOverview() {
        dc.myClick(dc.accountOverview);
        dc.myClick(dc.account1);



    }


}
