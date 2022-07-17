package Tests.rozetka;

import PageObject.rozetka.CartWebElements;
import PageObject.rozetka.CategoryGoodsForGamersElements;
import PageObject.rozetka.HomePageWebElements;
import PageObject.rozetka.ItemsPageWebElements;
import Tests.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestProductPhoto extends TestInit {
    @Test
    public void productPhoto() {
        HomePageWebElements homePageWebElements = new HomePageWebElements(driver);
        CategoryGoodsForGamersElements categoryGoodsForGamersElements = new CategoryGoodsForGamersElements(driver);
        ItemsPageWebElements itemsPageWebElements = new ItemsPageWebElements(driver);

        goToSite("https://rozetka.com.ua/");
        homePageWebElements.getCatalogueBtn().click();
        homePageWebElements.getMenuCategoryGoodsForGamers().click();
        categoryGoodsForGamersElements.getGameLaptopsAsus().click();
        sleep(3);
        categoryGoodsForGamersElements.getAsusLaptop().click();
        itemsPageWebElements.productPhotoTab().click();
        sleep(3);
        Assert.assertTrue(itemsPageWebElements.assertProductPhoto().isDisplayed());
    }
}
