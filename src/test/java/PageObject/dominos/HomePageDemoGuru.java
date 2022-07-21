package PageObject.dominos;

import PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageDemoGuru extends BasePage {
    public HomePageDemoGuru(WebDriver driver) {
        super(driver);
    }

    private static final String FIRST_NAME = "//input[@name='firstName']";
    private static final String LAST_NAME = "//input[@name='lastName']";
    private static final String PHONE = "//input[@name='phone']";
    private static final String EMAIL = "//input[@id='userName']";
    private static final String ADDRESS = "//input[@name='address1']";
    private static final String CITY = "//input[@name='city']";
    private static final String STATE = "//input[@name='state']";
    private static final String POSTAL_CODE = "//input[@name='postalCode']";
    private static final String COUNTRY = "//select[@name='country']";
    private static final String USER_NAME = "//input[@name='email']";
    private static final String PASSWORD = "//input[@name='password']";
    private static final String CONFIRM_PASSWORD = "//input[@name='confirmPassword']";
    private static final String SEND = "//input[@name='submit']";

    public WebElement getCountryBtn() {
        return getElementByXpath(COUNTRY);
    }

    public WebElement getFirstNameBtn() {
        return getElementByXpath(FIRST_NAME);
    }

    public WebElement getLastNameBtn() {
        return getElementByXpath(LAST_NAME);
    }

    public WebElement getPhoneBtn() {
        return getElementByXpath(PHONE);
    }

    public WebElement getEmailBtn() {
        return getElementByXpath(EMAIL);
    }

    public WebElement getAddressBtn() {
        return getElementByXpath(ADDRESS);
    }

    public WebElement getCityBtn() {
        return getElementByXpath(CITY);
    }

    public WebElement getStateBtn() {
        return getElementByXpath(STATE);
    }

    public WebElement getPostalCodeBtn() {
        return getElementByXpath(POSTAL_CODE);
    }

    public WebElement getUserNameBtn() {
        return getElementByXpath(USER_NAME);
    }

    public WebElement getPasswordBtn() {
        return getElementByXpath(PASSWORD);
    }

    public WebElement getConfirmPasswordBtn() {
        return getElementByXpath(CONFIRM_PASSWORD);
    }

    public WebElement getSendBtn() {
        return getElementByXpath(SEND);
    }
}
