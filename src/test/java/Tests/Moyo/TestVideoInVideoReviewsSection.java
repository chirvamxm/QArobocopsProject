package Tests.Moyo;

import PageObject.Moyo.ua.MoyoHomePage;
import Tests.TestInit;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class TestVideoInVideoReviewsSection extends TestInit {

    @Test
    public void testVideoOnYoutube() {
        goToSite("https://www.moyo.ua/");
        MoyoHomePage moyoHomePage = new MoyoHomePage(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,3500)", "");
        sleep(1);
        moyoHomePage.getPlayVideoBtn().click();
        ArrayList<String> tabs2 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        Assert.assertTrue(getURL().contains("youtube"));
    }
}
