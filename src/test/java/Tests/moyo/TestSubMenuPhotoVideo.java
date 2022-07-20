package Tests.moyo;

import PageObject.Moyo.ua.MoyoHomePage;
import PageObject.Moyo.ua.MoyoPageCategoryPhotoVideo;
import Tests.TestInit;
import org.testng.annotations.Test;

public class TestSubMenuPhotoVideo extends TestInit {

    @Test
    public void testSubMenuPhotoVideo() {
        MoyoHomePage moyoHomePage = new MoyoHomePage(driver);
        MoyoPageCategoryPhotoVideo moyoPageCategoryPhotoVideo = new MoyoPageCategoryPhotoVideo(driver);

        goToSite("https://www.moyo.ua/ua/");
        sleep(2);
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryPhotoVideo().click();
        sleep(2);
        moyoPageCategoryPhotoVideo.getSubPhotoEquipment().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryPhotoVideo().click();
        sleep(2);
        moyoPageCategoryPhotoVideo.getSubTV().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryPhotoVideo().click();
        sleep(2);
        moyoPageCategoryPhotoVideo.getSubVideoEquipment().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryPhotoVideo().click();
        sleep(2);
        moyoPageCategoryPhotoVideo.getSubAudio().click();
        sleep(2);
        moyoHomePage.getLogoBtn().click();
    }
}
