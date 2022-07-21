package PageObject.brain.com.ua;

import PageObject.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BrainOrderPage extends BasePage {

    public BrainOrderPage(WebDriver driver) {
        super(driver);
    }

    private static final String BY_COURIER = "//div/label/span[contains(text(),'за адресою')]";
    private static final String ADDRESS_STREET = "//input[@name='Street']";
    private static final String ADDRESS_HOUSE = "//input[@name='House']";
    private static final String DELIVERY_TIME = "//div[@class='br-fc-dt br-fc-check delivery_time_wrapper']/select";

    // Payment method
    public WebElement privat24() {
        return driver.findElement(By.xpath("//div/label[text()='Приват24']"));
    }

    public WebElement visaMasterCard() {
        return driver.findElement(By.xpath("//div/label[contains(text(),'Visa')]"));
    }

    // Method of production
    public WebElement newPost() {
        return driver.findElement(By.xpath("//div/label[@for='br-dt2']"));
    }

    public WebElement byCourier() {
        return driver.findElement(By.xpath(BY_COURIER));
    }

    public void address() {
        driver.findElement(By.xpath(ADDRESS_STREET)).sendKeys("Шевченко");
        driver.findElement(By.xpath(ADDRESS_HOUSE)).sendKeys("13");
    }

    public void getDeliveryTime() {
        Select deliveryTime = new Select(driver.findElement(By.xpath(DELIVERY_TIME)));
        deliveryTime.selectByValue("1");
    }

    // Recipient data
    public void recipientData() {
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
