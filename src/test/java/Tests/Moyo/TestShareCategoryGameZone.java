package Tests.Moyo;

import PageObject.Moyo.ua.MoyoHomePage;
import PageObject.Moyo.ua.MoyoSharesPage;
import PageObject.Moyo.ua.MoyoTimerOut;
import Tests.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestShareCategoryGameZone extends TestInit {

    @Test
    public void testCategoryGameZone() {
        MoyoHomePage moyoHomePage = new MoyoHomePage(driver);
        MoyoSharesPage moyoSharesPage = new MoyoSharesPage(driver);
        MoyoTimerOut moyoTimerOut = new MoyoTimerOut(driver);

        goToSite("https://www.moyo.ua/");
        sleep(1);
        moyoHomePage.getSharesBtn().click();
        moyoSharesPage.getGameZoneBtn().click();
        moyoSharesPage.getSale55OnTheChildrenToysBtn().click();
        Assert.assertTrue(moyoTimerOut.getTimerBtn().isDisplayed());
    }
}
