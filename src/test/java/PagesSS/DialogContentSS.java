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
    public WebElement logInButton;
    @FindBy(linkText = "Bill Pay")
    public WebElement billPayButton;
    @FindBy(name = "payee.name")
    public WebElement payeeName;
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
    public WebElement verifyAcc;
    @FindBy(name = "amount")
    public WebElement amount;
    @FindBy(name = "payee.phoneNumber")
    public WebElement phone;
    @FindBy(css = "[value='Send Payment']")
    public WebElement sendPayment;
    @FindBy(xpath = "//h1[@class='title' and text()='Bill Payment Complete']")
    public WebElement confrim;

    @FindBy(css = "[id='amount']")
    public WebElement amountPrice;
    @FindBy(linkText = "Accounts Overview")
    public WebElement accountOverview;
    @FindBy(xpath = "//*[@ng-repeat='account in accounts']/*/*")
    public WebElement accountAcc;
    @FindBy(xpath = "(//*[@class='ng-binding ng-scope'])[1]")
    public WebElement priceElectriCity;
    @FindBy(xpath = "(//a[@class='ng-binding'])[1]")
    public WebElement electricityBill;
    @FindBy(xpath = "(//a[@class='ng-binding'])[2]")
    public WebElement waterBill;
    @FindBy(xpath ="(//*[@class='ng-binding ng-scope'])[2]" )
    public WebElement priceWaterBill;
    @FindBy(xpath = "(//*[@class='ng-binding ng-scope'])[3]")
    public WebElement priceGas;
    @FindBy(xpath = "(//a[@class='ng-binding'])[3]")
    public WebElement priceGasBill;
    @FindBy(linkText ="Update Contact Info")
    public WebElement uptadeContact;
    @FindBy(id = "customer.firstName")
    public WebElement customerName;
    @FindBy(name = "customer.lastName")
    public WebElement customerLastname;
    @FindBy(name = "customer.address.street")
    public WebElement customerAddress;

    @FindBy(name = "customer.address.city")
    public WebElement customerCity;
    @FindBy(name = "customer.address.state")
    public WebElement customerState;
    @FindBy(name = "customer.address.zipCode")
    public WebElement customerZipcode;
    @FindBy(name = "customer.phoneNumber")
    public WebElement customerPhone;
    @FindBy(css = "[value='Update Profile']")
    public WebElement updateButton;
    @FindBy(css = "div h1")
    public WebElement updateMessage;
    @FindBy(linkText ="Log Out")
    public WebElement logout;
    @FindBy(xpath = "//span[@class='error ng-scope' and text()='First name is required.']")
    public WebElement errorMessage;



    public WebElement getWebElement(String strElement) {
        switch (strElement) {
            case "username": return username;
            case "password": return password;
            case "logInButton": return logInButton;
            case "billPayButton": return billPayButton;
            case "payeeName": return payeeName;
            case "address": return address;
            case "city": return city;
            case "state": return state;
            case "zipcode": return zipcode;
            case "account": return account;
            case "verifyAcc": return verifyAcc;
            case "amount": return amount;
            case "phone": return phone;
            case "sendPayment": return sendPayment;
            case "priceElectriCity": return priceElectriCity;
            case "amountPrice": return amountPrice;
            case "accountOverview": return accountOverview;
            case "accountAcc":return accountAcc;
            case "electricityBill":return electricityBill;
            case "priceGasBill":return priceGasBill;
            case "customerName":return customerName;
            case "customerLastname":return customerLastname;
            case "customerAddress":return customerAddress;
            case "customerCity":return customerCity;
            case "customerState":return customerState;
            case "customerZipcode":return customerZipcode;
            case "customerPhone":return customerPhone;
            case "updateButton":return updateButton;
            case "logout":return logout;
        }
        return null;
    }

}


