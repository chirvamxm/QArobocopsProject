package PageObject.rozetka;

import PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlcoholAndProductsPageWebElements extends BasePage {

    public AlcoholAndProductsPageWebElements(WebDriver driver) {
        super(driver);
    }

    public WebElement confirmAgeBtn() {
        return getElementByXpath("//div[@class='rz-banner__btn rz-btn_blue btn-link']");
    }

    //CATEGORIES

    public WebElement getStrongDrinksBtn() {
        return getElementByXpath("//a[@title='Міцні напої']");
    }

    //STRONG DRINKS CATEGORIES

    public WebElement getWhiskeyBtn() {
        return getElementByXpath("//a[@href='https://rozetka.com.ua/ua/viski/c4649130/']");
    }

    //WHISKEY PRODUCTS

    public WebElement getJamesonWhiskey1LBtn() {
        return getElementByXpath("//div[@data-goods-id='4719078']");
    }

    public WebElement getChivasRegalMizurana07LBtn() {
        return getElementByXpath("//div[@data-goods-id='345543760']");
    }
}
