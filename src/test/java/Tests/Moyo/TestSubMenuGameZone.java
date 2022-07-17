package Tests.Moyo;

import PageObject.Moyo.ua.MoyoHomePage;
import PageObject.Moyo.ua.MoyoPageCategoryGameZone;
import Tests.TestInit;
import org.testng.annotations.Test;

public class TestSubMenuGameZone extends TestInit {

    @Test
    public void testSubMenuGameZone() {
        MoyoHomePage moyoHomePage = new MoyoHomePage(driver);
        MoyoPageCategoryGameZone moyoPageCategoryGameZone = new MoyoPageCategoryGameZone(driver);

        goToSite("https://www.moyo.ua/ua/");
        sleep(1);
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryGameZone().click();
        sleep(1);
        moyoPageCategoryGameZone.getSubGameConsoles().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryGameZone().click();
        sleep(1);
        moyoPageCategoryGameZone.getSubGames().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryGameZone().click();
        sleep(1);
        moyoPageCategoryGameZone.getSubGameManipulators().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryGameZone().click();
        sleep(1);
        moyoPageCategoryGameZone.getSubAccessoriesForGameConsoles().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryGameZone().click();
        sleep(1);
        moyoPageCategoryGameZone.getSubGamingChairs().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryGameZone().click();
        sleep(1);
        moyoPageCategoryGameZone.getSubGameAttributes().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryGameZone().click();
        sleep(1);
        moyoPageCategoryGameZone.getSubFiguresFortnite().click();
        sleep(1);
        moyoHomePage.getLogoBtn().click();
    }
}
