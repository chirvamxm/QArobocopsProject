package PageObject.Moyo.ua;

import PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MoyoPageCategoryInstruments extends BasePage {
    public MoyoPageCategoryInstruments(WebDriver driver) {
        super(driver);
    }

    public WebElement getTopGoodsFirst() {
        return getElementsByXpath("//button[@class='buy-btn btn btn--green js-product-modal-close js-buy']").get(0);
    }

    public WebElement getSubPowerTools() {
        return getElementsByXpath("//div[@class='portal-category-list__item portal-category-list__item-hover']").get(0);
    }

    public WebElement getSubGardenEquipment() {
        return getElementsByXpath("//div[@class='portal-category-list__item portal-category-list__item-hover']").get(1);
    }

    public WebElement getSubMeasuringInstrument() {
        return getElementsByXpath("//div[@class='portal-category-list__item portal-category-list__item-hover']").get(2);
    }

    public WebElement getSubStationaryEquipment() {
        return getElementsByXpath("//div[@class='portal-category-list__item portal-category-list__item-hover']").get(3);
    }

    public WebElement getSubHandTools() {
        return getElementsByXpath("//div[@class='portal-category-list__item portal-category-list__item-hover']").get(4);
    }

    public WebElement getSubIrrigationEquipment() {
        return getElementsByXpath("//div[@class='portal-category-list__item portal-category-list__item-hover']").get(5);
    }

    public WebElement getSubProtectiveEquipment() {
        return getElementsByXpath("//div[@class='portal-category-list__item portal-category-list__item-hover']").get(6);
    }

    public WebElement getSubSupplies() {
        return getElementsByXpath("//div[@class='portal-category-list__item portal-category-list__item-hover']").get(7);
    }

    public WebElement getSubPneumaticTool() {
        return getElementsByXpath("//div[@class='portal-category-list__item portal-category-list__item-hover']").get(8);
    }
}