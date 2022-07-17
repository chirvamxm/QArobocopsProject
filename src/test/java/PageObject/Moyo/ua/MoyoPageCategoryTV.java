package PageObject.Moyo.ua;

import PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MoyoPageCategoryTV extends BasePage {
    public MoyoPageCategoryTV(WebDriver driver) {
        super(driver);
    }

    public WebElement getTopGoodsFirst() {
        return getElementsByXpath("//button[@class='buy-btn btn btn--green js-product-modal-close js-buy']").get(0);
    }

    public WebElement getSubTV() {
        return getElementsByXpath("//div[@class='portal-category-list__item portal-category-list__item-hover']").get(0);
    }

    public WebElement getSubMediaPlayers() {
        return getElementsByXpath("//div[@class='portal-category-list__item portal-category-list__item-hover']").get(1);
    }

    public WebElement getSubProjectors() {
        return getElementsByXpath("//div[@class='portal-category-list__item portal-category-list__item-hover']").get(2);
    }

    public WebElement getSubProjectionScreens() {
        return getElementsByXpath("//div[@class='portal-category-list__item portal-category-list__item-hover']").get(3);
    }

    public WebElement getSubHoldersForProjectors() {
        return getElementsByXpath("//div[@class='portal-category-list__item portal-category-list__item-hover']").get(4);
    }

    public WebElement getSubOptionsForProjectors() {
        return getElementsByXpath("//div[@class='portal-category-list__item portal-category-list__item-hover']").get(5);
    }

    public WebElement getSubElectronicBoards() {
        return getElementsByXpath("//div[@class='portal-category-list__item portal-category-list__item-hover']").get(6);
    }

    public WebElement getSubInformationDisplays() {
        return getElementsByXpath("//div[@class='portal-category-list__item portal-category-list__item-hover']").get(7);
    }

    public WebElement getSubFramesForTV() {
        return getElementsByXpath("//div[@class='portal-category-list__item portal-category-list__item-hover']").get(8);
    }

    public WebElement getSubWallBoards() {
        return getElementsByXpath("//div[@class='portal-category-list__item portal-category-list__item-hover']").get(9);
    }
}