package Tests.moyo;

import PageObject.Moyo.ua.MoyoHomePage;
import PageObject.Moyo.ua.MoyoPageCategoryTablets;
import Tests.TestInit;
import org.testng.annotations.Test;

public class TestSubMenuTablets extends TestInit {

    @Test
    public void testSubMenuTablets() {
        MoyoHomePage moyoHomePage = new MoyoHomePage(driver);
        MoyoPageCategoryTablets moyoPageCategoryTablets = new MoyoPageCategoryTablets(driver);

        goToSite("https://www.moyo.ua/ua/");
        sleep(2);
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryTablets().click();
        sleep(2);
        moyoPageCategoryTablets.getSubTablets().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryTablets().click();
        sleep(2);
        moyoPageCategoryTablets.getSubEBooks().click();
        sleep(2);
        moyoHomePage.getLogoBtn().click();
    }
}
