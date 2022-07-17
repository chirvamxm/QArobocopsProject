package Tests.Moyo;

import PageObject.Moyo.ua.MoyoHomePage;
import PageObject.Moyo.ua.MoyoPageCategoryAcsessor;
import Tests.TestInit;
import org.testng.annotations.Test;

public class TestSubMenuAcsessor extends TestInit {

    @Test
    public void testSubMenuAcsessor() {
        MoyoHomePage moyoHomePage = new MoyoHomePage(driver);
        MoyoPageCategoryAcsessor moyoPageCategoryAcsessor = new MoyoPageCategoryAcsessor(driver);

        goToSite("https://www.moyo.ua/ua/");
        sleep(1);
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryAcsessor().click();
        sleep(1);
        moyoPageCategoryAcsessor.getSubAccessoriesForPC().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryAcsessor().click();
        sleep(1);
        moyoPageCategoryAcsessor.getSubAccessoriesForPhones().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryAcsessor().click();
        sleep(1);
        moyoPageCategoryAcsessor.getSubAccessoriesForTV().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryAcsessor().click();
        sleep(1);
        moyoPageCategoryAcsessor.getSubAccessoriesForPhotoVideoAudio().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryAcsessor().click();
        sleep(1);
        moyoPageCategoryAcsessor.getSubAccessoriesForPortableEquipment().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryAcsessor().click();
        sleep(1);
        moyoPageCategoryAcsessor.getSubElementsOfPower().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryAcsessor().click();
        sleep(1);
        moyoPageCategoryAcsessor.getSubChargers().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryAcsessor().click();
        sleep(1);
        moyoPageCategoryAcsessor.getSubCables().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryAcsessor().click();
        sleep(1);
        moyoPageCategoryAcsessor.getSubExternalBatteries().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryAcsessor().click();
        sleep(1);
        moyoPageCategoryAcsessor.getSubHeadphone().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryAcsessor().click();
        sleep(1);
        moyoPageCategoryAcsessor.getSubMeansOfCare().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryAcsessor().click();
        sleep(1);
        moyoPageCategoryAcsessor.getSubAccessoriesForGraphicsTablets().click();
        sleep(1);
        moyoHomePage.getLogoBtn().click();
    }
}
