package PageObject.Moyo.ua;

import PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MoyoPageCategoryPhotoVideo extends BasePage {
    public MoyoPageCategoryPhotoVideo(WebDriver driver) {
        super(driver);
    }

    public WebElement getTopGoodsFirst() {
        return getElementsByXpath("//button[@class='buy-btn btn btn--green js-product-modal-close js-buy']").get(0);
    }

    public WebElement getSubPhotoEquipment() {
        return getElementsByXpath("//div[@class='portal-category-list__item portal-category-list__item-hover']").get(0);
    }

    public WebElement getSubTV() {
        return getElementsByXpath("//div[@class='portal-category-list__item portal-category-list__item-hover']").get(1);
    }

    public WebElement getSubVideoEquipment() {
        return getElementsByXpath("//div[@class='portal-category-list__item portal-category-list__item-hover']").get(2);
    }

    public WebElement getSubAudio() {
        return getElementsByXpath("//div[@class='portal-category-list__item portal-category-list__item-hover']").get(3);
    }
}
