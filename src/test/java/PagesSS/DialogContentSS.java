package PagesSS;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

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
    @FindBy(linkText ="Update Contact Info")
    public WebElement uptadecontact;
    @FindBy(id = "customer.firstName")
    public WebElement customername;
    @FindBy(name = "customer.lastName")
    public WebElement customerlastname;
    @FindBy(name = "customer.address.street")
    public WebElement customeraddress;

    @FindBy(name = "customer.address.city")
    public WebElement customercity;
    @FindBy(name = "customer.address.state")
    public WebElement customerstate;
    @FindBy(name = "customer.address.zipCode")
    public WebElement customerzipcode;
    @FindBy(name = "customer.phoneNumber")
    public WebElement customerphone;
    @FindBy(css = "[value='Update Profile']")
    public WebElement updatebutton;
    @FindBy(css = "div h1")
    public WebElement updatemessage;
    @FindBy(linkText ="Log Out")
    public WebElement logout;
    @FindBy(xpath = "//span[@class='error ng-scope' and text()='First name is required.']")
    public WebElement errormessage;



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
            case "customername":return customername;
            case "customerlastname":return customerlastname;
            case "customeraddress":return customeraddress;
            case "customercity":return customercity;
            case "customerstate":return customerstate;
            case "customerzipcode":return customerzipcode;
            case "customerphone":return customerphone;
            case "updatebutton":return updatebutton;
            case "logout":return logout;
        }
        return null;
    }

}


