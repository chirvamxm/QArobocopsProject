package Tests.rozetka;

import PageObject.rozetka.HomePageWebElements;
import PageObject.rozetka.ItemsPageWebElements;
import PageObject.rozetka.SportAndHobbiesElements;
import Tests.TestInit;
import org.testng.annotations.Test;

public class TestCheckTheSeller extends TestInit {

    @Test
    public void checkTheSeller() {
        HomePageWebElements homePageWebElements = new HomePageWebElements(driver);
        SportAndHobbiesElements sportAndHobbiesElements = new SportAndHobbiesElements(driver);
        ItemsPageWebElements itemsPageWebElements = new ItemsPageWebElements(driver);

        goToSite("https://rozetka.com.ua/ua/");
        sleep(2);
        homePageWebElements.getCatalogueBtn().click();
        homePageWebElements.getMenuCategorySportsAndHobbies().click();
        sportAndHobbiesElements.getSportAndHobbies().click();
        sleep(4);
        sportAndHobbiesElements.getAnyScooter().click();
        sleep(2);
        if (!itemsPageWebElements.sellerRosetka().isDisplayed()) {
            System.out.println("another seller");
        }
    }
}


