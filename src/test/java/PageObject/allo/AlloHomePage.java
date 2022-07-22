package PageObject.allo;

import PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlloHomePage extends BasePage {
    public AlloHomePage(WebDriver driver) {
        super(driver);
    }

    private static final String CITY_GEO_BTN = "//span[@class='mh-loc__label']";
    private static final String SELECT_CITY_GEO_BTN = "//a[@data-geo-select-city='%s']";
    private static final String SMARTPHONES_MENU_BTN = "//li[@class='mm__item']";
    private static final String SMARTPHONES_SUBMENU_BTN = "//a[@class='portal-group__title-link']";
    private static final String BUY_BTN = "//button[@class='v-btn--cart']";
    private static final String CONFIRM_ORDER_BTN = "//button[@class='order-now']";

    public WebElement getCityGeoBtn() {
        return getElementByXpath(CITY_GEO_BTN);
    }

    public WebElement getSelectCityGeoBtn(String CityName) {
        return getElementByXpath(String.format(SELECT_CITY_GEO_BTN, CityName));
    }

    //menu item "смартфони та телефони"
    public WebElement getSmartphonesMenuBtn() {
        return getElementsByXpath(SMARTPHONES_MENU_BTN).get(0);
    }

    //submenu item "смартфони та мобільні телефони"
    public WebElement getSmartphonesSubMenuBtn() {
        return getElementsByXpath(SMARTPHONES_SUBMENU_BTN).get(0);
    }

    //button "купити" on first product
    public WebElement getFirstProductBuyBtn() {
        return getElementsByXpath(BUY_BTN).get(0);
    }

    //button "оформити замовлення"
    public WebElement getConfirmOrderBtn() {
        return getElementByXpath(CONFIRM_ORDER_BTN);
    }
}
