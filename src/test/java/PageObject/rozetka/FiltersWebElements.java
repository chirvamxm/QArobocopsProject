package PageObject.rozetka;

import PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FiltersWebElements extends BasePage {

    public FiltersWebElements(WebDriver driver) {
        super(driver);
    }

    //PRICE FILTERS

    public WebElement getMinPriceField() {
        return getElementByXpath("//input[@formcontrolname='min']");
    }

    public WebElement getMaxPriceField() {
        return getElementByXpath("//input[@formcontrolname='max']");
    }

    public WebElement getSubmitPriceBtn() {
        return getElementByXpath("//button[@type='submit']");
    }

    public List<WebElement> getPriceList() {
        return getElementsByXpath("//span[@class='goods-tile__price-value']");
    }

    //LOCK FILTERS

    public WebElement getElectronicCodeBtn() {
        return getElementByXpath("//a[@data-id='Електронний кодовий']");
    }

    //WEIGHT FILTERS

    public WebElement getWeightUnder60kgBtn() {
        return getElementByXpath("//a[@data-id='Понад 60']");
    }

    //BRANDS FILTERS

    public WebElement getToshibaBtn() {
        return getElementByXpath("//a[@data-id='Toshiba']");
    }

    //WATER HEATING FILTERS

    public WebElement getWaterHeatingBtn() {
        return getElementByXpath("//a[@data-id='Підігрів води']");
    }
}
