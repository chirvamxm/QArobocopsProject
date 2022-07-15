package PageObject.rozetka;

import PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartWebElements extends BasePage {
    public CartWebElements(WebDriver driver) {
        super(driver);
    }

    public WebElement getProductQuantityPlus() {
        return getElementByXpath("//button[@data-testid='cart-counter-increment-button']");
    }

    public WebElement getCloseCartBtn() {
        return getElementByXpath("//button[@class='modal__close']");
    }

    public WebElement getOtherActionsBtn() {
        return getElementByXpath("//button[@class='button button--white button--small popup-menu__toggle popup-menu__toggle--context']");
    }

    public WebElement getDeleteAllFromCartBtn() {
        return getElementByXpath("//button[@class='button button--medium button--with-icon button--link context-menu-actions__button']");
    }


    public WebElement emptyCart() {
        return getElementByXpath("//*[text()='Корзина пуста']");
    }

    // is the quantity of one product
    public WebElement theNumberOfUnits() {
        return getElementByXpath("//input[@class='cart-counter__input ng-pristine ng-valid ng-touched']");
    }

    public WebElement theNumberOfUnitsAudit(int number) {
        return getElementByXpath("//input[@class='cart-counter__input ng-pristine ng-valid ng-touched']");
    }
}

