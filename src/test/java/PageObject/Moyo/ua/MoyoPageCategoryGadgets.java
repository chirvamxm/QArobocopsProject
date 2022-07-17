package PageObject.Moyo.ua;

import PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MoyoPageCategoryGadgets extends BasePage {
    public MoyoPageCategoryGadgets(WebDriver driver) {
        super(driver);
    }

    public WebElement getTopGoodsFirst() {
        return getElementsByXpath("//button[@class='buy-btn btn btn--green js-product-modal-close js-buy']").get(0);
    }

    public WebElement getSubSmartWatch() {
        return getElementsByXpath("//div[@class='portal-category-list__item portal-category-list__item-hover']").get(0);
    }

    public WebElement getSubFitnessBracelets() {
        return getElementsByXpath("//div[@class='portal-category-list__item portal-category-list__item-hover']").get(1);
    }

    public WebElement getSubPhoneStraps() {
        return getElementsByXpath("//div[@class='portal-category-list__item portal-category-list__item-hover']").get(2);
    }

    public WebElement getSubAircraft() {
        return getElementsByXpath("//div[@class='portal-category-list__item portal-category-list__item-hover']").get(3);
    }

    public WebElement getSubRobots() {
        return getElementsByXpath("//div[@class='portal-category-list__item portal-category-list__item-hover']").get(4);
    }

    public WebElement getSubSmartHome() {
        return getElementsByXpath("//div[@class='portal-category-list__item portal-category-list__item-hover']").get(5);
    }

    public WebElement getSubManualStedykams() {
        return getElementsByXpath("//div[@class='portal-category-list__item portal-category-list__item-hover']").get(6);
    }

    public WebElement getSubManual3DPrint() {
        return getElementsByXpath("//div[@class='portal-category-list__item portal-category-list__item-hover']").get(7);
    }

    public WebElement getSubElectricTransport() {
        return getElementsByXpath("//div[@class='portal-category-list__item portal-category-list__item-hover']").get(8);
    }

    public WebElement getSubVRGlasses() {
        return getElementsByXpath("//div[@class='portal-category-list__item portal-category-list__item-hover']").get(9);
    }
}
