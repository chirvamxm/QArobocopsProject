package PageObject.rozetka;

import PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HouseholdAppliancesWebElements extends BasePage {

    public HouseholdAppliancesWebElements(WebDriver driver) {
        super(driver);
    }

    public WebElement getRefrigeratorsBtn() {
        return getElementByXpath("//a[@href='https://bt.rozetka.com.ua/refrigerators/c80125/']");
    }

    // chooses any refrigerator
    public WebElement getAnyRefrigerator() {
        return getElementByXpath("//a[@href='https://bt.rozetka.com.ua/refrigerators/c80125/']");
    }
}
