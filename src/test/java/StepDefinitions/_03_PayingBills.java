package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.List;

public class _03_PayingBills {

    DialogContent dc = new DialogContent();

    String priceStr;
    String electricitybillStr;
    String amountStr;
    String waterbillStr;
    String pricewaterbill;
    String pricegasbillStr;
    String pricegasStr;

    @Then("Click")
    public void click(DataTable dt) {

        List<List<String>> items = dt.asLists(String.class);
        for (int i = 0; i < items.size(); i++) {
            WebElement BtnLink = dc.getElement(items.get(i).get(0));
            dc.myClick(BtnLink);
        }
    }

    @Then("SendKeys")
    public void sendkeys(DataTable dt) {

        List<List<String>> items = dt.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {
            WebElement e = dc.getElement(items.get(i).get(0));
            dc.mySendKeys(e, items.get(i).get(1));
        }
    }

    @Then("Confrim order message")
    public void confrimOrderMessage() {

        dc.verifyContainsText(dc.confrim, "Complete");
        amountStr = dc.amountPrice.getText();
    }

    @And("Click Accountoverview")
    public void clickAccountoverview() {

        dc.myClick(dc.accountOverview);
    }

    @Then("Click Accountacc")
    public void clickAccountacc() {

        dc.myClick(dc.accountAcc);
    }

    @Then("Price Comparison Electricity Bill")
    public void priceComparison() {

        dc.wait.until(ExpectedConditions.visibilityOf(dc.priceElectriCity));
        electricitybillStr = dc.electricityBill.getText();
        priceStr = dc.priceElectriCity.getText();
        Assert.assertTrue(electricitybillStr.contains("EnerjiSA"));
        Assert.assertEquals(amountStr, priceStr);
    }

    @Then("Price Comparison Water Bill")
    public void priceComparisonWaterbill() {

        dc.wait.until(ExpectedConditions.visibilityOf(dc.priceWaterBill));
        waterbillStr = dc.waterBill.getText();
        pricewaterbill = dc.priceWaterBill.getText();
        Assert.assertTrue(waterbillStr.contains("Su Faturasi"));
        Assert.assertEquals(amountStr, pricewaterbill);
    }

    @Then("Price Comparison Natural Gas Bill")
    public void priceComparisonNaturalGasbill() {

        dc.wait.until(ExpectedConditions.visibilityOf(dc.priceGasBill));
        pricegasbillStr = dc.priceGasBill.getText();
        pricegasStr = dc.priceGas.getText();
        Assert.assertTrue(pricegasbillStr.contains("Dogalgaz"));
        Assert.assertEquals(amountStr, pricegasStr);
    }
}
