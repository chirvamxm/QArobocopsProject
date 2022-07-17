package PageObject.rozetka;

import PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenuWebElements extends BasePage {
    public MenuWebElements(WebDriver driver) {
        super(driver);
    }
    public WebElement chooseACity() {
        return getElementByXpath("//span[@class='city-toggle__text']");
    }
}
