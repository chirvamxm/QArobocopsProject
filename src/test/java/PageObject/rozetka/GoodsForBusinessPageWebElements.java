package PageObject.rozetka;

import PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoodsForBusinessPageWebElements extends BasePage {

    public GoodsForBusinessPageWebElements(WebDriver driver) {
        super(driver);
    }

    //POPULAR CATEGORIES SECTION

    public WebElement getSafesBtn() {
        return getElementByXpath("//a[@title='https://bt.rozetka.com.ua/seyfy/c163969/']");
    }

    //SAFES SECTION

    public WebElement getBuiltInSafesBtn() {
        return getElementByXpath("//a[@href='https://rozetka.com.ua/ua/vstraivaemie-seyfi/c4656126/']");
    }
}
