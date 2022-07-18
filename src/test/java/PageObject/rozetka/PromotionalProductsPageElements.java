package PageObject.rozetka;

import PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PromotionalProductsPageElements extends BasePage {
    public PromotionalProductsPageElements(WebDriver driver) {
        super(driver);
    }

    public WebElement promotionalProducts() {
        return getElementByXpath("//img[@class='promo-tile__picture']");
    }

    public WebElement filterWithDiscounts() {
        return getElementByXpath("//a[@class='checkbox-filter__link'] [contains(text(), 'Зі знижками')]");
    }

    public WebElement filterHouseHoldGoods() {
        return getElementByXpath("//a[@class='checkbox-filter__link'] [contains(text(), 'Товари для дому')]");
    }

    public WebElement moreGoodsBtn() {
        return getElementByXpath("//span[@class='show-more__text']");
    }
}