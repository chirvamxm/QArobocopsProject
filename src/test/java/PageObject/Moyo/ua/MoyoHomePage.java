package PageObject.Moyo.ua;

import PageObject.BasePage;
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

    public WebElement getMoyoTradeBtn() {
        return getElementByXpath("//li[@class='header_nav_item js-exchange-switch-color']");
    }

    public WebElement getSearchPhoneOrEmailBtn() {
        return getElementByXpath("//input[@placeholder='Телефон или email']");
    }

    public WebElement getDropBoxEnterBtn() {
        return getElementByXpath("//button[@class='btn js-auth-form-submit']");
    }

    public WebElement getSearchFieldBtn() {
        return getElementByXpath("//input[@id='search-input']");
    }

    public List<WebElement> getComparesBtn() {
        return getElementsByXpath("//div[@data-async='L3Byb2R1Y3RzL2NvbXBhcmUv']");
    }
}
