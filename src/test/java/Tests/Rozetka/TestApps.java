package Tests.Rozetka;

import PageObject.Rozetka.HomePageWebElements;
import Tests.TestInit;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class TestApps extends TestInit {

    @Test
    public void testApps() {

        HomePageWebElements homePageWebElements = new HomePageWebElements(driver);
        JavascriptExecutor js= (JavascriptExecutor) driver;

        goToSite("https://rozetka.com.ua/ua/");
        js.executeScript("window.scrollBy(0,500)","");
        homePageWebElements.getGoogleAppBtn().click();
        ArrayList<String> tabs2 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        Assert.assertTrue(getURL().contains("https://play.google.com/"));
        driver.close();
        driver.switchTo().window(tabs2.get(0));
        homePageWebElements.getAppleAppBtn().click();
        ArrayList<String> tabs4 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs4.get(1));
        System.out.println(getURL());
        Assert.assertTrue(getURL().contains("apps.apple.com"));
    }
}
