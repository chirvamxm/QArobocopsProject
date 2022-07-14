package Tests.rozetka;

import PageObject.rozetka.CategoryGoodsForGamersElements;
import PageObject.rozetka.HomePageWebElements;
import Tests.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestChangeTheLanguage extends TestInit {
    @Test
    public void ChangeTheLanguage(){
        HomePageWebElements homePageWebElements = new HomePageWebElements(driver);
        CategoryGoodsForGamersElements categoryGoodsForGamersElements = new CategoryGoodsForGamersElements(driver);

        goToSite("https://rozetka.com.ua/");
        homePageWebElements.closeWindow().click();
        homePageWebElements.getCatalogueBtn().click();
        homePageWebElements.getMenuCategoryGoodsForGamers().click();
        categoryGoodsForGamersElements.getGameLaptopsAsus().click();
        categoryGoodsForGamersElements.getAsusLaptop().click();
        homePageWebElements.ukrainianLanguageBtn().click();
        Assert.assertTrue(homePageWebElements.findInUkraine().isDisplayed());
    }
}
