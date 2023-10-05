package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class iremDialogContent extends Parent{
    public iremDialogContent() {PageFactory.initElements(GWD.getDriver(), this);}

    @FindBy(css = "input[name='username']")
    public WebElement username;

    @FindBy(css = "input[name='password']")
    public WebElement password;

    @FindBy(css= "input[type='submit']")
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







}
