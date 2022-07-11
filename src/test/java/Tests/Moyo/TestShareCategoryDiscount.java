package Tests.Moyo;

import PageObject.Moyo.ua.MoyoHomePage;
import PageObject.Moyo.ua.MoyoSharesPage;
import PageObject.Moyo.ua.MoyoTimerOut;
import Tests.TestInit;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestShareCategoryDiscount extends TestInit {

    @Test
    public void testShareCategoryDiscount() {
        MoyoHomePage moyoHomePage = new MoyoHomePage(driver);
        MoyoSharesPage moyoSharesPage = new MoyoSharesPage(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        MoyoTimerOut moyoTimerOut = new MoyoTimerOut(driver);

        goToSite("https://www.moyo.ua/");
        sleep(1);
        moyoHomePage.getSharesBtn().click();
        js.executeScript("window.scrollBy(0,100)", "");
        sleep(1);
        moyoSharesPage.getDiscountBtn().click();
        sleep(1);
        moyoSharesPage.getSeasonSaleBtn().click();
        Assert.assertTrue(moyoTimerOut.getTimerBtn().isDisplayed());
    }
}
