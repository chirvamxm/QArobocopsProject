package Tests.rozetka;

import PageObject.rozetka.FiltersWebElements;
import PageObject.rozetka.GoodsForBusinessPageWebElements;
import PageObject.rozetka.HomePageWebElements;
import PageObject.rozetka.ItemsPageWebElements;
import Tests.TestInit;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestElectronicCodeFilterForSafes extends TestInit {

    @Test
    public void testElectronicCodeFilterForSafes() {

        HomePageWebElements homePageWebElements = new HomePageWebElements(driver);
        GoodsForBusinessPageWebElements goodsForBusinessPageWebElements = new GoodsForBusinessPageWebElements(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        FiltersWebElements filtersWebElements = new FiltersWebElements(driver);
        ItemsPageWebElements itemsPageWebElements = new ItemsPageWebElements(driver);

        goToSite("https://rozetka.com.ua/ua/");
        homePageWebElements.getCatalogueBtn().click();
        homePageWebElements.getMenuCategoryGoodsForBusiness().click();
        goodsForBusinessPageWebElements.getSafesBtn().click();
        goodsForBusinessPageWebElements.getBuiltInSafesBtn().click();
        js.executeScript("window.scrollBy(0,1000)", "");
        filtersWebElements.getElectronicCodeBtn().click();
        sleep(2); //Waiting for filtration
        itemsPageWebElements.getBuiltInSafeGriffonWL5028E().click();
        itemsPageWebElements.characteristicsTab().click();
        Assert.assertTrue(itemsPageWebElements.electronicCodeLockType().getText().contains("Електронний кодовий"));
    }
}
