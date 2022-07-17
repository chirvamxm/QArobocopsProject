package PageObject.rozetka;

import PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ListOfCitiesWebElements extends BasePage {
    public ListOfCitiesWebElements(WebDriver driver) {
        super(driver);
    }

    public WebElement theCityOfKyiv() {
        return getElementByXpath("//a[@class='header-location__popular-link'] [contains(text(), ' ���')]");
    }

    public WebElement theCityOfKharkiv() {
        return getElementByXpath("//a[@class='header-location__popular-link'] [contains(text(), ' ����� ')]");
    }

    public WebElement theCityOfOdesa() {
        return getElementByXpath("//a[@class='header-location__popular-link'] [contains(text(), '�����')]");
    }

    public WebElement theCityOfDnipro() {
        return getElementByXpath("//a[@class='header-location__popular-link'] [contains(text(), ' ����� ')]");
    }

    public WebElement theCityOfZaporizhzhia() {
        return getElementByXpath("//a[@class='header-location__popular-link'] [contains(text(), ' �������� ')]");
    }

    public WebElement theCityOfLviv() {
        return getElementByXpath("//a[@class='header-location__popular-link'] [contains(text(), ' ���� ')]");
    }
}