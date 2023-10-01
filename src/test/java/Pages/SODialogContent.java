package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SODialogContent extends Parent {

    public SODialogContent() {PageFactory.initElements(GWD.getDriver(), this);}

    @FindBy(linkText = "Register")
    public WebElement registerButton;

    @FindBy(css = "[id='customer.firstName']")
    public WebElement firstName;

    @FindBy(css = "[id='customer.lastName']")
    public WebElement lastName;

    @FindBy(css = "[id='customer.address.street']")
    public WebElement address;

    @FindBy(css = "[id='customer.address.city']")
    public WebElement city;

    @FindBy(css = "[id='customer.address.state']")
    public WebElement state;

    @FindBy(css = "[id='customer.address.zipCode']")
    public WebElement zipCode;

    @FindBy(css = "[id='customer.phoneNumber']")
    public WebElement phoneNumber;

    @FindBy(css = "[id='customer.ssn']")
    public WebElement ssn;

    @FindBy(css = "[id='customer.username']")
    public WebElement userName;

    @FindBy(css = "[id='customer.password']")
    public WebElement password;

    @FindBy(css = "[id='repeatedPassword']")
    public WebElement passwordConfirm;

    @FindBy(css = "input[value='Register']")
    public WebElement submitButton;

    @FindBy(css = "div[id='rightPanel'] > p")
    public WebElement successMessage;

    @FindBy(linkText = "Request Loan")
    public WebElement requestLoanButton;

    @FindBy(id = "amount")
    public WebElement loanAmount;

    @FindBy(id = "downPayment")
    public WebElement downPayment;

    @FindBy(id = "fromAccountId")
    public WebElement fromAccountId;

    @FindBy(css = "input[value='Apply Now']")
    public WebElement applyNowButton;

    @FindBy(id = "loanProviderName")
    public WebElement loanProviderName;

    @FindBy(id = "loanStatus")
    public WebElement loanStatus;

    @FindBy(css = "div[class='ng-scope'] > p")
    public WebElement approvedMessage;

    @FindBy(id = "newAccountId")
    public WebElement newAccountId;

    @FindBy(id = "accountType")
    public WebElement accountType;

    @FindBy(id = "balance")
    public WebElement balance;

    @FindBy(id = "availableBalance")
    public WebElement availableBalance;

    @FindBy(css = "p[class='ng-scope'] > b")
    public WebElement transactionMessage;

    @FindBy(css = "span[id='customer.username.errors']")
    public WebElement existsMessage;

    @FindBy(css = "span[id='repeatedPassword.errors']")
    public WebElement passwordMatchMessage;

    @FindBy(linkText = "Forgot login info?")
    public WebElement forgotLoginButton;

    @FindBy(id = "firstName")
    public WebElement forgotName;

    @FindBy(id = "lastName")
    public WebElement forgotLastName;

    @FindBy(id = "address.street")
    public WebElement forgotAddress;

    @FindBy(id = "address.city")
    public WebElement forgotCity;

    @FindBy(id = "address.state")
    public WebElement forgotState;

    @FindBy(id = "address.zipCode")
    public WebElement forgotZipCode;

    @FindBy(id = "ssn")
    public WebElement forgotSsn;

    @FindBy(css = "input[value='Find My Login Info']")
    public WebElement findMyInfoButton;

    @FindBy(css = "div[id='rightPanel'] > p")
    public WebElement loggedInMessage;

    public WebElement getElement(String element) {

        switch (element) {

            case "firstName": return this.firstName;
            case "lastName": return this.lastName;
            case "address": return this.address;
            case "city": return this.city;
            case "state": return this.state;
            case "zipCode": return this.zipCode;
            case "phoneNumber": return this.phoneNumber;
            case "ssn": return this.ssn;
            case "userName": return this.userName;
            case "password": return this.password;
            case "passwordConfirm": return this.passwordConfirm;
            case "forgotName": return this.forgotName;
            case "forgotLastName": return this.forgotLastName;
            case "forgotAddress": return this.forgotAddress;
            case "forgotCity": return this.forgotCity;
            case "forgotState": return this.forgotState;
            case "forgotZipCode": return this.forgotZipCode;
            case "forgotSsn": return this.forgotSsn;
        }
        return null;
    }
}
