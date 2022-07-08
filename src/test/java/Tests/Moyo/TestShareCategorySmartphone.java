package Tests.Moyo;

import PageObject.Moyo.ua.MoyoHomePage;
import PageObject.Moyo.ua.MoyoSharesPage;
import PageObject.Moyo.ua.MoyoTimerOut;
import Tests.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestShareCategorySmartphone extends TestInit {

    @Test
    public void testShareCategorySmartphone() {
        MoyoHomePage moyoHomePage = new MoyoHomePage(driver);
        MoyoSharesPage moyoSharesPage = new MoyoSharesPage(driver);
        MoyoTimerOut moyoTimerOut = new MoyoTimerOut(driver);

        goToSite("https://www.moyo.ua/");
        moyoHomePage.getSharesBtn().click();
        moyoSharesPage.getSmartphoneMobilePhoneBtn().click();
        sleep(2); //crash test
        moyoSharesPage.getSmartTradeBtn().click();
        Assert.assertTrue(moyoTimerOut.getTimerBtn().isDisplayed());
    }
}
