package Tests.Moyo;

import PageObject.Moyo.ua.MoyoHomePage;
import PageObject.Moyo.ua.MoyoSharesPage;
import PageObject.Moyo.ua.MoyoTimerOut;
import Tests.TestInit;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestShareCategorySportRelaxTourism extends TestInit {

    @Test
    public void testShareCategorySportRelaxTourism() {
        MoyoHomePage moyoHomePage = new MoyoHomePage(driver);
        MoyoSharesPage moyoSharesPage = new MoyoSharesPage(driver);
        MoyoTimerOut moyoTimerOut = new MoyoTimerOut(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        goToSite("https://www.moyo.ua/");
        moyoHomePage.getSharesBtn().click();
        moyoSharesPage.getShowAllBtn().click();
        js.executeScript("window.scrollBy(0,200)", "");
        sleep(1);
        moyoSharesPage.getSportRelaxTourismBtn().click();
        moyoSharesPage.getBuySuitcaseGiftWengerBtn().click();
        Assert.assertTrue(moyoTimerOut.getTimerBtn().isDisplayed());
    }
}
