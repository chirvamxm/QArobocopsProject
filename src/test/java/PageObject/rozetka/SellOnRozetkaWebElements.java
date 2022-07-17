package PageObject.rozetka;

import PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SellOnRozetkaWebElements extends BasePage {
    public SellOnRozetkaWebElements(WebDriver driver) {
        super(driver);
    }

    public WebElement fillOutAnApplication() {
        return getElementByXpath("//a[@class='mat-focus-indicator but but-white fadein-start--loagin mat-raised-button mat-button-base']");
    }

// store details

    public WebElement theCompanyName() {
        return getElementByXpath("//input[@id='mat-input-0']");
    }

    public WebElement tickDontHaveWebSite() {
        return getElementByXpath("//span[@class='mat-checkbox-inner-container']");
    }

    public WebElement quantityOfGoods() {
        return getElementByXpath("//input[@id='mat-input-2']");
    }

    public WebElement getToBreed() {
        return getElementByXpath("//span[@class='mat-button-wrapper'] [contains(text(), 'Продовжити')]");
    }

    public WebElement contactInformation() {
        return getElementByXpath("//input[@id='mat-input-3']");
    }
}
