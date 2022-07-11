package PageObject.Moyo.ua;

import PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MoyoTradePage extends BasePage {

    public MoyoTradePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getTypeDeviceBtn() {
        return getElementByXpath("//input[@id='mui-1']");
    }

    public WebElement getSmartphoneBtn() {
        return getElementByXpath("//div[@id='react-select-2-option-4']");
    }

    public WebElement getManufacturerBtn() {
        return getElementByXpath("//input[@id='mui-2']");
    }

    public WebElement getAppleBtn() {
        return getElementByXpath("//*[contains(text(), 'Apple')]");
    }

    public WebElement getModelDevice() {
        return getElementByXpath("//input[@name='product_id']");
    }

    public WebElement getIphone11gb128() {
        return getElementByXpath("//*[contains(text(), 'Apple iPhone 11 128Gb')]");
    }

    public List<WebElement> getDeviceSwitchOnClickBtnNo() {
        return getElementsByXpath("//span[@class='jss27']");
    }

    public List<WebElement> getScreenNoScratchBtn() {
        return getElementsByXpath("//div[@class='jss22']");
    }

    public WebElement getFrameNoScratchBtn() {
        return getElementByXpath("//img[@src='https://www.moyo.ua/images/tradeIn/smartphone/body/smartfon_2.png']");
    }

    public WebElement showPriseTabla() {
        return getElementByXpath("//*[text()='2900']");
    }
}



