package Tests.Moyo;

import PageObject.Moyo.ua.MoyoHomePage;
import PageObject.Moyo.ua.MoyoPageCategorySmartphones;
import Tests.TestInit;
import org.testng.annotations.Test;

public class TestGoodsVeiwList extends TestInit {

    @Test
    public void testGoodsVeiwList() {
        MoyoHomePage moyoHomePage = new MoyoHomePage(driver);
        MoyoPageCategorySmartphones moyoPageCategorySmartphones = new MoyoPageCategorySmartphones(driver);

        goToSite("https://www.moyo.ua/ua/");
        sleep(2);
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategorySmartphones().click();
        sleep(2);
        moyoPageCategorySmartphones.getSubMenuFirst().click();
        sleep(2);
        moyoPageCategorySmartphones.getViewListBtn().click();
        sleep(2);
        moyoPageCategorySmartphones.getReturnHomePageBtn().click();
    }
}