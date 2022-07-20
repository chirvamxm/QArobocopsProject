package PageObject.glovo;

import PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageWebElements extends BasePage {

    public HomePageWebElements(WebDriver driver) {
        super(driver);
    }

    public static final String SOCIAL_NETWORK_BTN ="//a[@href='%s']";

    public WebElement getSocialNetworkBtn(String currentNetwork){
        return getElementByXpath(String.format(SOCIAL_NETWORK_BTN, currentNetwork));
    }
}
