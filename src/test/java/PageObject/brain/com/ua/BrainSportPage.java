package PageObject.brain.com.ua;

import PageObject.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrainSportPage extends BasePage {

    public BrainSportPage(WebDriver driver) {
        super(driver);
    }

    private static final String BICYCLES = "//div[@class='br-category-block-list']/ul/li/a[contains(text(),'Велосипеди')]";

    public WebElement getBicycles() {
        return driver.findElement(By.xpath(BICYCLES));
    }
}
