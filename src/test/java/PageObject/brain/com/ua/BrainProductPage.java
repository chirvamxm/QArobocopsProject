package PageObject.brain.com.ua;

import PageObject.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrainProductPage extends BasePage {

    public BrainProductPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getBuyBtn() {
        return driver.findElement(By.xpath("//a[@class='add btn-add-green']"));
    }

    public WebElement getCheckOut() {
        return driver.findElement(By.xpath("//*[@id='checkout-modal-popup']/div/div[1]/div/div[2]/div/div[5]/button"));
    }   //по-іншому не можу взяти локатор
}
