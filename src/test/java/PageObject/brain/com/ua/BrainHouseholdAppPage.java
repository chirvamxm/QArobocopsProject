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
    private static final String VACUUM_CLEANERS = "//div[@class='br-category-block-list']/ul/li/a[contains(text(),'Пилососи')]";

    public WebElement getBlenders() {
        return driver.findElement(By.xpath(BLENDERS));
    }

    public WebElement getVacuumCleaners() {
        return driver.findElement(By.xpath(VACUUM_CLEANERS));
    }
}
