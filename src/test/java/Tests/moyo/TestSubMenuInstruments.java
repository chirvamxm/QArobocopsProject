package Tests.moyo;

import PageObject.Moyo.ua.MoyoHomePage;
import PageObject.Moyo.ua.MoyoPageCategoryInstruments;
import Tests.TestInit;
import org.testng.annotations.Test;

public class TestSubMenuInstruments extends TestInit {

    @Test
    public void testSubMenuInstruments() {
        MoyoHomePage moyoHomePage = new MoyoHomePage(driver);
        MoyoPageCategoryInstruments moyoPageCategoryInstruments = new MoyoPageCategoryInstruments(driver);

        goToSite("https://www.moyo.ua/ua/");
        sleep(1);
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryInstruments().click();
        sleep(1);
        moyoPageCategoryInstruments.getSubPowerTools().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryInstruments().click();
        sleep(1);
        moyoPageCategoryInstruments.getSubGardenEquipment().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryInstruments().click();
        sleep(1);
        moyoPageCategoryInstruments.getSubMeasuringInstrument().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryInstruments().click();
        sleep(1);
        moyoPageCategoryInstruments.getSubStationaryEquipment().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryInstruments().click();
        sleep(1);
        moyoPageCategoryInstruments.getSubHandTools().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryInstruments().click();
        sleep(1);
        moyoPageCategoryInstruments.getSubIrrigationEquipment().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryInstruments().click();
        sleep(1);
        moyoPageCategoryInstruments.getSubProtectiveEquipment().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryInstruments().click();
        sleep(1);
        moyoPageCategoryInstruments.getSubSupplies().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryInstruments().click();
        sleep(1);
        moyoPageCategoryInstruments.getSubPneumaticTool().click();
        sleep(1);
        moyoHomePage.getLogoBtn().click();
    }
}
