package PageObject.Rozetka;

import PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactsPageWebElements extends BasePage {

    public ContactsPageWebElements(WebDriver driver) {
        super(driver);
    }

    public WebElement getHelpCenterBtn() {
        return getElementByXpath("//a[@class='button button--medium button--green']");
    }
}
