package PageObject.Moyo.ua;

import PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MoyoPageBasket extends BasePage {
    public MoyoPageBasket(WebDriver driver) {
        super(driver);
    }

    public WebElement getBuyBtn() {
        return getElementByXpath("//button[@class='rds-btn']");
    }
}
