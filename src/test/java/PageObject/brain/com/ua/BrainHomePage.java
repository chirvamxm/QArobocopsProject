package PageObject.brain.com.ua;

import PageObject.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrainHomePage extends BasePage {

    public BrainHomePage(WebDriver driver) {
        super(driver);
    }

    // catalog
    public WebElement getComputers() {
        return driver.findElement(By.xpath("//span[contains(text(),'Ноутбуки')]"));
    }

    public WebElement getAccessories() {
        return driver.findElement(By.xpath("//span[contains(text(),'Комплектуючі')]"));
    }

    public WebElement getSmartphones() {
        return driver.findElement(By.xpath("//span[contains(text(),'Смартфони')]"));
    }

    public WebElement getTVs() {
        return driver.findElement(By.xpath("//span[contains(text(),'Телевізори')]"));
    }

    public WebElement getPrinters() {
        return driver.findElement(By.xpath("//span[contains(text(),'Все для друку')]"));
    }

    public WebElement getNetworkHardware() {
        return driver.findElement(By.xpath("//span[contains(text(),'Мережеве обладнання')]"));
    }

    public WebElement getAcoustics() {
        return driver.findElement(By.xpath("//span[contains(text(),'акустика')]"));
    }


    // common tools
    public WebElement getSearchField() {
        return driver.findElement(By.xpath("//div[@class='header-bottom']//input[@class='quick-search-input']"));
    }

    public WebElement getSearchBtn() {
        return driver.findElement(By.xpath("//input[@value='Знайти']"));
    }

    public WebElement getFirstModel() {
        // xpath фізичного розташування першого товару в DOM
        return driver.findElement(By.xpath("//*[@id='view-grid']/div[1]/div/div[2]/div[1]/a"));
    }

    public WebElement getFirstResult() {
        // xpath фізичного розташування першого товару в результатах пошуку в DOM
        return driver.findElement(By.xpath("//div[3]/div[1]/div/div/div[2]/div/div[2]/div[2]/div/div[1]/div[1]/div[1]/div/div[2]/div[1]/a/img"));
    }
}


