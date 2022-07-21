package PageObject.glovo;

import PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageWebElements extends BasePage {

    public HomePageWebElements(WebDriver driver) {
        super(driver);
    }

    // HEADER
    public static final String GET_STARTED_BTN = "//button[@id='user-register']";
    public static final String PROFILE_BTN = "//img[@alt='Profile']";
    //SIGN IN WINDOW
    public static final String LOG_IN_BTN = "//button[@data-e2e-id='header-user-login']";
    public static final String EMAIL_ADDRESS_FIELD = "//input[@data-test-id='text-field-input'][@name='email']";
    public static final String PASSWORD_FIELD = "//input[@data-test-id='text-field-input'][@name='password']";
    public static final String LOG_IN_WITH_EMAIL_BTN = "//button[@id='login-button']";
    // ADDRESS DELIVERY WINDOW
    public static final String USE_CURRENT_LOCATION_BTN = "//div[@data-test-id='use-current-location'][@class='current-location']";
    //RESTAURANTS CATEGORY
    public static final String PRESTO_PIZZA_RESTAURANT_BTN = "//a[@href='/ua/uk/lutsk/presto-pizza-lut/']";
    //PRESTO PIZZA RESTAURANT PAGE
    public static final String PRESTO_PIZZA_BTN = "//img[@src='https://res.cloudinary.com/glovoapp/f_auto,q_auto/Products/nbutdki8xnx2vufxszsi']";
    public static final String EL_POLO_PIZZA_BTN = "//img[@src='https://res.cloudinary.com/glovoapp/f_auto,q_auto/Products/r6ixea8wnjnnbr5tag07']";
    public static final String SALAMI_PIZZA_BTN = "//img[@src='https://res.cloudinary.com/glovoapp/f_auto,q_auto/Products/o9kivvd5bixhzkwhgfkf']";
    public static final String ADD_TO_CART_BTN = "//button[@data-test-id='add-button']";
    public static final String FREE_DELIVERY_MESSAGE_BTN = "//span[@data-test-id='surcharge-button']";
    //FOOTER
    public static final String SOCIAL_NETWORK_BTN = "//a[@href='%s']";

    public WebElement getStartedBtn() {
        return getElementByXpath(GET_STARTED_BTN);
    }

    public WebElement getProfileBtn() {
        return getElementByXpath(PROFILE_BTN);
    }

    public WebElement getLogIn() {
        return getElementByXpath(LOG_IN_BTN);
    }

    public WebElement getEmailAddressField() {
        return getElementByXpath(EMAIL_ADDRESS_FIELD);
    }

    public WebElement getPasswordField() {
        return getElementByXpath(PASSWORD_FIELD);
    }

    public WebElement getLogInWithEmailBtn() {
        return getElementByXpath(LOG_IN_WITH_EMAIL_BTN);
    }

    public WebElement getUseCurrentLocationBtn() {
        return getElementByXpath(USE_CURRENT_LOCATION_BTN);
    }

    public WebElement getPrestoPizzaBtn() {
        return getElementByXpath(PRESTO_PIZZA_BTN);
    }

    public WebElement getElPoloPizzaBtn() {
        return getElementByXpath(EL_POLO_PIZZA_BTN);
    }

    public WebElement getSalamiPizzaBtn() {
        return getElementByXpath(SALAMI_PIZZA_BTN);
    }

    public WebElement getAddToCartBtn() {
        return getElementByXpath(ADD_TO_CART_BTN);
    }

    public WebElement freeDeliveryMessage() {
        return getElementByXpath(FREE_DELIVERY_MESSAGE_BTN);
    }

    public WebElement getPrestoPizzaRestaurantBtn() {
        return getElementByXpath(PRESTO_PIZZA_RESTAURANT_BTN);
    }

    public WebElement getSocialNetworkBtn(String currentNetwork) {
        return getElementByXpath(String.format(SOCIAL_NETWORK_BTN, currentNetwork));
    }
}
