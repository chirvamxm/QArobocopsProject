package Tests.rozetka;

import PageObject.rozetka.AlcoholAndProductsPageWebElements;
import PageObject.rozetka.CartWebElements;
import PageObject.rozetka.CategoryGoodsForGamersElements;
import PageObject.rozetka.HomePageWebElements;
import Tests.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHomeBtn extends TestInit {

    @Test
    public void HomeBtn() {
        HomePageWebElements homePageWebElements = new HomePageWebElements(driver);
        CategoryGoodsForGamersElements categoryGoodsForGamersElements = new CategoryGoodsForGamersElements(driver);
        CartWebElements cartWebElements = new CartWebElements(driver);

        goToSite("https://rozetka.com.ua/");
        homePageWebElements.getCatalogueBtn().click();
        homePageWebElements.getMenuCategoryGoodsForGamers().click();
        categoryGoodsForGamersElements.getGamingMiceLogitech().click();
        homePageWebElements.getHomeBtn().click();
        Assert.assertTrue(homePageWebElements.getContactsBtn().isDisplayed());
    }
}
