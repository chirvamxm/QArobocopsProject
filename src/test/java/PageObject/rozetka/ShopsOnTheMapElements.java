package PageObject.rozetka;

import PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShopsOnTheMapElements extends BasePage {
    public ShopsOnTheMapElements(WebDriver driver) {
        super(driver);
    }

    public WebElement stepanBanderaAvenue6() {
        return getElementByXpath("//p[@class='map-popup__address'] [contains(text(), ' проспект Степана Бандери, 6 (ст.м. Почайна) ')]");
    }
}