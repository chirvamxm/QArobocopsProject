package Tests.Rozetka;

import PageObject.Rozetka.AlcoholAndProductsPageWebElements;
import PageObject.Rozetka.HomePageWebElements;
import Tests.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAddingProductToReviewedGoods extends TestInit {

    @Test
    public void testAddingProductToReviewedGoods() {

        HomePageWebElements homePageWebElements = new HomePageWebElements(driver);
        AlcoholAndProductsPageWebElements alcoholAndProductsPageWebElements = new AlcoholAndProductsPageWebElements(driver);

        goToSite("https://rozetka.com.ua/ua/");
        homePageWebElements.getCatalogueBtn().click();
        homePageWebElements.getMenuCategoryAlcoholAndProducts().click();
        alcoholAndProductsPageWebElements.getStrongDrinksBtn().click();
        alcoholAndProductsPageWebElements.confirmAgeBtn().click();;
        alcoholAndProductsPageWebElements.getWhiskeyBtn().click();
        alcoholAndProductsPageWebElements.getJamesonWhiskey1LBtn().click();
        sleep(1); //Waiting for loading page
        homePageWebElements.getRozetkaIconBtn().click();
        Assert.assertTrue(alcoholAndProductsPageWebElements.getJamesonWhiskey1LBtn().isDisplayed());
    }
}
