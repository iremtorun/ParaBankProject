package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContentNurhayat1 extends Parent {
    public DialogContentNurhayat1() {
        PageFactory.initElements(GWD.getDriver(),this);
    }
    public void LeftNavNurhayat1() {
        PageFactory.initElements(GWD.getDriver(),this);
    }


    public WebElement getWebElement(String strElement) {
        switch (strElement) {
        }
        return null;
    }

    @FindBy(css = "[name='username']")
    public WebElement username;
    @FindBy(css = "[name='password']")
    public WebElement pasword;
    @FindBy(css = "[value='Log In']")
    public WebElement loginBtn;
    @FindBy(css = "[href=\"activity.htm?id=13899\"]")
    public WebElement account1;
   @FindBy(css = "[href=\"transaction.htm?id=14587\"]")
    public WebElement transactionBtn;

}


