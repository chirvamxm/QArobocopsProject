package Tests.rozetka;

import PageObject.rozetka.FiltersWebElements;
import PageObject.rozetka.GoodsForBusinessPageWebElements;
import PageObject.rozetka.HomePageWebElements;
import PageObject.rozetka.ItemsPageWebElements;
import Tests.TestInit;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestBrandsFilter extends TestInit {

    @Test
    public void testBrandsFilter() {

        HomePageWebElements homePageWebElements = new HomePageWebElements(driver);
        GoodsForBusinessPageWebElements goodsForBusinessPageWebElements = new GoodsForBusinessPageWebElements(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        FiltersWebElements filtersWebElements = new FiltersWebElements(driver);
        ItemsPageWebElements itemsPageWebElements = new ItemsPageWebElements(driver);

        goToSite("https://rozetka.com.ua/ua/");
        homePageWebElements.getCatalogueBtn().click();
        homePageWebElements.getMenuCategoryGoodsForBusiness().click();
        goodsForBusinessPageWebElements.getLabelsPrintersBtn().click();
        filtersWebElements.getToshibaBtn().click();
        itemsPageWebElements.getTermoPrinterToshibaBEX4T1GS12().click();
        Assert.assertTrue(itemsPageWebElements.productTitle().getText().contains("TOSHIBA"));
    }
}
