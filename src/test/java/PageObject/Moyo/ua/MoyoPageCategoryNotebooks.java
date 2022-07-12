package PageObject.Moyo.ua;

import PageObject.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MoyoPageCategoryNotebooks extends BasePage {
    public MoyoPageCategoryNotebooks(WebDriver driver) {
        super(driver);
    }
    public WebElement getTopGoodsFirst() {
        return driver.findElements(By.xpath("//button[@class='buy-btn btn btn--green js-product-modal-close js-buy']")).get(0);
    }
}
