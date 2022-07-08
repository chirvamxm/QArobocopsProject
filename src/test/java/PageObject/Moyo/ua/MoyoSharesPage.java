package PageObject.Moyo.ua;

import PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MoyoSharesPage extends BasePage {
    public MoyoSharesPage(WebDriver driver) {
        super(driver);
    }

    // gift section
    public WebElement getGiftBtn() {
        return getElementByXpath("//*[@for='types_1']");
    }

    public WebElement getPromoStikerSweetTVBtn() {
        return getElementByXpath("//img[@src='//img.moyo.ua/img/actions/1752/77_387x255_1653320721.jpg']");
    }

    // discount section
    public WebElement getDiscountBtn() {
        return getElementByXpath("//*[@for='types_2']");
    }

    public WebElement getSeasonSale() {
        return getElementByXpath("//img[@src='//img.moyo.ua/img/actions/1752/81_387x255_1653987137.jpg']");
    }

    // raffle section
    public WebElement getRaffleBtn() {
        return getElementByXpath("//*[@for='types_4']");
    }

    public WebElement getRaffle4Console() {
        return getElementByXpath("//img[@src='//img.moyo.ua/img/actions/1753/54_387x255_1657282506.jpg']");
    }
}
