package PageObject.dominos;

import PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CartHomePage extends BasePage {
    public CartHomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getDeleteProductBtn() {
        return getElementByXpath("//div[@class='order-card-item__close']");
    }

    public WebElement getEmptyCartBtn() {
        return getElementByXpath("//span[@class='cc-order__footer-content-sum']");
    }
    public WebElement getSearchFieldPhone() {
        return getElementByXpath("//input[@class='input className']");
    }
    public List<WebElement> getDataDelivery() {
        return getElementsByXpath("//div[@class=' css-xr6k05-control']");
    }
    public WebElement getNumberPhone() {
        return getElementByXpath("//li[@class='PhoneInput__DropDownItem-sc-16i3xv8-2 qtedi']");
    }
    public WebElement getTodayBtn() {
        return getElementByXpath("//div[@id='react-select-2-option-1']");
    }
    public WebElement getYesBtn() {
        return getElementByXpath("//button[@class='dp-btn red']");
    }
}
