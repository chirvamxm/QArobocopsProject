package PageObject.Moyo.ua;

import PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MoyoPageOrder extends BasePage {
    public MoyoPageOrder(WebDriver driver) {
        super(driver);
    }

    //button "продовжити"
    public WebElement getBtnNext() {
        return getElementsByXpath("//button[@class='rds-btn']").get(0);
    }

    //button "я новий покупець"
    public WebElement getBtnNewBuyer() {
        return getElementByXpath("//div[@class='form-change active sc-hSdWYo cxkikm']");
    }

    //field "імя"
    public WebElement getFieldFirstName() {
        return getElementByXpath("//input[@name='firstname']");
    }

    //field по-батькові
    public WebElement getFieldMiddleName() {
        return getElementByXpath("//input[@name='middlename']");
    }

    //field "прізвище"
    public WebElement getFieldLastname() {
        return getElementByXpath("//input[@name='lastname']");
    }

    //field "номер телефону"
    public WebElement getFieldPhone() {
        return getElementByXpath("//input[@name='phone']");
    }

    //field "емейл"
    public WebElement getFieldEmail() {
        return getElementByXpath("//input[@name='email']");
    }

    //button "місто"
    public WebElement getBtnCity() {
        return getElementByXpath("//span[@class='form-change__link']");
    }

    //button "З магазину мережі MOYO"
    public WebElement getBtnMagazine() {
        return getElementsByXpath("//div[@class='delivery-inner-heading']").get(0);
    }

    //field "Введіть назву населеного пункту"
    public WebElement getFieldCity() {
        return getElementByXpath("//input[@name='searchTAQueryString']");
    }

    //field "Введіть назву населеного пункту" first item on list
    public WebElement getFieldCityFirstItem() {
        return getElementsByXpath("//span[@class='title-text']").get(0);
    }

    //button "Оплата при отриманні"
    public WebElement getBtnPaymentInMagazine() {
        return getElementByXpath("//li[@id='payment-method-paymentCash']");
    }

    //button cancel goods in order
    public WebElement getBtnOrderCancel() {
        return getElementsByXpath("//div[@class='remove-close']").get(0);
    }
}


