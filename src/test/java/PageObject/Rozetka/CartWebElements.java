package PageObject.Rozetka;

import PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartWebElements extends BasePage {
    public CartWebElements(WebDriver driver) {
        super(driver);
    }

    public WebElement getProductQuantityPlus() {
        return getElementByXpath("//button[@class='button button_color_white button_size_medium cart-counter__button'] [@data-testid='cart-counter-increment-button']");
    }

    // is the quantity of one product
    public WebElement theNumberOfUnits() {
        return getElementByXpath("//input[@class='cart-counter__input ng-pristine ng-valid ng-touched']");
    }

    public WebElement theNumberOfUnitsAudit(int number) {
        return getElementByXpath("//input[@class='cart-counter__input ng-pristine ng-valid ng-touched']");
    }

}

