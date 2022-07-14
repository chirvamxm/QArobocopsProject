package PageObject.Rozetka;

import PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ItemsPageWebElements extends BasePage {

    public ItemsPageWebElements(WebDriver driver) {
        super(driver);
    }

    public WebElement getAddToCartBtn() {
        return getElementByXpath("//li[@class='product-buttons__item ng-star-inserted']");
    }
    public WebElement getToMySelectedGoods (){
        return getElementByXpath("//span[@class='buy-button__label ng-star-inserted'] [contains(text(), ' В корзине ')]");
    }
}
