package Tests.Rozetka;

import PageObject.RozetkaCartElements;
import PageObject.RozetkaCategoryGoodsForGamersElements;
import PageObject.RozetkaHomePageWebElements;
import PageObject.RozetkaItemsPageWebElements;
import Tests.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestsCart extends TestInit {
    // test for the "+" button in the cart, which when pressed, increases the quantity by 1 piece
    @Test
    public void moreProductInTheCart() {
        RozetkaHomePageWebElements rozetkaHomePageWebElements = new RozetkaHomePageWebElements(driver);
        RozetkaCategoryGoodsForGamersElements rozetkaCategoryGoodsForGamersElements = new RozetkaCategoryGoodsForGamersElements(driver);
        RozetkaItemsPageWebElements rozetkaItemsPageWebElements = new RozetkaItemsPageWebElements(driver);
        RozetkaCartElements rozetkaCartElement = new RozetkaCartElements(driver);

        goToSite("https://rozetka.com.ua/");
        rozetkaHomePageWebElements.closeWindow().click();
        rozetkaHomePageWebElements.getCatalog().click();
        rozetkaHomePageWebElements.getMenuCategoryGoodsForGamers().click();
        rozetkaCategoryGoodsForGamersElements.getGameLaptopsAsus().click();
        rozetkaCategoryGoodsForGamersElements.getAsusLaptop().click();
        rozetkaItemsPageWebElements.getAddToCartBtn().click();
        rozetkaItemsPageWebElements.getToMySelectedGoods().click();
        //rozetkaHomePageWebElements.getQuantity(5, rozetkaCartElement.getProductQuantityPlus());
        //Assert.assertTrue(rozetkaCartElement.theNumberOfUnitsAudit(6).isDisplayed());

    }

}


