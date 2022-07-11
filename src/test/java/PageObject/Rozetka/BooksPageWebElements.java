package PageObject.Rozetka;

import PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BooksPageWebElements extends BasePage {

    public BooksPageWebElements(WebDriver driver) {
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
