package Tests.moyo;

import PageObject.Moyo.ua.MoyoHomePage;
import PageObject.Moyo.ua.MoyoSharesPage;
import PageObject.Moyo.ua.MoyoTimerOut;
import Tests.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestShareCategoryRaffle extends TestInit {

    @Test
    public void testCategoryRaffle() {
        MoyoHomePage moyoHomePage = new MoyoHomePage(driver);
        MoyoSharesPage moyoSharesPage = new MoyoSharesPage(driver);
        MoyoTimerOut moyoTimerOut = new MoyoTimerOut(driver);

        goToSite("https://www.moyo.ua/");
        moyoHomePage.getSharesBtn().click();
        moyoSharesPage.getRaffleBtn().click();
        moyoSharesPage.getRaffle4ConsoleBtn().click();
        Assert.assertTrue(moyoTimerOut.getTimerBtn().isDisplayed());
    }
}
