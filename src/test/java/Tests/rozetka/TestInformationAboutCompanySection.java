package Tests.rozetka;

import PageObject.rozetka.HomePageWebElements;
import Tests.TestInit;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestInformationAboutCompanySection extends TestInit {

    @Test
    public void testInformationAboutCompanySection() {

        HomePageWebElements homePageWebElements = new HomePageWebElements(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        goToSite("https://rozetka.com.ua/ua/");
        js.executeScript("window.scrollBy(0,1000)", "");
        homePageWebElements.getContactsBtn().click();
        Assert.assertTrue(getURL().contains("contacts"));
        driver.navigate().back();
        js.executeScript("window.scrollBy(0,500)", "");
        System.out.println(getURL());
        homePageWebElements.getAboutUsBtn().click();
        Assert.assertTrue(getURL().contains("about"));
        driver.navigate().back();
        js.executeScript("window.scrollBy(0,500)", "");
        homePageWebElements.getTermsBtn().click();
        Assert.assertTrue(getURL().contains("terms"));
        driver.navigate().back();
    }
}
