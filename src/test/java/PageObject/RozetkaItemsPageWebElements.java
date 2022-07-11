package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RozetkaItemsPageWebElements extends BasePage{

    public RozetkaItemsPageWebElements(WebDriver driver) {
        super(driver);
    }

    public WebElement getAddToCartBtn() {
        return getElementByXpath("//li[@class='product-buttons__item ng-star-inserted']");
    }
    public WebElement getToMySelectedGoods (){
        return getElementByXpath("//button[@class='buy-button buy-button_state_in-cart button button--with-icon button--green button--medium ng-star-inserted']");
    }
}
