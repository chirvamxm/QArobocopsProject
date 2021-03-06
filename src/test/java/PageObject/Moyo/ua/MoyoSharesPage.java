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
        return getElementByXpath("//img[@alt='Промоналіпка SWEET.TV безкоштовно 3 місяці Кіно']");
    }

    // discount section
    public WebElement getDiscountBtn() {
        return getElementByXpath("//*[@for='types_2']");
    }

    public WebElement getSeasonSaleBtn() {
        return getElementByXpath("/html/body/div[2]/main/div/div[1]/div/div[2]/div[1]/a[4]");
    }

    // raffle section
    public WebElement getRaffleBtn() {
        return getElementByXpath("//*[@for='types_4']");
    }

    public WebElement getRaffle4ConsoleBtn() {
        return getElementByXpath("//img[@alt='Розігруємо 4 ігрові консолі Nintendo']");
    }

    //Installment section
    public WebElement getInstallmentBtn() {
        return getElementByXpath("//*[@for='types_3']");
    }

    public WebElement getCreditSony0Btn() {
        return getElementByXpath("//img[@alt='Кредит 0% до 12 місяців на фото та відеотехніку Sony']");
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
        return getElementByXpath("/html/body/div[2]/main/div/div[1]/div/div[2]/div[1]/a[4]");
    }

    //Electronics Accessories
    public WebElement getShowAllBtn() {
        return getElementByXpath("//div[@data-text-more='Показати всі']");
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

    public WebElement getSaleVacuumCleaner26Btn() {
        return getElementByXpath("//img[@alt='Знижки до 26% на пилососи Philips']");
    }

    //Sport Relax Tourism Category
    public WebElement getSportRelaxTourismBtn() {
        return getElementByXpath("//*[@for='categories_4706']");
    }

    public WebElement getBuySuitcaseGiftWengerBtn() {
        return getElementByXpath("//img[@alt='Купуй валізу та отримай у подарунок рюкзак Wenger']");
    }

    //Tools category
    public WebElement getToolsBtn() {
        return getElementByXpath("//*[@for='categories_4910']");
    }

    public WebElement getWashAll() {
        return getElementByXpath("//*[@alt='Відмиється все']");
    }

    //Children World category
    public WebElement getChildrenWorldBtn() {
        return getElementByXpath("//*[@for='categories_5513']");
    }

    public WebElement getBuyNeonFortniteLootBtn() {
        return getElementByXpath("//img[@alt='Купуй біговел NEON і отримай в подарунок Fortnite Loot Chest, скриню аксесуарів']");
    }
}

