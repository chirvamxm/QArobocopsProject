package PageObject.rozetka;

import PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SportAndHobbiesElements extends BasePage {

    public SportAndHobbiesElements(WebDriver driver) {
        super(driver);
    }

    public WebElement getSportAndHobbies() {
        return getElementByXpath("//a[@href='https://rozetka.com.ua/elektrosamokati/c4657382/']");
    }

    public WebElement getAnyScooter() {
        return getElementByXpath("//span[@class='goods-tile__title']");
    }
}