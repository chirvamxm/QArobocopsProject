package Tests.rozetka;

import PageObject.rozetka.HomePageWebElements;
import PageObject.rozetka.ListOfCitiesWebElements;
import PageObject.rozetka.MenuWebElements;
import Tests.TestInit;
import org.testng.annotations.Test;

public class TestAddressSelection extends TestInit {

    @Test
    public void AddressSelection() {
        HomePageWebElements homePageWebElements = new HomePageWebElements(driver);
        MenuWebElements menuWebElements = new MenuWebElements(driver);
        ListOfCitiesWebElements listOfCitiesWebElements = new ListOfCitiesWebElements(driver);

        goToSite("https://rozetka.com.ua/ua/");
        homePageWebElements.getMenuBtn().click();
        menuWebElements.chooseACity().click();
        sleep(3);
        listOfCitiesWebElements.theCityOfKyiv().click();
        sleep(3);
        listOfCitiesWebElements.theCityOfKharkiv().click();
        sleep(3);
        listOfCitiesWebElements.theCityOfOdesa().click();
        sleep(3);
        listOfCitiesWebElements.theCityOfDnipro().click();
        sleep(3);
        listOfCitiesWebElements.theCityOfZaporizhzhia().click();
        sleep(3);
        listOfCitiesWebElements.theCityOfLviv().click();
    }
}
