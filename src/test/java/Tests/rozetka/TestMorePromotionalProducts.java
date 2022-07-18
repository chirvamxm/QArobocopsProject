package Tests.rozetka;

import PageObject.rozetka.HomePageWebElements;
import PageObject.rozetka.PromotionalProductsPageElements;
import Tests.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMorePromotionalProducts extends TestInit {

    @Test
    public void morePromotionalProducts() {

        HomePageWebElements homePageWebElements = new HomePageWebElements(driver);
        PromotionalProductsPageElements promotionalProductsPageElements = new PromotionalProductsPageElements(driver);

        goToSite("https://rozetka.com.ua/ua/");
        sleep(2);
        homePageWebElements.closeBannerBtn().click();
        sleep(2);
        homePageWebElements.allSharesBtn().click();
        sleep(2);
        promotionalProductsPageElements.filterWithDiscounts().click();
        sleep(2);
        promotionalProductsPageElements.filterHouseHoldGoods().click();
        promotionalProductsPageElements.moreGoodsBtn().click();
        sleep(2);
        promotionalProductsPageElements.moreGoodsBtn().click();
        sleep(2);
        Assert.assertTrue(promotionalProductsPageElements.promotionalProducts().isDisplayed());
    }
}

