package PageObject.rozetka;

import PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ItemsPageWebElements extends BasePage {

    public ItemsPageWebElements(WebDriver driver) {
        super(driver);
    }

    public WebElement getAddToCartBtn() {
        return getElementByXpath("//li[@class='product-buttons__item ng-star-inserted']");
    }

    public WebElement getToMySelectedGoods() {
        return getElementByXpath("//button[@class='buy-button buy-button_state_in-cart button button--with-icon button--green button--medium ng-star-inserted']");
    }

    public WebElement getAddToComparisonBtn() {
        return getElementByXpath("//button[@class='compare-button ng-star-inserted']");
    }

    public List<WebElement> getToComparisonListBtn() {
        return getElementsByXpath("//a[@class='comparison-modal__link']");
    }

    public WebElement alertMessageNotEnoughItemsToCompare() {
        return getElementByXpath("//div[text()=' Недостатньо товарів для порівняння ']");
    }

    public WebElement displayed2ItemsInCompare() {
        return getElementByXpath("//ul[@class='products-grid']");
    }

    // Product information tabs
    public WebElement characteristicsTab() {
        return getElementByXpath("//a[@class='tabs__link'] [contains(text(), ' Характеристики ')]");
    }

    public WebElement assertCharacteristics() {
        return getElementByCssSelector("characteristics tab");
    }

    public WebElement productReviewsTab() {
        return getElementByXpath("//a[@class='tabs__link'] [@href='https://rozetka.com.ua/ua/street_scooter_s2_10400_gray/p303475548/comments/']");
    }

    public WebElement assertProductReviews() {
        return getElementByXpath("//button[@class='button button--medium button--gray']");
    }

    public WebElement productPhotoTab() {
        return getElementByXpath("//a[@class='tabs__link'] [@href='https://rozetka.com.ua/ua/street_scooter_s2_10400_gray/p303475548/photo/']");
    }

    public WebElement assertProductPhoto() {
        return getElementByXpath("//li[@class='product-photos__item ng-star-inserted']");
    }

    public WebElement productAskQuestion() {
        return getElementByXpath("//a[@class='tabs__link tabs__link--active'] [@href='https://rozetka.com.ua/ua/schott_zwiesel_118538/p13028855/questions/']");
    }

    public WebElement assertProductAskQuestion() {
        return getElementByXpath("//a[@class='tabs__link tabs__link--active'] [@href='https://rozetka.com.ua/ua/schott_zwiesel_118538/p13028855/questions/']");
    }

    public WebElement productVideoTab() {
        return getElementByXpath("//a[@class='tabs__link tabs__link--active']");
    }

    public WebElement assertProductVideo() {
        return getElementByXpath("//source[@type='video/mp4']");
    }

    public WebElement buyTogether() {
        return getElementByXpath("//h4[@class='product-tabs__heading']");
    }

    public WebElement getPrivatBank() {
        return getElementByXpath("//button[@class='product-pictogram__button ng-star-inserted']");
    }

    public WebElement getPrivatBankToIssue() {
        return getElementByXpath("//button[@class='button button--green button--medium credit-modal__buy']");
    }

    // the inscription "in stock" when choosing a product
    public WebElement IsAvailable() {
        return getElementByXpath("//p[@class='status-label status-label--green ng-star-inserted']");
    }

    public WebElement getBuyToCreditBtn() {
        return getElementByXpath("//button[@class='button button--medium button--navy ng-star-inserted']");
    }

    public WebElement creditOptions() {
        return getElementByXpath("//button[@id='creditSubmitButton']");
    }

    public WebElement productTitle() {
        return getElementByXpath("//h1[@class='product__title']");
    }

    //BUILT-IN SAFES ITEMS

    public WebElement getBuiltInSafeGriffonWL5028E() {
        return getElementByXpath("//div[@data-goods-id='111415658']");
    }

    //LOCK CHARACTERISTIC VALUE

    public WebElement electronicCodeLockType() {
        return getElementByXpath("//a[@href='/ua/vstraivaemie-seyfi/c4656126/56107=148142/']");
    }

    //METAL CABINETS ITEMS

    public WebElement getCabinetsForArchivesUHLMASH10() {
        return getElementByXpath("//div[@data-goods-id='3296050']");
    }

    //WEIGHT CHARACTERISTIC VALUE

    public WebElement itemsWeightCharacteristic() {
        return getElementByXpath("//a[@href='/ua/shkafy-arhivnye/c288990/ves-kg-209395=2557567/']");
    }

    //LABELS PRINTERS ITEMS

    public WebElement getTermoPrinterToshibaBEX4T1GS12() {
        return getElementByXpath("//div[@data-goods-id='339465373']");
    }

    //HIGH PRESSURE CLEANERS ITEMS

    public WebElement getHighPressureCleanerForAutoCBK() {
        return getElementByXpath("//div[@data-goods-id='344618833']");
    }

    public WebElement waterHeatingCharacteristic() {
        return getElementByXpath("//a[@href='/ua/cleaners/c155534/23995=1/']");
    }

    //BOXES ITEMS

    public WebElement box21l60x40x15М10ЕКОILPE() {
        return getElementByXpath("//div[@data-goods-id='270012006']");
    }

    public WebElement materialCharacteristic() {
        return getElementByXpath("//a[@href='/ua/yashchiki/c4641728/material148176=plastik/']");
    }

    public WebElement heightCharacteristic() {
        return getElementByXpath("//a[@href='/ua/yashchiki/c4641728/visota172230=150-mm/']");
    }
}
