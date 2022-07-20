package Tests.moyo;

import PageObject.Moyo.ua.MoyoHomePage;
import PageObject.Moyo.ua.MoyoPageCategoryNotebooks;
import Tests.TestInit;
import org.testng.annotations.Test;

public class TestSubMenuNotebooks extends TestInit {

    @Test
    public void testSubMenuNotebooks() {
        MoyoHomePage moyoHomePage = new MoyoHomePage(driver);
        MoyoPageCategoryNotebooks moyoPageCategoryNotebooks = new MoyoPageCategoryNotebooks(driver);

        goToSite("https://www.moyo.ua/ua/");
        sleep(2);
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryNotebooks().click();
        sleep(2);
        moyoPageCategoryNotebooks.getSubNotebooks().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryNotebooks().click();
        sleep(2);
        moyoPageCategoryNotebooks.getSubPC().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryNotebooks().click();
        sleep(2);
        moyoPageCategoryNotebooks.getSubComponents().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryNotebooks().click();
        sleep(2);
        moyoPageCategoryNotebooks.getSubCarriersInformation().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryNotebooks().click();
        sleep(2);
        moyoPageCategoryNotebooks.getSubOfficeEquipment().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryNotebooks().click();
        sleep(2);
        moyoPageCategoryNotebooks.getSubSupplies().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryNotebooks().click();
        sleep(2);
        moyoPageCategoryNotebooks.getSubNetwork().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryNotebooks().click();
        sleep(2);
        moyoPageCategoryNotebooks.getSubSoftware().click();
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategoryNotebooks().click();
        sleep(2);
        moyoPageCategoryNotebooks.getSubPeriphery().click();
        sleep(2);
        moyoHomePage.getLogoBtn().click();
    }
}
