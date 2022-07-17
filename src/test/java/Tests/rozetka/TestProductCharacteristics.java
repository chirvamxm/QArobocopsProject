package Tests.rozetka;

import PageObject.rozetka.BooksPageWebElements;
import PageObject.rozetka.HomePageWebElements;
import PageObject.rozetka.ItemsPageWebElements;
import PageObject.rozetka.SportAndHobbiesElements;
import Tests.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestProductCharacteristics extends TestInit {
    @Test
    public void productCharacteristics() {
        HomePageWebElements homePageWebElements = new HomePageWebElements(driver);
        SportAndHobbiesElements sportAndHobbiesElements = new SportAndHobbiesElements(driver);
        ItemsPageWebElements itemsPageWebElements = new ItemsPageWebElements(driver);

        goToSite("https://rozetka.com.ua/ua/");
        homePageWebElements.getCatalogueBtn().click();
        homePageWebElements.getMenuCategorySportsAndHobbies().click();
        sportAndHobbiesElements.getSportAndHobbies().click();
        sleep(2);
        sportAndHobbiesElements.getAnyScooter().click();
        sleep(2);
        itemsPageWebElements.characteristicsTab().click();
        sleep(2);
        Assert.assertTrue(itemsPageWebElements.assertCharacteristics().isDisplayed());
    }
}
