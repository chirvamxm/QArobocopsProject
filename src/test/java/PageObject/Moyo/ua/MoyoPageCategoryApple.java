package PageObject.Moyo.ua;

import PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MoyoPageCategoryApple extends BasePage {
    public MoyoPageCategoryApple(WebDriver driver) {
        super(driver);
    }

    public WebElement getTopGoodsFirst() {
        return getElementsByXpath("//button[@class='buy-btn btn btn--green js-product-modal-close js-buy']").get(0);
    }

    public WebElement getSubAppleMacBook() {
        return getElementsByXpath("//div[@class='portal-category-list__item']").get(0);
    }

    public WebElement getSubApplePad() {
        return getElementsByXpath("//div[@class='portal-category-list__item']").get(1);
    }

    public WebElement getSubApplePhone() {
        return getElementsByXpath("//div[@class='portal-category-list__item']").get(2);
    }

    public WebElement getSubAppleWatch() {
        return getElementsByXpath("//div[@class='portal-category-list__item']").get(3);
    }

    public WebElement getSubAppleTV() {
        return getElementsByXpath("//div[@class='portal-category-list__item']").get(4);
    }

    public WebElement getSubAppleCases() {
        return getElementsByXpath("//div[@class='portal-category-list__item']").get(5);
    }

    public WebElement getSubAppleHeadphone() {
        return getElementsByXpath("//div[@class='portal-category-list__item']").get(6);
    }

    public WebElement getSubAppleProtectiveGlass() {
        return getElementsByXpath("//div[@class='portal-category-list__item']").get(7);
    }
}
