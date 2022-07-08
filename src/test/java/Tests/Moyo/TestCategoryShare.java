package Tests.Moyo;

import PageObject.Moyo.ua.MoyoHomePage;
import PageObject.Moyo.ua.MoyoPromoStikerPage;
import PageObject.Moyo.ua.MoyoSharesPage;
import Tests.TestInit;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCategoryShare extends TestInit {

    @Test
    public void testCategoryShare() {
        MoyoHomePage moyoHomePage = new MoyoHomePage(driver);
        MoyoSharesPage moyoSharesPage = new MoyoSharesPage(driver);
        MoyoPromoStikerPage moyoPromoStikerPage = new MoyoPromoStikerPage(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        goToSite("https://www.moyo.ua/");
        sleep(1);
        moyoHomePage.getSharesBtn().click();
        js.executeScript("window.scrollBy(0,100)", "");
        sleep(1);
        moyoSharesPage.getGiftBtn().click();
        sleep(1);
        moyoSharesPage.getPromoStikerSweetTVBtn().click();
        sleep(1);
        Assert.assertTrue(moyoPromoStikerPage.getTimerBtn().isDisplayed());
    }
}
