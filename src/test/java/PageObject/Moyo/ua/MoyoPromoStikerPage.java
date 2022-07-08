package PageObject.Moyo.ua;

import PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MoyoPromoStikerPage extends BasePage {
    public MoyoPromoStikerPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getTimerBtn() {
        return getElementByXpath("//div[@class='actions_time_value js-action-time']");
    }
}
