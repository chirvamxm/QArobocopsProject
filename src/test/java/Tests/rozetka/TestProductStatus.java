package Tests.rozetka;

import PageObject.rozetka.CategoryGoodsForGamersElements;
import PageObject.rozetka.HomePageWebElements;
import PageObject.rozetka.ItemsPageWebElements;
import Tests.TestInit;
import org.testng.annotations.Test;

public class TestProductStatus extends TestInit {

    @Test
    public void productStatus() {
        HomePageWebElements homePageWebElements = new HomePageWebElements(driver);
        CategoryGoodsForGamersElements categoryGoodsForGamersElements = new CategoryGoodsForGamersElements(driver);
        ItemsPageWebElements itemsPageWebElements = new ItemsPageWebElements(driver);

        goToSite("https://rozetka.com.ua/");
        sleep(3);
        homePageWebElements.getCatalogueBtn().click();
        sleep(3);
        homePageWebElements.getMenuCategoryGoodsForGamers().click();
        sleep(3);
        categoryGoodsForGamersElements.getGameLaptopsAsus().click();
        sleep(3);
        categoryGoodsForGamersElements.getAsusLaptop().click();
        sleep(3);
        if (itemsPageWebElements.IsAvailable().isDisplayed()) ;
        else {
            System.out.println("the product is missing");
        }
    }
}