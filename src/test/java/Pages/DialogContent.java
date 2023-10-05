package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent {
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(linkText = "Register")
    public WebElement Register;
    @FindBy(css = "input[type='submit']")
    public WebElement login;
    @FindBy(xpath = "//a[text()='Open New Account']")
    public WebElement openNewAccount;
    @FindBy(xpath = "(//p/b)[3]")
    public WebElement depositedText;
    @FindBy(css = "input[value='Open New Account']")
    public WebElement createNewAccount;
    @FindBy(css = "[class='title']")
    public WebElement accountText;
    @FindBy(xpath = "(//p/b)[2]")
    public WebElement newAccountText;
    @FindBy(linkText = "Accounts Overview")
    public WebElement accountOverview;
    @FindBy(css = "[href=\"activity.htm?id=13899\"]")
    public WebElement account1;
    @FindBy(css = "[href=\"transaction.htm?id=14587\"]")
    public WebElement transactionBtn;
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
    @FindBy(css = "[type='submit']")
    public WebElement logInButton;
    @FindBy(linkText = "Bill Pay")
    public WebElement billPayButton;
    @FindBy(name = "payee.name")
    public WebElement payeeName;
    @FindBy(name = "payee.address.street")
    public WebElement address2;
    @FindBy(name = "payee.address.city")
    public WebElement city2;
    @FindBy(name = "payee.address.state")
    public WebElement state2;
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
    @FindBy(xpath = "//*[@ng-repeat='account in accounts']/*/*")
    public WebElement accountAcc;
    @FindBy(xpath = "(//*[@class='ng-binding ng-scope'])[1]")
    public WebElement priceElectriCity;
    @FindBy(xpath = "(//a[@class='ng-binding'])[1]")
    public WebElement electricityBill;
    @FindBy(xpath = "(//a[@class='ng-binding'])[2]")
    public WebElement waterBill;
    @FindBy(xpath = "(//*[@class='ng-binding ng-scope'])[2]")
    public WebElement priceWaterBill;
    @FindBy(xpath = "(//*[@class='ng-binding ng-scope'])[3]")
    public WebElement priceGas;
    @FindBy(xpath = "(//a[@class='ng-binding'])[3]")
    public WebElement priceGasBill;
    @FindBy(linkText = "Update Contact Info")
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
    @FindBy(linkText = "Log Out")
    public WebElement logout;
    @FindBy(xpath = "//span[@class='error ng-scope' and text()='First name is required.']")
    public WebElement errorMessage;

    public WebElement getElement(String element) {

        switch (element) {

            case "firstName":
                return this.firstName;
            case "lastName":
                return this.lastName;
            case "address":
                return this.address;
            case "city":
                return this.city;
            case "state":
                return this.state;
            case "zipCode":
                return this.zipCode;
            case "phoneNumber":
                return this.phoneNumber;
            case "ssn":
                return this.ssn;
            case "userName":
                return this.userName;
            case "password":
                return this.password;
            case "passwordConfirm":
                return this.passwordConfirm;
            case "forgotName":
                return this.forgotName;
            case "forgotLastName":
                return this.forgotLastName;
            case "forgotAddress":
                return this.forgotAddress;
            case "forgotCity":
                return this.forgotCity;
            case "forgotState":
                return this.forgotState;
            case "forgotZipCode":
                return this.forgotZipCode;
            case "forgotSsn":
                return this.forgotSsn;
            case "logInButton":
                return logInButton;
            case "billPayButton":
                return billPayButton;
            case "payeeName":
                return payeeName;
            case "address2":
                return address;
            case "city2":
                return city;
            case "state2":
                return state;
            case "zipcode":
                return zipcode;
            case "account":
                return account;
            case "verifyAcc":
                return verifyAcc;
            case "amount":
                return amount;
            case "phone":
                return phone;
            case "sendPayment":
                return sendPayment;
            case "priceElectriCity":
                return priceElectriCity;
            case "amountPrice":
                return amountPrice;
            case "accountOverview":
                return accountOverview;
            case "accountAcc":
                return accountAcc;
            case "electricityBill":
                return electricityBill;
            case "priceGasBill":
                return priceGasBill;
            case "customerName":
                return customerName;
            case "customerLastname":
                return customerLastname;
            case "customerAddress":
                return customerAddress;
            case "customerCity":
                return customerCity;
            case "customerState":
                return customerState;
            case "customerZipcode":
                return customerZipcode;
            case "customerPhone":
                return customerPhone;
            case "updateButton":
                return updateButton;
            case "logout":
                return logout;
        }
        return null;
    }
}
