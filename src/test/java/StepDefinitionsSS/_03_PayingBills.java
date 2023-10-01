package StepDefinitionsSS;

import PagesSS.DialogContentSS;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.List;

public class _03_PayingBills {
    DialogContentSS dc = new DialogContentSS();
    String priceStr;
    String electricitybillStr;
    String amountStr;
    String waterbillStr;
    String pricewaterbill;
    String pricegasbillStr;
    String pricegasStr;

    @Given("Navigate to site")
    public void navigateToSite() {
        GWD.getDriver().get("https://parabank.parasoft.com/");
    }

    @When("SendKeys")
    public void sendkeys(DataTable dt) {
        List<List<String>> items = dt.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {
            WebElement SendKey = dc.getWebElement(items.get(i).get(0));
            String Word = items.get(i).get(1);

            dc.mySendKeys(SendKey, Word);
        }
    }

    @Then("Click")
    public void click(DataTable dt) {
        List<List<String>> items = dt.asLists(String.class);
        for (int i = 0; i < items.size(); i++) {
            WebElement BtnLink = dc.getWebElement(items.get(i).get(0));
            dc.myClick(BtnLink);
        }
    }

    @Then("Confrim order message")
    public void confrimOrderMessage() {
        dc.verifyContainsText(dc.confrim, "Complete");
        amountStr = dc.amountprice.getText();

    }

    @And("Click Accountoverview")
    public void clickAccountoverview() {
        dc.myClick(dc.accountoverview);
    }

    @Then("Click Accountacc")
    public void clickAccountacc() {
        dc.myClick(dc.accountacc);

    }

    @Then("Price Comparison Electricity Bill")
    public void priceComparison() {
        dc.wait.until(ExpectedConditions.visibilityOf(dc.priceelectricity));
        electricitybillStr = dc.electricitybill.getText();
        priceStr = dc.priceelectricity.getText();

        Assert.assertTrue(electricitybillStr.contains("EnerjiSA"));
        Assert.assertEquals(amountStr, priceStr);

    }

    @Then("Price Comparison Water Bill")
    public void priceComparisonWaterbill() {
        dc.wait.until(ExpectedConditions.visibilityOf(dc.pricewaterbill));
        waterbillStr=dc.waterbill.getText();
        pricewaterbill=dc.pricewaterbill.getText();

        Assert.assertTrue(waterbillStr.contains("Su Faturasi"));
        Assert.assertEquals(amountStr,pricewaterbill);


    }

    @Then("Price Comparison Natural Gas Bill")
    public void priceComparisonNaturalGasbill() {

        dc.wait.until(ExpectedConditions.visibilityOf(dc.pricegasbill));
        pricegasbillStr=dc.pricegasbill.getText();
        pricegasStr=dc.pricegas.getText();

        Assert.assertTrue(pricegasbillStr.contains("Dogalgaz"));
        Assert.assertEquals(amountStr,pricegasStr);



    }
}

