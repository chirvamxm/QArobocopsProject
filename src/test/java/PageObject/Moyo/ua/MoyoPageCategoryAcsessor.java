package PageObject.Moyo.ua;

import PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MoyoPageCategoryAcsessor extends BasePage {
    public MoyoPageCategoryAcsessor(WebDriver driver) {
        super(driver);
    }

    public WebElement getTopGoodsFirst() {
        return getElementsByXpath("//button[@class='buy-btn btn btn--green js-product-modal-close js-buy']").get(0);
    }

    public WebElement getSubAccessoriesForPC() {
        return getElementsByXpath("//div[@class='portal-category-list__item portal-category-list__item-hover']").get(0);
    }

    public WebElement getSubAccessoriesForPhones() {
        return getElementsByXpath("//div[@class='portal-category-list__item portal-category-list__item-hover']").get(1);
    }

    public WebElement getSubAccessoriesForTV() {
        return getElementsByXpath("//div[@class='portal-category-list__item portal-category-list__item-hover']").get(2);
    }

    public WebElement getSubAccessoriesForPhotoVideoAudio() {
        return getElementsByXpath("//div[@class='portal-category-list__item portal-category-list__item-hover']").get(3);
    }

    public WebElement getSubAccessoriesForPortableEquipment() {
        return getElementsByXpath("//div[@class='portal-category-list__item portal-category-list__item-hover']").get(4);
    }

    public WebElement getSubElementsOfPower() {
        return getElementsByXpath("//div[@class='portal-category-list__item portal-category-list__item-hover']").get(5);
    }

    public WebElement getSubChargers() {
        return getElementsByXpath("//div[@class='portal-category-list__item portal-category-list__item-hover']").get(6);
    }

    public WebElement getSubCables() {
        return getElementsByXpath("//div[@class='portal-category-list__item portal-category-list__item-hover']").get(7);
    }

    public WebElement getSubExternalBatteries() {
        return getElementsByXpath("//div[@class='portal-category-list__item portal-category-list__item-hover']").get(8);
    }

    public WebElement getSubHeadphone() {
        return getElementsByXpath("//div[@class='portal-category-list__item portal-category-list__item-hover']").get(9);
    }

    public WebElement getSubMeansOfCare() {
        return getElementsByXpath("//div[@class='portal-category-list__item portal-category-list__item-hover']").get(10);
    }

    public WebElement getSubAccessoriesForGraphicsTablets() {
        return getElementsByXpath("//div[@class='portal-category-list__item portal-category-list__item-hover']").get(11);
    }
}