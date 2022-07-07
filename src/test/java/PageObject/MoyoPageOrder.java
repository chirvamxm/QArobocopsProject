package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.nio.channels.WritableByteChannel;

public class MoyoPageOrder extends BasePage {
    public MoyoPageOrder(WebDriver driver) {
        super(driver);
    }

    //button "продовжити"
    public WebElement getBtnNext() {
        return driver.findElements(By.xpath("//button[@class='rds-btn']")).get(0);
    }

    //button "я новий покупець"
    public WebElement getBtnNewBuyer() {
        return driver.findElement(By.xpath("//div[@class='form-change active sc-hSdWYo cxkikm']"));
    }

    //field "імя"
    public WebElement getFieldFirstName() {
        return driver.findElement(By.xpath("//input[@name='firstname']"));
    }

    //field по-батькові
    public WebElement getFieldMiddleName() {
        return driver.findElement(By.xpath("//input[@name='middlename']"));
    }

    //field "прізвище"
    public WebElement getFieldLastname() {
        return driver.findElement(By.xpath("//input[@name='lastname']"));
    }

    //field "номер телефону"
    public WebElement getFieldPhone() {
        return driver.findElement(By.xpath("//input[@name='phone']"));
    }

    //field "емейл"
    public WebElement getFieldEmail() {
        return driver.findElement(By.xpath("//input[@name='email']"));
    }

    //button "місто"
    public WebElement getBtnCity() {
        return driver.findElement(By.xpath("//span[@class='form-change__link']"));
    }

    //field "адреса магазину"
    public WebElement getFieldMagazineAddress() {
        return driver.findElement(By.xpath("//input[@name='activeChoosedItemTitle']"));
    }

    //button "З магазину мережі MOYO"
    public WebElement getBtnMagazine() {
        return driver.findElement(By.xpath("//input[@id='toShop']"));
    }

    //field "Введіть назву населеного пункту"
    public WebElement getFieldCity() {
        return driver.findElement(By.xpath("//input[@name='searchTAQueryString']"));
    }

    //field "Введіть назву населеного пункту" first item on list
    public WebElement getFieldCityFirstItem() {
        return driver.findElements(By.xpath("//span[@class='title-text']")).get(0);
    }

    //button "Оплата при отриманні"
    public WebElement getBtnPaymentInMagazine() {
        return driver.findElement(By.xpath("//input[@name='paymentCash']"));
    }

    //button cancel goods in order
    public WebElement getBtnOrderCancel() {
        return driver.findElements(By.xpath("//div[@class='remove-close']")).get(0);
    }
}


