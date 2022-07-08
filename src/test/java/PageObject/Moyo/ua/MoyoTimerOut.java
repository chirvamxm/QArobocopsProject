package PageObject.Moyo.ua;

import PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MoyoTimerOut extends BasePage {
    public MoyoTimerOut(WebDriver driver) {
        super(driver);
    }

    public WebElement getTimerBtn() {
        return getElementByXpath("//div[@class='actions_time_value js-action-time']");
    }
}
