package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MoyoPageCategoryApple extends BasePage {
    public MoyoPageCategoryApple(WebDriver driver) {
        super(driver);
    }

    //the first item from "топ товарів"
    public WebElement getTopGoodsFirst() {
        return driver.findElements(By.xpath("//button[@class='buy-btn btn btn--green js-product-modal-close js-buy']")).get(0);
    }
}
