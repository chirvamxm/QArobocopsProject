package Tests.rozetka;

import PageObject.rozetka.AlcoholAndProductsPageWebElements;
import PageObject.rozetka.HomePageWebElements;
import PageObject.rozetka.ItemsPageWebElements;
import Tests.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAdding1ItemToCompare extends TestInit {

    @Test
    public void testAdding1ItemToCompare() {

        HomePageWebElements homePageWebElements = new HomePageWebElements(driver);
        AlcoholAndProductsPageWebElements alcoholAndProductsPageWebElements = new AlcoholAndProductsPageWebElements(driver);
        ItemsPageWebElements itemsPageWebElements = new ItemsPageWebElements(driver);

        goToSite("https://rozetka.com.ua/ua/");
        homePageWebElements.getCatalogueBtn().click();
        homePageWebElements.getMenuCategoryAlcoholAndProducts().click();
        alcoholAndProductsPageWebElements.getStrongDrinksBtn().click();
        alcoholAndProductsPageWebElements.confirmAgeBtn().click();
        alcoholAndProductsPageWebElements.getWhiskeyBtn().click();
        alcoholAndProductsPageWebElements.getBallantineFines1LBtn().click();
        sleep(1); //Wait for site loading
        itemsPageWebElements.getAddToComparisonBtn().click();
        homePageWebElements.getComparisonBtn().click();
        itemsPageWebElements.getToComparisonListBtn().get(0).click();
        Assert.assertTrue(itemsPageWebElements.alertMessageNotEnoughItemsToCompare().isDisplayed());
    }
}
