package Tests.Moyo;

import PageObject.Moyo.ua.MoyoGoodsBtns;
import PageObject.Moyo.ua.MoyoHomePage;
import PageObject.Moyo.ua.MoyoPageCategorySmartphones;
import Tests.TestInit;
import org.testng.annotations.Test;

public class TestGoodsSortPopular extends TestInit {

    @Test
    public void testGoodsSortPopular() {
        MoyoHomePage moyoHomePage = new MoyoHomePage(driver);
        MoyoPageCategorySmartphones moyoPageCategorySmartphones = new MoyoPageCategorySmartphones(driver);
        MoyoGoodsBtns moyoGoodsBtns = new MoyoGoodsBtns(driver);

        goToSite("https://www.moyo.ua/ua/");
        sleep(2);
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategorySmartphones().click();
        sleep(2);
        moyoPageCategorySmartphones.getSubMenuFirst().click();
        moyoPageCategorySmartphones.getSortPopular().click();
        sleep(2);
        moyoGoodsBtns.getReturnHomePageBtn().click();
    }
}
