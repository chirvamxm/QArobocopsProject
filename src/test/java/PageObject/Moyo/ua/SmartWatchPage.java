package PageObject.Moyo.ua;

import PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SmartWatchPage extends BasePage {
    public SmartWatchPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getWatchImgBlackBtn() {
        return getElementByXpath("//div[@data-id='503596']");
    }

    public WebElement getWatchImgSilverBtn() {
        return getElementByXpath("//div[@data-id='503610']");
    }
}
