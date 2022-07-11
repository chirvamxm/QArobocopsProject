package PageObject.Rozetka;

import PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BooksPageWebElements extends BasePage {

    public BooksPageWebElements(WebDriver driver) {
        super(driver);
    }

    //CATEGORIES

    public WebElement getTravelingAndSportBooksCategoryBtn() {
        return getElementByXpath("//img[@alt='Подорожі та спорт']");
    }

    //TRAVELING AND SPORT CATEGORY

    public List<WebElement> getBigAtlasOfTheWorldBtn() {
        return getElementsByXpath("//a[@title='Великий ілюстрований атлас Світу (9789669362568)']");
    }



}
