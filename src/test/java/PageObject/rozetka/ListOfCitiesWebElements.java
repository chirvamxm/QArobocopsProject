package PageObject.rozetka;

import PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ListOfCitiesWebElements extends BasePage {
    public ListOfCitiesWebElements(WebDriver driver) {
        super(driver);
    }

    public WebElement theCityOfKyiv() {
        return getElementByXpath("//a[@class='header-location__popular-link'] [contains(text(), ' Êè¿â')]");
    }

    public WebElement theCityOfKharkiv() {
        return getElementByXpath("//a[@class='header-location__popular-link'] [contains(text(), ' Õàðê³â ')]");
    }

    public WebElement theCityOfOdesa() {
        return getElementByXpath("//a[@class='header-location__popular-link'] [contains(text(), 'Îäåñà')]");
    }

    public WebElement theCityOfDnipro() {
        return getElementByXpath("//a[@class='header-location__popular-link'] [contains(text(), ' Äí³ïðî ')]");
    }

    public WebElement theCityOfZaporizhzhia() {
        return getElementByXpath("//a[@class='header-location__popular-link'] [contains(text(), ' Çàïîð³ææÿ ')]");
    }

    public WebElement theCityOfLviv() {
        return getElementByXpath("//a[@class='header-location__popular-link'] [contains(text(), ' Ëüâ³â ')]");
    }
}