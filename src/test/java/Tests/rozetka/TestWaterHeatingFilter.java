package Tests.rozetka;

import PageObject.rozetka.FiltersWebElements;
import PageObject.rozetka.GoodsForBusinessPageWebElements;
import PageObject.rozetka.HomePageWebElements;
import PageObject.rozetka.ItemsPageWebElements;
import Tests.TestInit;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestWaterHeatingFilter extends TestInit {

    @Test
    public void testWaterHeatingFilter() {

        HomePageWebElements homePageWebElements = new HomePageWebElements(driver);
        GoodsForBusinessPageWebElements goodsForBusinessPageWebElements = new GoodsForBusinessPageWebElements(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        FiltersWebElements filtersWebElements = new FiltersWebElements(driver);
        ItemsPageWebElements itemsPageWebElements = new ItemsPageWebElements(driver);

        goToSite("https://rozetka.com.ua/ua/");
        homePageWebElements.getCatalogueBtn().click();
        homePageWebElements.getMenuCategoryGoodsForBusiness().click();
        goodsForBusinessPageWebElements.getHighPressureWashersBtn().click();
        js.executeScript("window.scrollBy(0,2000)", "");
        filtersWebElements.getWaterHeatingBtn().click();
        itemsPageWebElements.getHighPressureCleanerForAutoCBK().click();
        itemsPageWebElements.characteristicsTab().click();
        Assert.assertTrue(itemsPageWebElements.waterHeatingCharacteristic().getText().contains("Так"));
    }
}
