package PageObject.Moyo.ua;

import PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MoyoPageCategorySmartphones extends BasePage {
    public MoyoPageCategorySmartphones(WebDriver driver) {
        super(driver);
    }

    //the first item from "топ товарів"
    public WebElement getTopGoodsFirst() {
        return getElementsByXpath("//button[@class='buy-btn btn btn--green js-product-modal-close js-buy']").get(0);
    }

    public WebElement getOpenGoodsFirst() {
        return getElementsByXpath("//img[@class='first-image lazy-loaded']").get(0);
    }

    public WebElement getSubMenuFirst() {
        return getElementsByXpath("//div[@class='portal-category-list__item portal-category-list__item-hover']").get(0);
    }
}