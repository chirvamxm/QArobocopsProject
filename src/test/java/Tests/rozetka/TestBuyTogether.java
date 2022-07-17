package Tests.rozetka;

import PageObject.rozetka.CategoryGoodsForGamersElements;
import PageObject.rozetka.HomePageWebElements;
import PageObject.rozetka.HouseholdAppliancesWebElements;
import PageObject.rozetka.ItemsPageWebElements;
import Tests.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestBuyTogether extends TestInit {

    @Test
    public void householdAppliances() {
        HomePageWebElements homePageWebElements = new HomePageWebElements(driver);
        CategoryGoodsForGamersElements categoryGoodsForGamersElements = new CategoryGoodsForGamersElements(driver);
        ItemsPageWebElements itemsPageWebElements = new ItemsPageWebElements(driver);

        goToSite("https://rozetka.com.ua/");
        sleep(3);
        homePageWebElements.getCatalogueBtn().click();
        sleep(3);
        homePageWebElements.getMenuCategoryGoodsForGamers().click();
        sleep(3);
        categoryGoodsForGamersElements.getGameLaptopsAsus().click();
        sleep(3);
        categoryGoodsForGamersElements.getAsusLaptop().click();
        sleep(3);
        Assert.assertTrue(itemsPageWebElements.buyTogether().isDisplayed());
    }
}
