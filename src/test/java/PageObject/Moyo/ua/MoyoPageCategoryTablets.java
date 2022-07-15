package PageObject.Moyo.ua;

import PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MoyoPageCategoryTablets extends BasePage {
    public MoyoPageCategoryTablets(WebDriver driver) {
        super(driver);
    }

    //the first item from "топ товарів"
    public WebElement getTopGoodsFirst() {
        return getElementsByXpath("//button[@class='buy-btn btn btn--green js-product-modal-close js-buy']").get(0);
    }
}