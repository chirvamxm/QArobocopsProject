package PageObject.brain.com.ua;

import PageObject.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrainOrderPage extends BasePage {

    public BrainOrderPage(WebDriver driver) {
        super(driver);
    }

    // Payment method
    public WebElement privat24() {
        return driver.findElement(By.xpath("//div/label[text()='Приват24']"));
    }

    public WebElement visaMasterCard() {
        return driver.findElement(By.xpath("//div/label[contains(text(),'Visa')]"));
    }

    // Method of production
    public WebElement newPost() {
        return driver.findElement(By.xpath("//div/label[contains(text(),'У відділення Нової Пошти')]"));
    }

    // Recipient data
    public void recipientData(){
        driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Анатолій");
        driver.findElement(By.xpath("//input[@name='Patronymic']")).sendKeys("Євгенович");
        driver.findElement(By.xpath("//input[@name='Surname']")).sendKeys("Бакал");
        driver.findElement(By.xpath("//input[@name='PhoneNumber']")).sendKeys("+380(063)8815-60-86");
        driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("legrand7t@gmail.com");
    }

    // Cancel the purchase
    public void cancelPurchase() {
        driver.findElement(By.xpath("//div[@class='br-cart-item']/button[text()='Видалити']")).click();
        driver.findElement(By.xpath("//button/span[text()='Видалити не зберігаючи']")).click();
    }
    public WebElement cartIsEmpty() {
        return driver.findElement(By.xpath("//div[contains(text(),'Ваш кошик порожній')]"));
    }
}
