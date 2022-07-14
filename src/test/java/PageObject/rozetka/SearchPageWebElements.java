package PageObject.rozetka;

import PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPageWebElements extends BasePage {

    public SearchPageWebElements(WebDriver driver) {
        super(driver);
    }

    public WebElement getRouterTPLINKArcherC20() {
        return getElementByXpath("//div[@data-goods-id='3970496']");
    }
}
