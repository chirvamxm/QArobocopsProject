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

    public WebElement getSeasonSaleBtn() {
        return getElementByXpath("//img[@src='//img.moyo.ua/img/actions/1752/81_387x255_1653987137.jpg']");
    }

    // raffle section
    public WebElement getRaffleBtn() {
        return getElementByXpath("//*[@for='types_4']");
    }

    public WebElement getRaffle4ConsoleBtn() {
        return getElementByXpath("//img[@src='//img.moyo.ua/img/actions/1753/54_387x255_1657282506.jpg']");
    }

    //Installment section
    public WebElement getInstallmentBtn() {
        return getElementByXpath("//*[@for='types_3']");
    }

    public WebElement getCreditSony0Btn() {
        return getElementByXpath("//img[@src='//img.moyo.ua/img/actions/1753/28_387x255_1655995696.jpg']");
    }

    //SmartPhone category
    public WebElement getSmartPhoneAndMobilePhoneBtn() {
        return getElementByXpath("//*[@for='categories_2853']");
    }

    public WebElement getImgTradeSmartPhoneBtn() {
        return getElementByXpath("//img[@alt='Смарт обмін для ваших смартфонів']");
    }

    //GameZone category
    public WebElement getGameZoneBtn() {
        return getElementByXpath("//*[@for='categories_2914']");
    }

    public WebElement getSale55OnTheChildrenToysBtn() {
        return getElementByXpath("//img[@alt='Знижки до 55% на іграшки та дитячі товари']");
    }

    //SmartGadget category
    public WebElement getSmartGadgetBtn() {
        return getElementByXpath("//*[@for='categories_2915']");
    }

    public WebElement getSmartTradeForWatchBtn() {
        return getElementByXpath("//img[@alt='Смарт обмін для вашого смарт-годинника']");
    }

    //TVPhoneVideoAudio category
    public WebElement getTVPhoneVideoAudioBtn() {
        return getElementByXpath("//*[@for='categories_2981']");
    }

    public WebElement getSmartTradeTVBtn() {
        return getElementByXpath("//img[@alt='Смарт обмін для ваших телевізорів']");
    }

    //ComputerHardware category
    public WebElement getComputerHardwareBtn() {
        return getElementByXpath("//*[@for='categories_3309']");
    }

    public WebElement getRestoreBuild2000() {
        return getElementByXpath("//img[@alt='Рідні стіни, рідним людям. 2000 грн. від покупки віддаємо на відновлення будинків.']");
    }

    //Electronics Accessories
    public WebElement getShowAllBtn() {
        return getElementByXpath("//div[@data-text-more='Показать все']");
    }

    public WebElement getAccessoriesElectronicsBtn() {
        return getElementByXpath("//*[@for='categories_3325']");
    }

    public WebElement getKeySteamBtn() {
        return getElementByXpath("//img[@alt='Отримай ключ гаманця STEAM на 15€ при покупці обраних ігрових клавіатур MSI']");
    }

    //Tablets and E books category
    public WebElement getTabletsAndEBooksBtn() {
        return getElementByXpath("//*[@for='categories_3562']");
    }

    public WebElement getSweetTVTabletsBtn() {
        return getElementByXpath("//img[@alt='Sweet.tv у подарунок до планшетів Blackview']");
    }

    //Appliances category
    public WebElement getAppliancesBtn() {
        return getElementByXpath("//*[@for='categories_4439']");
    }

    public WebElement getSaleVacuumCleaner26() {
        return getElementByXpath("//img[@alt='Знижки до 26% на пилососи Philips']");
    }
}

