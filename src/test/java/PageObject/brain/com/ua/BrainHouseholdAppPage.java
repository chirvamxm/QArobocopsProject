package PageObject.brain.com.ua;

import PageObject.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrainHouseholdAppPage extends BasePage {
    public BrainHouseholdAppPage(WebDriver driver) {
        super(driver);
    }

    private static final String BLENDERS = "//div[@class='br-category-block-list']/ul/li/a[contains(text(),'Блендери')]";

    public WebElement getBlenders() {
        return driver.findElement(By.xpath(BLENDERS));
    }
}
