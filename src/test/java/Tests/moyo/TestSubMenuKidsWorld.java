package Tests.moyo;

import PageObject.Moyo.ua.MoyoHomePage;
import PageObject.Moyo.ua.MoyoPageCategoryKidsWorld;
import Tests.TestInit;
import org.testng.annotations.Test;

public class TestSubMenuKidsWorld extends TestInit {

    @Test
    public void testSubMenuKidsWorld() {
        MoyoHomePage moyoHomePage = new MoyoHomePage(driver);
        MoyoPageCategoryKidsWorld moyoPageCategoryKidsWorld = new MoyoPageCategoryKidsWorld(driver);

        goToSite("https://www.moyo.ua/ua/");
        sleep(1);
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryKidsWorld().click();
        sleep(1);
        moyoPageCategoryKidsWorld.getSubToys().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryKidsWorld().click();
        sleep(1);
        moyoPageCategoryKidsWorld.getSubChildrensTextiles().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryKidsWorld().click();
        sleep(1);
        moyoPageCategoryKidsWorld.getSubStrollersAndCarSeats().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryKidsWorld().click();
        sleep(1);
        moyoPageCategoryKidsWorld.getSubEverythingForTheLittleOnes().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryKidsWorld().click();
        sleep(1);
        moyoPageCategoryKidsWorld.getSubDevelopingGames().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryKidsWorld().click();
        sleep(1);
        moyoPageCategoryKidsWorld.getSubBabysittersAndVideoBabysitters().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryKidsWorld().click();
        sleep(1);
        moyoPageCategoryKidsWorld.getSubChildrensHygieneProducts().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryKidsWorld().click();
        sleep(1);
        moyoPageCategoryKidsWorld.getSubChildrensFurniture().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryKidsWorld().click();
        sleep(1);
        moyoPageCategoryKidsWorld.getSubChildrensTransport().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryKidsWorld().click();
        sleep(1);
        moyoPageCategoryKidsWorld.getSubActiveChildrensVacation().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryKidsWorld().click();
        sleep(1);
        moyoPageCategoryKidsWorld.getSubSchoolSupplies().click();
        sleep(1);
        moyoHomePage.getLogoBtn().click();
    }
}
