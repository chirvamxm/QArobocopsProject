package PageObject.dominos;

import PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartHomePage extends BasePage {
    public CartHomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getDeleteProductBtn() {
        return getElementByXpath("//div[@class='order-card-item__close']");
    }

    public WebElement getEmptyCartBtn() {
        return getElementByXpath("//span[@class='cc-order__footer-content-sum']");
    }
}
