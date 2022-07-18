package Tests.rozetka;

import PageObject.rozetka.*;
import Tests.TestInit;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class TestGiveRating extends TestInit {

    @Test
    public void giveRating() {
        HomePageWebElements homePageWebElements = new HomePageWebElements(driver);
        GoodsForBusinessPageWebElements goodsForBusinessPageWebElements = new GoodsForBusinessPageWebElements(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        FiltersWebElements filtersWebElements = new FiltersWebElements(driver);
        ItemsPageWebElements itemsPageWebElements = new ItemsPageWebElements(driver);

        goToSite("https://rozetka.com.ua/ua/");
        homePageWebElements.getCatalogueBtn().click();
        homePageWebElements.getMenuCategoryGoodsForBusiness().click();
        sleep(3);
        goodsForBusinessPageWebElements.getLabelsPrintersBtn().click();
        sleep(2);
        filtersWebElements.getToshibaBtn().click();
        sleep(2);
        itemsPageWebElements.getTermoPrinterToshibaBEX4T1GS12().click();
        sleep(2);
        itemsPageWebElements.productReviewsTab().click();
        sleep(2);
        itemsPageWebElements.benefits().sendKeys("comment");
    }
}
