package Tests.moyo;

import PageObject.Moyo.ua.MoyoHomePage;
import PageObject.Moyo.ua.MoyoPageCategoryHomeGoods;
import Tests.TestInit;
import org.testng.annotations.Test;

public class TestSubMenuHomeGoods extends TestInit {

    @Test
    public void testSubMenuHomeGoods() {
        MoyoHomePage moyoHomePage = new MoyoHomePage(driver);
        MoyoPageCategoryHomeGoods moyoPageCategoryHomeGoods = new MoyoPageCategoryHomeGoods(driver);

        goToSite("https://www.moyo.ua/ua/");
        sleep(1);
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryHomeGoods().click();
        sleep(1);
        moyoPageCategoryHomeGoods.getSubCookware().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryHomeGoods().click();
        sleep(1);
        moyoPageCategoryHomeGoods.getSubDishesForServing().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryHomeGoods().click();
        sleep(1);
        moyoPageCategoryHomeGoods.getSubPlumbing().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryHomeGoods().click();
        sleep(1);
        moyoPageCategoryHomeGoods.getSubLighting().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryHomeGoods().click();
        sleep(1);
        moyoPageCategoryHomeGoods.getSubSecurityAndAlarm().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryHomeGoods().click();
        sleep(1);
        moyoPageCategoryHomeGoods.getSubAlternativeEnergy().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryHomeGoods().click();
        sleep(1);
        moyoPageCategoryHomeGoods.getSubHomeDecor().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryHomeGoods().click();
        sleep(1);
        moyoPageCategoryHomeGoods.getSubBagsAndAccessories().click();
        sleep(1);
        moyoHomePage.getLogoBtn().click();
    }
}
