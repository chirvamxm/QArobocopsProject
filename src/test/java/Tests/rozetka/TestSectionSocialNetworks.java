package Tests.rozetka;

import PageObject.rozetka.HomePageWebElements;
import Tests.TestInit;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class TestSectionSocialNetworks extends TestInit {

    @Test
    public void testSectionSocialNetworks() {

        HomePageWebElements homePageWebElements = new HomePageWebElements(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        goToSite("https://rozetka.com.ua/ua/");
        js.executeScript("window.scrollBy(0,500)", "");
        homePageWebElements.getFacebookBtn().click();
        sleep(2); //Waiting for opening new window
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        System.out.println(getURL());
        Assert.assertTrue(getURL().contains("facebook.com/rozetka.ua"));
        driver.close();
        driver.switchTo().window(tabs.get(0));

        homePageWebElements.getTwitterBtn().click();
        sleep(2); //Waiting for opening new window
        ArrayList<String> tabs1 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs1.get(1));
        Assert.assertTrue(getURL().contains("https://twitter.com/rozetka_ua"));
        driver.close();
        driver.switchTo().window(tabs1.get(0));

        homePageWebElements.getYoutubeBtn().click();
        sleep(5); //Waiting for opening new window
        ArrayList<String> tabs2 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        Assert.assertTrue(getURL().contains("youtube.com/channel"));
        driver.close();
        driver.switchTo().window(tabs2.get(0));

        homePageWebElements.getInstagramBtn().click();
        sleep(2); //Waiting for opening new window
        ArrayList<String> tabs3 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs3.get(1));
        Assert.assertTrue(getURL().contains("instagram"));
        driver.close();
        driver.switchTo().window(tabs3.get(0));

        homePageWebElements.getViberBtn().click();
        sleep(2); //Waiting for opening new window
        ArrayList<String> tabs4 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs4.get(1));
        Assert.assertTrue(getURL().contains(".viber"));
        driver.close();
        driver.switchTo().window(tabs4.get(0));

        homePageWebElements.getTelegramBtn().click();
        sleep(2); //Waiting for opening new window
        ArrayList<String> tabs5 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs5.get(1));
        Assert.assertTrue(getURL().contains("t.me/rrozetka"));
        driver.close();
        driver.switchTo().window(tabs5.get(0));
    }
}
