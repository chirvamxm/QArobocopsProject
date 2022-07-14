package Tests.rozetka;

import PageObject.rozetka.HomePageWebElements;
import Tests.TestInit;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMasterCardBtn extends TestInit {

    @Test
    public void testMasterCardBtn() {

        HomePageWebElements homePageWebElements = new HomePageWebElements(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        goToSite("https://rozetka.com.ua/ua/");
        js.executeScript("window.scrollBy(0,1000)", "");
        homePageWebElements.getMasterCardBtn().click();
        Assert.assertTrue(homePageWebElements.getMasterCardWindow().isDisplayed());
    }
}
