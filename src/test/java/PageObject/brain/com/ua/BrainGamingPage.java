package PageObject.brain.com.ua;

import PageObject.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrainGamingPage extends BasePage {

    public BrainGamingPage(WebDriver driver) {
        super(driver);
    }

    private static final String SSD = "//h2[text()='Накопичувачі SSD']";
    private static final String POWER_UNITS = "//h2[text()='Накопичувачі SSD']";

    public WebElement getSSD() {
        return driver.findElement(By.xpath(SSD));
    }

    public WebElement getPowerUnits() {
        return driver.findElement(By.xpath(POWER_UNITS));
    }
}
