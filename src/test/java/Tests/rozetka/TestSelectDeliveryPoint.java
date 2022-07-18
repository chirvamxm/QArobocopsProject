package Tests.rozetka;

import PageObject.rozetka.HomePageWebElements;
import PageObject.rozetka.ItemsPageWebElements;
import PageObject.rozetka.ShopsOnTheMapElements;
import PageObject.rozetka.SportAndHobbiesElements;
import Tests.TestInit;
import org.testng.annotations.Test;

public class TestSelectDeliveryPoint extends TestInit {

    @Test
    public void selectDeliveryPoint() {

        HomePageWebElements homePageWebElements = new HomePageWebElements(driver);
        SportAndHobbiesElements sportAndHobbiesElements = new SportAndHobbiesElements(driver);
        ItemsPageWebElements itemsPageWebElements = new ItemsPageWebElements(driver);
        ShopsOnTheMapElements shopsOnTheMapElements = new ShopsOnTheMapElements(driver);

        goToSite("https://rozetka.com.ua/ua/");
        sleep(2);
        homePageWebElements.getCatalogueBtn().click();
        homePageWebElements.getMenuCategorySportsAndHobbies().click();
        sportAndHobbiesElements.getSportAndHobbies().click();
        sleep(4);
        sportAndHobbiesElements.getAnyScooter().click();
        sleep(5);
        itemsPageWebElements.shopsOnTheMap().click();
        sleep(2);
        shopsOnTheMapElements.stepanBanderaAvenue6().click();
    }
}