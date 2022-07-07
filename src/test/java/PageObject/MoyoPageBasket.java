package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MoyoPageBasket extends BasePage {
    public MoyoPageBasket(WebDriver driver) {
        super(driver);
    }

    //button "купити зараз"
    public WebElement getBuyBtn() {
        return driver.findElement(By.xpath("//button[@class='rds-btn']"));
    }
}
