package PagesSS;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContentSS extends ParentSS {
    public DialogContentSS() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(name = "username")
    public WebElement username;
    @FindBy(name = "password")
    public WebElement password;
    @FindBy(css = "[type='submit']")
    public WebElement LogInButton;
    @FindBy(linkText = "Bill Pay")
    public WebElement billpaybutton;
    @FindBy(name = "payee.name")
    public WebElement payeename;
    @FindBy(name = "payee.address.street")
    public WebElement address;
    @FindBy(name = "payee.address.city")
    public WebElement city;
    @FindBy(name = "payee.address.state")
    public WebElement state;
    @FindBy(name = "payee.accountNumber")
    public WebElement account;
    @FindBy(name = "payee.address.zipCode")
    public WebElement zipcode;
    @FindBy(name = "verifyAccount")
    public WebElement verifyacc;
    @FindBy(name = "amount")
    public WebElement amount;
    @FindBy(name = "payee.phoneNumber")
    public WebElement phone;
    @FindBy(css = "[value='Send Payment']")
    public WebElement sendpayment;
    @FindBy(xpath = "//h1[@class='title' and text()='Bill Payment Complete']")
    public WebElement confrim;

    @FindBy(css = "[id='amount']")
    public WebElement amountprice;
    @FindBy(linkText = "Accounts Overview")
    public WebElement accountoverview;
    @FindBy(xpath = "//*[@ng-repeat='account in accounts']/*/*")
    public WebElement accountacc;
    @FindBy(xpath = "(//*[@class='ng-binding ng-scope'])[1]")
    public WebElement priceelectricity;
    @FindBy(xpath = "(//a[@class='ng-binding'])[1]")
    public WebElement electricitybill;
    @FindBy(xpath = "(//a[@class='ng-binding'])[2]")
    public WebElement waterbill;
    @FindBy(xpath ="(//*[@class='ng-binding ng-scope'])[2]" )
    public WebElement pricewaterbill;
    @FindBy(xpath = "(//*[@class='ng-binding ng-scope'])[3]")
    public WebElement pricegas;
    @FindBy(xpath = "(//a[@class='ng-binding'])[3]")
    public WebElement pricegasbill;

    public WebElement getWebElement(String strElement) {
        switch (strElement) {
            case "username": return username;
            case "password": return password;
            case "LogInButton": return LogInButton;
            case "billpaybutton": return billpaybutton;
            case "payeename": return payeename;
            case "address": return address;
            case "city": return city;
            case "state": return state;
            case "zipcode": return zipcode;
            case "account": return account;
            case "verifyacc": return verifyacc;
            case "amount": return amount;
            case "phone": return phone;
            case "sendpayment": return sendpayment;
            case "priceelectricity": return priceelectricity;
            case "amountprice": return amountprice;
            case "accountoverview": return accountoverview;
            case "accountacc":return accountacc;
            case "electricitybill":return electricitybill;
            case "pricegasbill":return pricegasbill;
        }
        return null;
    }

}


