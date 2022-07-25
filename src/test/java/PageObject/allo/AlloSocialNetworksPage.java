package PageObject.allo;

import PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlloSocialNetworksPage extends BasePage {
    public AlloSocialNetworksPage(WebDriver driver) {
        super(driver);
    }

    private static final String ALLO_TITLE_ON_PLAY_MARKET = "//h1[@itemprop='name']";

    public WebElement getAlloTitleOnPlayMarket() {
        return getElementByXpath(ALLO_TITLE_ON_PLAY_MARKET);
    }
}
