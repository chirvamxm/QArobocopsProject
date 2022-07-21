package PageObject.dominos;

import PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageGuru extends BasePage {
    public PageGuru(WebDriver driver) {
        super(driver);
    }
    public WebElement DearAs() {
        return getElementByXpath("//*[contains(text(),'Dear')]");
    }
}
