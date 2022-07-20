package Tests.moyo;

import PageObject.Moyo.ua.MoyoHomePage;
import PageObject.Moyo.ua.MoyoPageCategoryGadgets;
import Tests.TestInit;
import org.testng.annotations.Test;

public class TestSubMenuGadgets extends TestInit {

    @Test
    public void testSubMenuGadgets() {
        MoyoHomePage moyoHomePage = new MoyoHomePage(driver);
        MoyoPageCategoryGadgets moyoPageCategoryGadgets = new MoyoPageCategoryGadgets(driver);

        goToSite("https://www.moyo.ua/ua/");
        sleep(2);
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryGadgets().click();
        sleep(2);
        moyoPageCategoryGadgets.getSubSmartWatch().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryGadgets().click();
        sleep(2);
        moyoPageCategoryGadgets.getSubFitnessBracelets().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryGadgets().click();
        sleep(2);
        moyoPageCategoryGadgets.getSubPhoneStraps().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryGadgets().click();
        sleep(2);
        moyoPageCategoryGadgets.getSubAircraft().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryGadgets().click();
        sleep(2);
        moyoPageCategoryGadgets.getSubRobots().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryGadgets().click();
        sleep(2);
        moyoPageCategoryGadgets.getSubSmartHome().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryGadgets().click();
        sleep(2);
        moyoPageCategoryGadgets.getSubManualStedykams().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryGadgets().click();
        sleep(2);
        moyoPageCategoryGadgets.getSubManual3DPrint().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryGadgets().click();
        sleep(2);
        moyoPageCategoryGadgets.getSubElectricTransport().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryGadgets().click();
        sleep(2);
        moyoPageCategoryGadgets.getSubVRGlasses().click();
        sleep(2);
        moyoHomePage.getLogoBtn().click();
    }
}
