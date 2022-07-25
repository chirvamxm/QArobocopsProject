package PageObject.amazon;

import PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonPageWebElements extends BasePage {

    public AmazonPageWebElements(WebDriver driver) {
        super(driver);
    }

    public static final String SELECT_LOCATION = "//input[@data-action-type='SELECT_LOCATION']";
    public static final String LOCATION_DROPDOWN = "//span[@class='a-button-dropdown a-button a-button-span12']";
    public static final String CANADA_LOCATION = "//a[@id='GLUXCountryList_1']";
    public static final String ACCEPT_LOCATION = "//button[@name='glowDoneButton']";
    public static final String SEARCH_FIELD = "//input[@id='twotabsearchtextbox']";
    public static final String SLEEP_MASK = "//span[contains(text(),'Contoured Cup Night Blindfold, Luxury Light Blocking Eye Cover')]";
    public static final String ADD_TO_CART = "//input[@name='submit.add-to-cart']";
    public static final String GO_TO_CART = "//a[@href='/gp/cart/view.html?ref_=sw_gtc']";
    public static final String CART_INFORMATION = "//span[@id='sc-subtotal-label-activecart']";

    public WebElement getSelectLocationBtn() {
        return getElementByXpath(SELECT_LOCATION);
    }

    public WebElement getDropdownLocationBtn() {
        return getElementByXpath(LOCATION_DROPDOWN);
    }

    public WebElement getCanadaLocationBtn() {
        return getElementByXpath(CANADA_LOCATION);
    }

    public WebElement getAcceptLocationBtn() {
        return getElementByXpath(ACCEPT_LOCATION);
    }

    public WebElement getSearchField() {
        return getElementByXpath(SEARCH_FIELD);
    }

    public WebElement getSleepMaskBtn() {
        return getElementByXpath(SLEEP_MASK);
    }

    public WebElement getAddToCartBtn() {
        return getElementByXpath(ADD_TO_CART);
    }

    public WebElement getGoToCartBtn() {
        return getElementByXpath(GO_TO_CART);
    }

    public WebElement getCartInformation() {
        return getElementByXpath(CART_INFORMATION);
    }
}
