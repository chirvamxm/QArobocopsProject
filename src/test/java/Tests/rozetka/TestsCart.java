package Tests.rozetka;

import PageObject.rozetka.CartWebElements;
import PageObject.rozetka.CategoryGoodsForGamersElements;
import PageObject.rozetka.HomePageWebElements;
import PageObject.rozetka.ItemsPageWebElements;
import Tests.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestsCart extends TestInit {
    // test for the "+" button in the cart, which when pressed, increases the quantity by 1 piece

    @Test
    public void moreProductInTheCart() {

        HomePageWebElements homePageWebElements = new HomePageWebElements(driver);
        CategoryGoodsForGamersElements categoryGoodsForGamersElements = new CategoryGoodsForGamersElements(driver);
        ItemsPageWebElements itemsPageWebElements = new ItemsPageWebElements(driver);
        CartWebElements cartWebElements = new CartWebElements(driver);

        goToSite("https://rozetka.com.ua/");
        homePageWebElements.closeWindow().click();
        homePageWebElements.getCatalogueBtn().click();
        homePageWebElements.getMenuCategoryGoodsForGamers().click();
        categoryGoodsForGamersElements.getGameLaptopsAsus().click();
        categoryGoodsForGamersElements.getAsusLaptop().click();
        itemsPageWebElements.getAddToCartBtn().click();
        homePageWebElements.getCartBtn();
        getQuantity(4, cartWebElements.getProductQuantityPlus());
        Assert.assertTrue(cartWebElements.theNumberOfUnitsAudit(4).isDisplayed());
    }
}

