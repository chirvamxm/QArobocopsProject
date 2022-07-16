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

    public WebElement getSortCheap() {
        return getElementByXpath("//div[@data-sort='price-asc']");
    }

    public WebElement getSortExpensive() {
        return getElementByXpath("//div[@data-sort='price-desc']");
    }

    public WebElement getSortNew() {
        return getElementByXpath("//div[@data-sort='novinka-desc']");
    }

    public WebElement getSortPopular() {
        return getElementByXpath("//div[@data-sort='weeklyrate-desc']");
    }

    public WebElement getSubSmartphones() {
        return getElementsByXpath("//div[@class='portal-category-list__item portal-category-list__item-hover']").get(0);
    }

    public WebElement getSubMobilePhones() {
        return getElementsByXpath("//div[@class='portal-category-list__item portal-category-list__item-hover']").get(1);
    }

    public WebElement getSubModems() {
        return getElementsByXpath("//div[@class='portal-category-list__item portal-category-list__item-hover']").get(2);
    }

    public WebElement getSubModemsLandlinePhones() {
        return getElementsByXpath("//div[@class='portal-category-list__item portal-category-list__item-hover']").get(3);
    }

    public WebElement getSubSimCards() {
        return getElementsByXpath("//div[@class='portal-category-list__item portal-category-list__item-hover']").get(4);
    }

    public WebElement getSubVouchers() {
        return getElementsByXpath("//div[@class='portal-category-list__item portal-category-list__item-hover']").get(5);
    }

    public WebElement getSubMiniATS() {
        return getElementsByXpath("//div[@class='portal-category-list__item portal-category-list__item-hover']").get(6);
    }
}