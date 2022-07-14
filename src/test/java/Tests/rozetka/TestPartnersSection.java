package Tests.rozetka;

import PageObject.rozetka.HomePageWebElements;
import Tests.TestInit;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPartnersSection extends TestInit {

    @Test
    public void testPartnersSection() {

        HomePageWebElements homePageWebElements = new HomePageWebElements(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        goToSite("https://rozetka.com.ua/ua/");
        js.executeScript("window.scrollBy(0,1000)", "");
        homePageWebElements.getSellingOnRozetkaBtn().click();
        Assert.assertTrue(getURL().contains("seller"));
        driver.navigate().back();
        js.executeScript("window.scrollBy(0,1000)", "");
        homePageWebElements.getPartnershipBtn().click();
        Assert.assertTrue(getURL().contains("partnership"));
        driver.navigate().back();
        js.executeScript("window.scrollBy(0,1000)", "");
        homePageWebElements.getFranchiseBtn().click();
        Assert.assertTrue(getURL().contains("franchise"));
        driver.navigate().back();
        js.executeScript("window.scrollBy(0,1000)", "");
        homePageWebElements.getStoreSearchBtn().click();
        Assert.assertTrue(getURL().contains("store_search"));
    }
}
