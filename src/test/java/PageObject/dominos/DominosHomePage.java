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
    private static final String ENTER_BTN = "//button[@class='dp-btn red']";

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

    public List<WebElement> getEnterBtn() {
        return getElementsByXpath(ENTER_BTN);
    }
}
