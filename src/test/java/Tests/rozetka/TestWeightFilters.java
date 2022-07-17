package Tests.rozetka;

import PageObject.rozetka.FiltersWebElements;
import PageObject.rozetka.GoodsForBusinessPageWebElements;
import PageObject.rozetka.HomePageWebElements;
import PageObject.rozetka.ItemsPageWebElements;
import Tests.TestInit;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestWeightFilters extends TestInit {

    @Test
    public void testWeightFilters() {

        HomePageWebElements homePageWebElements = new HomePageWebElements(driver);
        GoodsForBusinessPageWebElements goodsForBusinessPageWebElements = new GoodsForBusinessPageWebElements(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        FiltersWebElements filtersWebElements = new FiltersWebElements(driver);
        ItemsPageWebElements itemsPageWebElements = new ItemsPageWebElements(driver);

        goToSite("https://rozetka.com.ua/ua/");
        homePageWebElements.getCatalogueBtn().click();
        homePageWebElements.getMenuCategoryGoodsForBusiness().click();
        goodsForBusinessPageWebElements.getMetalCabinetsBtn().click();
        js.executeScript("window.scrollBy(0,2000)", "");
        filtersWebElements.getWeightUnder60kgBtn().click();
        itemsPageWebElements.getCabinetsForArchivesUHLMASH10().click();
        itemsPageWebElements.characteristicsTab().click();
        String weightText = itemsPageWebElements.itemsWeightcharacteristic().getText();
        int weightValue = Integer.parseInt(weightText);
        Assert.assertTrue(weightValue >= 60);


    }
}
