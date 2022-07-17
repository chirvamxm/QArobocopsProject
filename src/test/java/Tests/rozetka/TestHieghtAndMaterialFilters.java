package Tests.rozetka;

import PageObject.rozetka.FiltersWebElements;
import PageObject.rozetka.GoodsForBusinessPageWebElements;
import PageObject.rozetka.HomePageWebElements;
import PageObject.rozetka.ItemsPageWebElements;
import Tests.TestInit;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHieghtAndMaterialFilters extends TestInit {

    @Test
    public void testHeightAndMaterialFilters() {

        HomePageWebElements homePageWebElements = new HomePageWebElements(driver);
        GoodsForBusinessPageWebElements goodsForBusinessPageWebElements = new GoodsForBusinessPageWebElements(driver);
        FiltersWebElements filtersWebElements = new FiltersWebElements(driver);
        ItemsPageWebElements itemsPageWebElements = new ItemsPageWebElements(driver);

        goToSite("https://rozetka.com.ua/ua/");
        homePageWebElements.getCatalogueBtn().click();
        homePageWebElements.getMenuCategoryGoodsForBusiness().click();
        goodsForBusinessPageWebElements.getBoxesBtn().click();
        filtersWebElements.getPlasticsBtn().click();
        filtersWebElements.getHeight150mmBtn().click();
        itemsPageWebElements.box21l60x40x15М10ЕКОILPE().click();
        itemsPageWebElements.characteristicsTab().click();
        Assert.assertTrue(itemsPageWebElements.materialCharacteristic().getText().contains("Пластик"));
        Assert.assertTrue(itemsPageWebElements.heightCharacteristic().getText().contains("150 мм"));
    }
}
