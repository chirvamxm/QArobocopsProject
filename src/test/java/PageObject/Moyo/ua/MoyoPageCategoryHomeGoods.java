package PageObject.Moyo.ua;

import PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MoyoPageCategoryHomeGoods extends BasePage {
    public MoyoPageCategoryHomeGoods(WebDriver driver) {
        super(driver);
    }

    public WebElement getTopGoodsFirst() {
        return getElementsByXpath("//button[@class='buy-btn btn btn--green js-product-modal-close js-buy']").get(0);
    }

    public WebElement getSubCookware() {
        return getElementsByXpath("//div[@class='portal-category-list__item portal-category-list__item-hover']").get(0);
    }

    public WebElement getSubDishesForServing() {
        return getElementsByXpath("//div[@class='portal-category-list__item portal-category-list__item-hover']").get(1);
    }

    public WebElement getSubPlumbing() {
        return getElementsByXpath("//div[@class='portal-category-list__item portal-category-list__item-hover']").get(2);
    }

    public WebElement getSubLighting() {
        return getElementsByXpath("//div[@class='portal-category-list__item portal-category-list__item-hover']").get(3);
    }

    public WebElement getSubSecurityAndAlarm() {
        return getElementsByXpath("//div[@class='portal-category-list__item portal-category-list__item-hover']").get(4);
    }

    public WebElement getSubAlternativeEnergy() {
        return getElementsByXpath("//div[@class='portal-category-list__item portal-category-list__item-hover']").get(5);
    }

    public WebElement getSubHomeDecor() {
        return getElementsByXpath("//div[@class='portal-category-list__item portal-category-list__item-hover']").get(6);
    }

    public WebElement getSubBagsAndAccessories() {
        return getElementsByXpath("//div[@class='portal-category-list__item portal-category-list__item-hover']").get(7);
    }
}