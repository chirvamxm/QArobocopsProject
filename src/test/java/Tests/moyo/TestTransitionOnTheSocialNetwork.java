package Tests.moyo;

import PageObject.Moyo.ua.MoyoHomePage;
import Tests.TestInit;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class TestTransitionOnTheSocialNetwork extends TestInit {

    @DataProvider
    public static Object[][] network_setUp() {
        return new Object[][]{
                {"youtube", "channel"},
                {"facebook", "moyoua"},
                {"instagram", "ccounts"},
                {"t.me", "uamoyo"}};
    }

    @Test(dataProvider = "network_setUp")
    public void testTransitionOnTheSocialNetworks(String socialNetwork, String assertURL) {
        MoyoHomePage moyoHomePage = new MoyoHomePage(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        goToSite("https://www.moyo.ua/");
        js.executeScript("window.scrollBy(0,5500)", "");
        sleep(1);
        moyoHomePage.getCloseAdvertisingBtn().click();
        moyoHomePage.getSocialNetworkBtn(socialNetwork).click();
        ArrayList<String> tabs2 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        Assert.assertTrue(getURL().contains(assertURL));
    }
}
