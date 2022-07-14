package Tests.rozetka;

import PageObject.rozetka.HomePageWebElements;
import Tests.TestInit;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestServicesSection extends TestInit {

    @Test
    public void testServicesSection() {

        HomePageWebElements homePageWebElements = new HomePageWebElements(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        goToSite("https://rozetka.com.ua/ua/");
        js.executeScript("window.scrollBy(0,1000)", "");
        homePageWebElements.getLoyaltyBtn().click();
        Assert.assertTrue(getURL().contains("loyalty"));
        driver.navigate().back();
        js.executeScript("window.scrollBy(0,1000)", "");
        homePageWebElements.getRozetkaPremiumBtn().click();
        Assert.assertTrue(getURL().contains("premium"));
        driver.navigate().back();
        js.executeScript("window.scrollBy(0,1000)", "");
        homePageWebElements.getCertificatesBtn().click();
        Assert.assertTrue(getURL().contains("certificates"));
        driver.navigate().back();
        js.executeScript("window.scrollBy(0,1000)", "");
        homePageWebElements.getRozetkaChangeBtn().click();
        Assert.assertTrue(getURL().contains("obmin"));
        driver.navigate().back();
        js.executeScript("window.scrollBy(0,1000)", "");
        homePageWebElements.getTravelBtn().click();
        Assert.assertTrue(getURL().contains("travel"));
        driver.navigate().back();
    }
}
