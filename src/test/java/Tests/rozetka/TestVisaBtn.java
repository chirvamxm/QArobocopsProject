package Tests.rozetka;

import PageObject.rozetka.HomePageWebElements;
import Tests.TestInit;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestVisaBtn extends TestInit {

    @Test
    public void testVisaBtn() {

        HomePageWebElements homePageWebElements = new HomePageWebElements(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        goToSite("https://rozetka.com.ua/ua/");
        js.executeScript("window.scrollBy(0,1500)", "");
        homePageWebElements.getVisaBtn().click();
        Assert.assertTrue(homePageWebElements.getVisaWindow().isDisplayed());
    }
}
