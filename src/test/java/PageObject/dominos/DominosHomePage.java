package PageObject.dominos;

import PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DominosHomePage extends BasePage {
    public DominosHomePage(WebDriver driver) {
        super(driver);
    }

    private static final String CLOSE_SELECT_CITY_BTN = "//button[@class='dp-modal__close-btn']";
    private static final String SING_IN_BTN = "//div[@class='fake-header__sing-in-block']";
    private static final String USER_NAME_BTN = "//input[@name='email']";
    private static final String PASSWORD_BTN = "//input[@name='password']";
    private static final String LOGIN_BTN = "//form//button[contains(text(),'Увійти')]";
    private static final String SELECT_CITY_BTN = "//div[contains(text(), '%s')]";
    private static final String ADD_CART_BTN = "//button[@class='button-cart__order-button']";


    public WebElement getCloseSelectCityBtn() {
        return getElementByXpath(CLOSE_SELECT_CITY_BTN);
    }

    public WebElement getSingInBtn() {
        return getElementByXpath(SING_IN_BTN);
    }

    public WebElement getUserNameBtn() {
        return getElementByXpath(USER_NAME_BTN);
    }

    public WebElement getPasswordBtn() {
        return getElementByXpath(PASSWORD_BTN);
    }

    public WebElement getEnterBtn() {
        return getElementByXpath(LOGIN_BTN);
    }

    public WebElement getSelectCityBtn(String cityName) {
        return getElementByXpath(String.format(SELECT_CITY_BTN, cityName));
    }

    public List<WebElement> getAddCartProductBtn() {
        return getElementsByXpath("//button[@class='dp-product-block__cart-button']");
    }

    public WebElement getAddCartBtn() {
        return getElementByXpath(ADD_CART_BTN);
    }

    public WebElement getSelectOdessaBtn() {
        return getElementByXpath("//div[contains(text(),'Одеса')]");
    }

    public WebElement getCategoryBtn() {
        return getElementByXpath("//div[@class='main-header__hamburger-menu']");
    }

    public WebElement getSaiduBtn() {
        return getElementByXpath("//span[contains(text(), 'Сайди')]");
    }

    public WebElement getSelectSocialNetwork(String network) {
        return getElementByXpath(String.format("//a[@class='%s']", network));
    }

    public DominosHomePage singIn() {
        getSingInBtn().click();
        getUserNameBtn().sendKeys("vbaranskiy@inbox.ru\n");
        getPasswordBtn().sendKeys("19121997\n");
        getEnterBtn().click();
        return this;
    }
}

