package Tests.Rozetka;

import PageObject.Rozetka.AlcoholAndProductsPageWebElements;
import PageObject.Rozetka.HomePageWebElements;
import PageObject.Rozetka.ItemsPageWebElements;
import PageObject.Rozetka.SearchPageWebElements;
import Tests.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAdding2ItemsFromDifferentCategoryToCompare extends TestInit {

    @Test
    public void testAdding2ItemsFromDifferentCategoryToCompare() {

        HomePageWebElements homePageWebElements = new HomePageWebElements(driver);
        ItemsPageWebElements itemsPageWebElements = new ItemsPageWebElements(driver);
        AlcoholAndProductsPageWebElements alcoholAndProductsPageWebElements = new AlcoholAndProductsPageWebElements(driver);
        SearchPageWebElements searchPageWebElements = new SearchPageWebElements(driver);

        goToSite("https://rozetka.com.ua/ua/");
        homePageWebElements.getCatalogueBtn().click();
        homePageWebElements.getMenuCategoryAlcoholAndProducts().click();
        alcoholAndProductsPageWebElements.getStrongDrinksBtn().click();
        alcoholAndProductsPageWebElements.confirmAgeBtn().click();
        alcoholAndProductsPageWebElements.getWhiskeyBtn().click();
        alcoholAndProductsPageWebElements.getBallantineFines1LBtn().click();
        sleep(1); //Wait for site loading
        itemsPageWebElements.getAddToComparisonBtn().click();
        homePageWebElements.getSearchField().sendKeys("роутер");
        homePageWebElements.getSearchingBtn().click();
        searchPageWebElements.getRouterTPLINKArcherC20().click();
        itemsPageWebElements.getAddToComparisonBtn().click();
        homePageWebElements.getComparisonBtn().click();
        Assert.assertTrue(itemsPageWebElements.getToComparisonListBtn().get(0).isDisplayed());
        Assert.assertTrue(itemsPageWebElements.getToComparisonListBtn().get(1).isDisplayed());



    }

}
