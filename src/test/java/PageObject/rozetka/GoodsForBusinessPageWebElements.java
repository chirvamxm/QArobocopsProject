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

    public WebElement getMetalCabinetsBtn() {
        return getElementByXpath("//a[@title='https://bt.rozetka.com.ua/metallicheskie-shkafy/c163983/']");
    }

    public WebElement getLabelsPrintersBtn() {
        return getElementByXpath("//a[@title='https://rozetka.com.ua/printery-etiketok/c4625268/']");
    }

    public WebElement getHighPressureWashersBtn() {
        return getElementByXpath("//a[@title='https://rozetka.com.ua/cleaners/c155534/']");
    }

    public WebElement getBoxesBtn() {
        return getElementByXpath("//a[@title='https://rozetka.com.ua/ua/yashchiki/c4641728/']");
    }

    //SAFES SECTION

    public WebElement getBuiltInSafesBtn() {
        return getElementByXpath("//a[@href='https://rozetka.com.ua/ua/vstraivaemie-seyfi/c4656126/']");
    }
}
