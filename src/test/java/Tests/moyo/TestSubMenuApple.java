package Tests.moyo;

import PageObject.Moyo.ua.MoyoHomePage;
import PageObject.Moyo.ua.MoyoPageCategoryApple;
import Tests.TestInit;
import org.testng.annotations.Test;

public class TestSubMenuApple extends TestInit {

    @Test
    public void testSubMenuApple() {
        MoyoHomePage moyoHomePage = new MoyoHomePage(driver);
        MoyoPageCategoryApple moyoPageCategoryApple = new MoyoPageCategoryApple(driver);

        goToSite("https://www.moyo.ua/ua/");
        sleep(2);
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryApple().click();
        sleep(2);
        moyoPageCategoryApple.getSubAppleMacBook().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryApple().click();
        sleep(2);
        moyoPageCategoryApple.getSubApplePad().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryApple().click();
        sleep(2);
        moyoPageCategoryApple.getSubApplePhone().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryApple().click();
        sleep(2);
        moyoPageCategoryApple.getSubAppleWatch().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryApple().click();
        sleep(2);
        moyoPageCategoryApple.getSubAppleTV().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryApple().click();
        sleep(2);
        moyoPageCategoryApple.getSubAppleCases().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryApple().click();
        sleep(2);
        moyoPageCategoryApple.getSubAppleHeadphone().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryApple().click();
        sleep(2);
        moyoPageCategoryApple.getSubAppleProtectiveGlass().click();
        sleep(2);
        moyoHomePage.getLogoBtn().click();
    }
}
