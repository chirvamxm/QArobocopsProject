package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RozetkaBooksPageWebElements extends BasePage{

    public RozetkaBooksPageWebElements(WebDriver driver) {
        super(driver);
    }

    //CATEGORIES

    public WebElement getTravelingAndSportBooksCategoryBtn() {
        return getElementByXpath("//img[@alt='Подорожі та спорт']");
    }

    //TRAVELING AND SPORT CATEGORY

    public WebElement getArtOfWarBookBtn() {
        return getElementByXpath("//div[@data-goods-id='15039699']");
    }
}
