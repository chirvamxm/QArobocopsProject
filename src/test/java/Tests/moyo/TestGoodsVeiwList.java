package Tests.moyo;

import PageObject.Moyo.ua.MoyoGoodsBtns;
import PageObject.Moyo.ua.MoyoHomePage;
import PageObject.Moyo.ua.MoyoPageCategorySmartphones;
import Tests.TestInit;
import org.testng.annotations.Test;

public class TestGoodsVeiwList extends TestInit {

    @Test
    public void testGoodsVeiwList() {
        MoyoHomePage moyoHomePage = new MoyoHomePage(driver);
        MoyoPageCategorySmartphones moyoPageCategorySmartphones = new MoyoPageCategorySmartphones(driver);
        MoyoGoodsBtns moyoGoodsBtns = new MoyoGoodsBtns(driver);

        goToSite("https://www.moyo.ua/ua/");
        sleep(2);
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategorySmartphones().click();
        sleep(2);
        moyoPageCategorySmartphones.getSubMenuFirst().click();
        sleep(2);
        moyoGoodsBtns.getViewListBtn().click();
        sleep(2);
        moyoGoodsBtns.getReturnHomePageBtn().click();
    }
}