package Tests.Moyo;

import PageObject.Moyo.ua.MoyoHomePage;
import PageObject.Moyo.ua.MoyoSharesPage;
import PageObject.Moyo.ua.MoyoTimerOut;
import Tests.TestInit;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestShareCategoryAppliances extends TestInit {

    @Test
    public void testShareCategoryAppliances() {
        MoyoHomePage moyoHomePage = new MoyoHomePage(driver);
        MoyoSharesPage moyoSharesPage = new MoyoSharesPage(driver);
        MoyoTimerOut moyoTimerOut = new MoyoTimerOut(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        goToSite("https://www.moyo.ua/");
        moyoHomePage.getSharesBtn().click();
        moyoSharesPage.getShowAllBtn().click();
        js.executeScript("window.scrollBy(0,200)", "");
        sleep(1); // slow loading site
        moyoSharesPage.getAppliancesBtn().click();
        moyoSharesPage.getSaleVacuumCleaner26Btn().click();
        Assert.assertTrue(moyoTimerOut.getTimerBtn().isDisplayed());
    }
}
