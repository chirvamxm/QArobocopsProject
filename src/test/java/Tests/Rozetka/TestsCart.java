package Tests.Rozetka;

import PageObject.Rozetka.CartWebElements;
import PageObject.Rozetka.CategoryGoodsForGamersElements;
import PageObject.Rozetka.HomePageWebElements;
import PageObject.Rozetka.ItemsPageWebElements;
import Tests.TestInit;
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
        itemsPageWebElements.getToMySelectedGoods().click();
        //rozetkaHomePageWebElements.getQuantity(5, rozetkaCartElement.getProductQuantityPlus());
        //Assert.assertTrue(rozetkaCartElement.theNumberOfUnitsAudit(6).isDisplayed());
    }
}


