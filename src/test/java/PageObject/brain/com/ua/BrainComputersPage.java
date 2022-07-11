package PageObject.brain.com.ua;

import PageObject.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrainComputersPage extends BasePage {

    public BrainComputersPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getNoteBook() {
        return driver.findElement(By.xpath("//div/h2[text()='Ноутбуки']"));
    }
    public WebElement getDesktop() {
        return driver.findElement(By.xpath("//h2[text()=\"Комп'ютери\"]"));
    }
    public WebElement getMonitors() {
        return driver.findElement(By.xpath("//h2[text()='Монітори та аксесуари']"));
    }
    public WebElement getSubcategory() {
        return driver.findElement(By.xpath("//h2[text()='Монітори']"));
    }
}
