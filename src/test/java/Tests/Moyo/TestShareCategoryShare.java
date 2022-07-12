package Tests.Moyo;

import PageObject.Moyo.ua.MoyoHomePage;
import PageObject.Moyo.ua.MoyoSharesPage;
import PageObject.Moyo.ua.MoyoTimerOut;
import Tests.TestInit;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestShareCategoryShare extends TestInit {

    @Test
    public void testCategoryShare() {
        MoyoHomePage moyoHomePage = new MoyoHomePage(driver);
        MoyoSharesPage moyoSharesPage = new MoyoSharesPage(driver);
        MoyoTimerOut moyoTimerOut = new MoyoTimerOut(driver);
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
        Assert.assertTrue(moyoTimerOut.getTimerBtn().isDisplayed());
    }
}
