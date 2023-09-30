package PagesSS;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LeftNavSS extends ParentSS {
    public LeftNavSS() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    public WebElement getWebElement(String strElement) {

        switch (strElement) {
        }

        return null;
    }
}
