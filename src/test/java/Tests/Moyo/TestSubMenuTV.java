package Tests.Moyo;

import PageObject.Moyo.ua.MoyoHomePage;
import PageObject.Moyo.ua.MoyoPageCategoryTV;
import Tests.TestInit;
import org.testng.annotations.Test;

public class TestSubMenuTV extends TestInit {

    @Test
    public void testSubMenuTV() {
        MoyoHomePage moyoHomePage = new MoyoHomePage(driver);
        MoyoPageCategoryTV moyoPageCategoryTV = new MoyoPageCategoryTV(driver);

        goToSite("https://www.moyo.ua/ua/");
        sleep(2);
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryTV().click();
        sleep(2);
        moyoPageCategoryTV.getSubTV().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryTV().click();
        sleep(2);
        moyoPageCategoryTV.getSubMediaPlayers().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryTV().click();
        sleep(2);
        moyoPageCategoryTV.getSubProjectors().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryTV().click();
        sleep(2);
        moyoPageCategoryTV.getSubProjectionScreens().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryTV().click();
        sleep(2);
        moyoPageCategoryTV.getSubHoldersForProjectors().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryTV().click();
        sleep(2);
        moyoPageCategoryTV.getSubOptionsForProjectors().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryTV().click();
        sleep(2);
        moyoPageCategoryTV.getSubElectronicBoards().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryTV().click();
        sleep(2);
        moyoPageCategoryTV.getSubInformationDisplays().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryTV().click();
        sleep(2);
        moyoPageCategoryTV.getSubFramesForTV().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryTV().click();
        sleep(2);
        moyoPageCategoryTV.getSubWallBoards().click();
        sleep(2);
        moyoHomePage.getLogoBtn().click();
    }
}
