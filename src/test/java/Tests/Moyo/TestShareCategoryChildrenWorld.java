package Tests.Moyo;

import PageObject.Moyo.ua.MoyoHomePage;
import PageObject.Moyo.ua.MoyoSharesPage;
import PageObject.Moyo.ua.MoyoTimerOut;
import Tests.TestInit;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestShareCategoryChildrenWorld extends TestInit {

    @Test
    public void testShareCategoryChildrenWorld() {
        MoyoHomePage moyoHomePage = new MoyoHomePage(driver);
        MoyoSharesPage moyoSharesPage = new MoyoSharesPage(driver);
        MoyoTimerOut moyoTimerOut = new MoyoTimerOut(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        goToSite("https://www.moyo.ua/");
        moyoHomePage.getSharesBtn().click();
        moyoSharesPage.getShowAllBtn().click();
        js.executeScript("window.scrollBy(0,200)", "");
        sleep(1); // slow loading site
        moyoSharesPage.getChildrenWorldBtn().click();
        moyoSharesPage.getBuyNeonFortniteLootBtn().click();
        Assert.assertTrue(moyoTimerOut.getTimerBtn().isDisplayed());
    }
}
