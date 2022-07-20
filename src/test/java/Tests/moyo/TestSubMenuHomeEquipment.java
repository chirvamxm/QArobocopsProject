package Tests.moyo;

import PageObject.Moyo.ua.MoyoHomePage;
import PageObject.Moyo.ua.MoyoPageCategoryHomeEquipment;
import Tests.TestInit;
import org.testng.annotations.Test;

public class TestSubMenuHomeEquipment extends TestInit {

    @Test
    public void testSubMenuHomeEquipment() {
        MoyoHomePage moyoHomePage = new MoyoHomePage(driver);
        MoyoPageCategoryHomeEquipment moyoPageCategoryHomeEquipment = new MoyoPageCategoryHomeEquipment(driver);

        goToSite("https://www.moyo.ua/ua/");
        sleep(2);
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryHomeEquipment().click();
        sleep(2);
        moyoPageCategoryHomeEquipment.getSubBigHomeAppliances().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryHomeEquipment().click();
        sleep(2);
        moyoPageCategoryHomeEquipment.getSubGoodsForTheKitchen().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryHomeEquipment().click();
        sleep(2);
        moyoPageCategoryHomeEquipment.getSubClimateTechnology().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryHomeEquipment().click();
        sleep(2);
        moyoPageCategoryHomeEquipment.getSubEmbeddedTechnology().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryHomeEquipment().click();
        sleep(2);
        moyoPageCategoryHomeEquipment.getSubEquipmentForPersonalUse().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryHomeEquipment().click();
        sleep(2);
        moyoPageCategoryHomeEquipment.getSubSmallHouseholdAppliances().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryHomeEquipment().click();
        sleep(2);
        moyoPageCategoryHomeEquipment.getSubWaterPurification().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryHomeEquipment().click();
        sleep(2);
        moyoPageCategoryHomeEquipment.getSubMedicalEquipment().click();
        sleep(2);
        moyoHomePage.getLogoBtn().click();
    }
}
