package PageObject.Moyo.ua;

import PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MoyoHomePage extends BasePage {

    public MoyoHomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getEnterBtn() {
        return getElementByXpath("//div[@class='header_cabinet_link js-auth-modal-show']");
    }

    public WebElement getRegisteredBtn() {
        return getElementByXpath("//div[@data-tab='reg']");
    }

    public WebElement getNameSearchBtn() {
        return getElementByXpath("//input[@name='firstname']");
    }

    public WebElement getPhoneSearchBtn() {
        return getElementByXpath("//input[@name='phone']");
    }

    public WebElement getEmailSearchBtn() {
        return getElementByXpath("//input[@type='email']");
    }

    public WebElement getAgreeWithRegBtn() {
        return getElementByCssSelector("#agree_with_reg");
    }

    public WebElement getRegisterBtn() {
        return getElementByXpath("//button[@class='btn js-auth-form-submit']");
    }

    public WebElement getMoyoTradeBtn() {
        return getElementByXpath("//li[@class='header_nav_item js-exchange-switch-color']");
    }

    public WebElement getSearchPhoneOrEmailBtn() {
        return getElementByXpath("//input[@placeholder='Телефон или email']");
    }

    public WebElement getDropBoxEnterBtn() {
        return getElementByXpath("//button[@class='btn js-auth-form-submit']");
    }

    public WebElement getSearchFieldBtn() {
        return getElementByXpath("//input[@id='search-input']");
    }

    public List<WebElement> getComparesBtn() {
        return getElementsByXpath("//div[@data-async='L3Byb2R1Y3RzL2NvbXBhcmUv']");
    }

    public WebElement getPlayVideoBtn() {
        return getElementByXpath("//div[@class='video-reviews_item slick-slide slick-current slick-active']");
    }

    public WebElement getMenuBtn() {
        return getElementByXpath("//div[@class='header_catalog_btn js-menu-btn']");
    }

    public WebElement getMenuCategoryApple() {
        return getElementByXpath("//a[@class='menu_link item-6961']");
    }

    public WebElement getMenuCategorySmartphones() {
        return getElementByXpath("//a[@class='menu_link item-2853']");
    }

    public WebElement getMenuCategoryNotebooks() {
        return getElementByXpath("//a[@class='menu_link item-3309']");
    }

    public WebElement getMenuCategoryGadgets() {
        return getElementByXpath("//a[@class='menu_link item-2915']");
    }

    public WebElement getMenuCategoryTablets() {
        return getElementByXpath("//a[@class='menu_link item-6512']");
    }

    public WebElement getMenuCategoryPhotoVideo() {
        return getElementByXpath("//a[@class='menu_link item-2981']");
    }

    public WebElement getMenuCategoryTvAudio() {
        return getElementByXpath("//a[@class='menu_link item-7759']");
    }

    public WebElement getMenuCategoryHomeEquipment() {
        return getElementByXpath("//a[@class='menu_link item-4439']");
    }

    public WebElement getMenuCategoryAcsessor() {
        return getElementByXpath("//a[@class='menu_link item-3325']");
    }

    public WebElement getMenuCategoryHomeGoods() {
        return getElementByXpath("//a[@class='menu_link item-4951']");
    }

    public WebElement getMenuCategoryInstruments() {
        return getElementByXpath("//a[@class='menu_link item-4910']");
    }

    public WebElement getMenuCategoryKidsWorld() {
        return getElementByXpath("//a[@class='menu_link item-5513']");
    }

    public WebElement getMenuCategoryGameZone() {
        return getElementByXpath("//a[@class='menu_link item-2914']");
    }

    public WebElement getSharesBtn() {
        return getElementByXpath("//li[@class='header_nav_item header_nav_item--actions ']");
    }

    public WebElement showUserRegistered() {
        return getElementByXpath("//div[text()='Пользователь с таким e-mail адресом уже существует']");
    }

    public WebElement getCityBtn() {
        return getElementByXpath("//span[@data-class='cities']");
    }

    public WebElement getSelectCity(String cityName) {
        return getElementByXpath(String.format("//div[@data-city='%s']", cityName));
    }

    public WebElement getBlueMessageBtn() {
        return getElementByXpath("//div[@class='widget-opener__button']");
    }

    public WebElement getTelegramBtn() {
        return getElementByXpath("//a[@href='https://t.me/MOYObot_bot']");
    }
}
