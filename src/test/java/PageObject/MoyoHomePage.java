package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MoyoHomePage extends BasePage {
    public MoyoHomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getEnterBtn() {
        return getElementByXpath("//div[@class='header_cabinet_link js-auth-modal-show']");
    }

    public WebElement getRegisteredBtn() {
        return getElementByXpath("//div[@data-tab='reg']");
    }

    public WebElement getNameSearchBtn() {
        return getElementByXpath("//input[@name='firstname']");
    }

    public WebElement getPhoneSearchBtn() {
        return getElementByXpath("//input[@name='phone']");
    }

    public WebElement getEmailSearchBtn() {
        return getElementByXpath("//input[@type='email']");
    }

    public WebElement getAgreeWithRegBtn() {
        return driver.findElement(By.cssSelector("#agree_with_reg"));
    }

    public WebElement getRegisterBtn() {
        return getElementByXpath("//button[@class='btn js-auth-form-submit']");
    }
}
