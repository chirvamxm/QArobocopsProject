package Tests.rozetka;

import PageObject.rozetka.HomePageWebElements;
import Tests.TestInit;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHelpSection extends TestInit {

    @Test
    public void testHelpSection() {

        HomePageWebElements homePageWebElements = new HomePageWebElements(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        goToSite("https://rozetka.com.ua/ua/");
        js.executeScript("window.scrollBy(0,1000)", "");
        homePageWebElements.getDeliveryAndPaymentBtn().click();
        Assert.assertTrue(getURL().contains("dostavka"));
        driver.navigate().back();
        js.executeScript("window.scrollBy(0,1000)", "");
        homePageWebElements.getCreditBtn().click();
        Assert.assertTrue(getURL().contains("credit"));
        driver.navigate().back();
        js.executeScript("window.scrollBy(0,1000)", "");
        homePageWebElements.getGuarantyBtn().click();
        Assert.assertTrue(getURL().contains("harantiya"));
        driver.navigate().back();
        js.executeScript("window.scrollBy(0,1000)", "");
        homePageWebElements.getReturnGoodsBtn().click();
        Assert.assertTrue(getURL().contains("povernennya"));
        driver.navigate().back();
        js.executeScript("window.scrollBy(0,1000)", "");
        homePageWebElements.getServiceCenterBtn().click();
        Assert.assertTrue(getURL().contains("service-centers"));
    }
}