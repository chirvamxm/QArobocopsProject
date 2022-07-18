package Tests.rozetka;

import PageObject.rozetka.AlcoholAndProductsPageWebElements;
import PageObject.rozetka.HomePageWebElements;
import PageObject.rozetka.ItemsPageWebElements;
import Tests.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAdding2ItemsFrom1CategoryToCompare extends TestInit {

    @Test
    public void testAdding2ItemsFrom1CategoryToCompare() {
        HomePageWebElements homePageWebElements = new HomePageWebElements(driver);
        ItemsPageWebElements itemsPageWebElements = new ItemsPageWebElements(driver);
        AlcoholAndProductsPageWebElements alcoholAndProductsPageWebElements = new AlcoholAndProductsPageWebElements(driver);

        goToSite("https://rozetka.com.ua/ua/");
        homePageWebElements.getCatalogueBtn().click();
        homePageWebElements.getMenuCategoryAlcoholAndProducts().click();
        alcoholAndProductsPageWebElements.getStrongDrinksBtn().click();
        alcoholAndProductsPageWebElements.confirmAgeBtn().click();
        alcoholAndProductsPageWebElements.getWhiskeyBtn().click();
        alcoholAndProductsPageWebElements.getChivasRegalMizurana07LBtn().click();
        sleep(1); //Wait for site loading
        itemsPageWebElements.getAddToComparisonBtn().click();
        homePageWebElements.getCatalogueBtn().click();
        homePageWebElements.getMenuCategoryAlcoholAndProducts().click();
        alcoholAndProductsPageWebElements.getStrongDrinksBtn().click();
        alcoholAndProductsPageWebElements.getWhiskeyBtn().click();
        alcoholAndProductsPageWebElements.getJamesonWhiskey1LBtn().click();
        sleep(1); //Wait for site loading
        itemsPageWebElements.getAddToComparisonBtn().click();
        homePageWebElements.getComparisonBtn().click();
        itemsPageWebElements.getToComparisonListBtn().get(0).click();
        Assert.assertTrue(itemsPageWebElements.displayed2ItemsInCompare().isDisplayed());
    }
}
