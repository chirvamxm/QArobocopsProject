package Tests.Moyo;

import PageObject.Moyo.ua.MoyoHomePage;
import PageObject.Moyo.ua.MoyoSharesPage;
import PageObject.Moyo.ua.MoyoTimerOut;
import Tests.TestInit;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestShareCategoryComputerHardware extends TestInit {

    @Test
    public void testCategoryComputerHardware() {
        MoyoHomePage moyoHomePage = new MoyoHomePage(driver);
        MoyoSharesPage moyoSharesPage = new MoyoSharesPage(driver);
        MoyoTimerOut moyoTimerOut = new MoyoTimerOut(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        goToSite("https://www.moyo.ua/");
        sleep(1);  //crush site
        moyoHomePage.getSharesBtn().click();
        sleep(1);  //crush site
        moyoSharesPage.getComputerHardwareBtn().click();
        sleep(1); //crush site
        js.executeScript("window.scrollBy(0,200)", "");
        moyoSharesPage.getRestoreBuild2000().click();
        Assert.assertTrue(moyoTimerOut.getTimerBtn().isDisplayed());
    }
}
