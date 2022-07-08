package PageObject.Moyo.ua;

import PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MoyoSharesPage extends BasePage {
    public MoyoSharesPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getGiftBtn() {
        return getElementByXpath("//*[@for='types_1']");
    }

    // gift section
    public WebElement getPromoStikerSweetTVBtn() {
        return getElementByXpath("//img[@src='//img.moyo.ua/img/actions/1752/77_387x255_1653320721.jpg']");
    }
}
