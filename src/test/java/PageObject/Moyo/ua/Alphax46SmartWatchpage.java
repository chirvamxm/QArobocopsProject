package PageObject.Moyo.ua;

import PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Alphax46SmartWatchpage extends BasePage {
    public Alphax46SmartWatchpage(WebDriver driver) {
        super(driver);
    }

    public WebElement getCompareBtn() {
        return getElementByXpath("//div[@class='product_add-to-compare js-compare']");
    }
}
