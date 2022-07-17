package Tests.rozetka;

import PageObject.rozetka.CartWebElements;
import PageObject.rozetka.CategoryGoodsForGamersElements;
import PageObject.rozetka.HomePageWebElements;
import PageObject.rozetka.ItemsPageWebElements;
import Tests.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRemoveItemsFromCart extends TestInit {

    @Test
    public void removeItemsFromCart() {
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
        cartWebElements.getDeleteAllFromCartBtn().click();
        cartWebElements.confirmDeletion().click();
        Assert.assertTrue(cartWebElements.emptyCart().isDisplayed());
    }
}
