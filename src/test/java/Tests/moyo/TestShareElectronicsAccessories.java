package Tests.moyo;

import PageObject.Moyo.ua.MoyoHomePage;
import PageObject.Moyo.ua.MoyoSharesPage;
import PageObject.Moyo.ua.MoyoTimerOut;
import Tests.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestShareElectronicsAccessories extends TestInit {

    @Test
    public void testElectronicsAccessories() {
        MoyoHomePage moyoHomePage = new MoyoHomePage(driver);
        MoyoSharesPage moyoSharesPage = new MoyoSharesPage(driver);
        MoyoTimerOut moyoTimerOut = new MoyoTimerOut(driver);

        goToSite("https://www.moyo.ua/");
        sleep(1);  //crush site
        moyoHomePage.getSharesBtn().click();
        moyoSharesPage.getShowAllBtn().click();
        moyoSharesPage.getAccessoriesElectronicsBtn().click();
        moyoSharesPage.getKeySteamBtn().click();
        Assert.assertTrue(moyoTimerOut.getTimerBtn().isDisplayed());
    }
}
