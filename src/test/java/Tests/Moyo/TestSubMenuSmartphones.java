package Tests.Moyo;

import PageObject.Moyo.ua.MoyoHomePage;
import PageObject.Moyo.ua.MoyoPageCategorySmartphones;
import Tests.TestInit;
import org.testng.annotations.Test;

public class TestSubMenuSmartphones extends TestInit {

    @Test
    public void testSubMenuSmartphones() {
        MoyoHomePage moyoHomePage = new MoyoHomePage(driver);
        MoyoPageCategorySmartphones moyoPageCategorySmartphones = new MoyoPageCategorySmartphones(driver);

        goToSite("https://www.moyo.ua/ua/");
        sleep(2);
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategorySmartphones().click();
        sleep(2);
        moyoPageCategorySmartphones.getSubSmartphones().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategorySmartphones().click();
        sleep(2);
        moyoPageCategorySmartphones.getSubMobilePhones().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategorySmartphones().click();
        sleep(2);
        moyoPageCategorySmartphones.getSubModems().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategorySmartphones().click();
        sleep(2);
        moyoPageCategorySmartphones.getSubModemsLandlinePhones().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategorySmartphones().click();
        sleep(2);
        moyoPageCategorySmartphones.getSubSimCards().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategorySmartphones().click();
        sleep(2);
        moyoPageCategorySmartphones.getSubVouchers().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategorySmartphones().click();
        sleep(2);
        moyoPageCategorySmartphones.getSubMiniATS().click();
        sleep(2);
        moyoHomePage.getLogoBtn().click();
    }
}
