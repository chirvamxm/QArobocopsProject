package Tests.rozetka;

import PageObject.rozetka.HomePageWebElements;
import PageObject.rozetka.HouseholdAppliancesWebElements;
import PageObject.rozetka.ItemsPageWebElements;
import Tests.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestProductVideo extends TestInit {

    @Test
    public void productVideo() {
        HomePageWebElements homePageWebElements = new HomePageWebElements(driver);
        HouseholdAppliancesWebElements householdAppliancesWebElements = new HouseholdAppliancesWebElements(driver);
        ItemsPageWebElements itemsPageWebElements = new ItemsPageWebElements(driver);

        goToSite("https://rozetka.com.ua/ua/");
        homePageWebElements.getCatalogueBtn().click();
        sleep(2);
        homePageWebElements.getMenuCategoryHouseholdAppliances().click();
        sleep(3);
        householdAppliancesWebElements.getRefrigeratorsBtn().click();
        sleep(3);
        householdAppliancesWebElements.getAnyRefrigerator().click();
        sleep(3);
        itemsPageWebElements.productVideoTab().click();
        Assert.assertTrue(itemsPageWebElements.assertProductVideo().isDisplayed());
    }
}
