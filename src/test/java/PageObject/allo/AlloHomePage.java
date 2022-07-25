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
    private static final String VACANCIES_PAGE_BTN = "//a[@href='https://work.allo.ua/']";
    private static final String CONTACT_US_BTN = "//div[@class='main-button-block']";
    private static final String ERROR_REPORT_BTN = "//div[@class='contact-us-additional-buttons active']//a[@rel='nofollow noopener']";
    private static final String ERROR_REPORT_FIELD = "//div[@class='v-modal__cmp contact-us-error-popup']";
    private static final String PLAY_MARKET_BTN = "//a[@title='playmarket']";

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

    //button "вакансшї"
    public WebElement getVacanciesPageBtn() {
        return getElementByXpath(VACANCIES_PAGE_BTN);
    }

    //button "звязатися з нами"
    public WebElement getContactUsBtn() {
        return getElementByXpath(CONTACT_US_BTN);
    }

    //button "повідомити про помилку"
    public WebElement getErrorReportBtn() {
        return getElementsByXpath(ERROR_REPORT_BTN).get(4);
    }

    //field "повідомити про помилку"
    public WebElement getErrorReportField() {
        return getElementByXpath(ERROR_REPORT_FIELD);
    }

    //button "play market"
    public WebElement getPlayMarketBtn() {
        return getElementByXpath(PLAY_MARKET_BTN);
    }
}
