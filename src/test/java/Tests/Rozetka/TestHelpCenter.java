package Tests.Rozetka;

import PageObject.Rozetka.ContactsPageWebElements;
import PageObject.Rozetka.HomePageWebElements;
import Tests.TestInit;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHelpCenter extends TestInit {

    @Test
    public void testHelpCenter() {

        HomePageWebElements homePageWebElements = new HomePageWebElements(driver);
        ContactsPageWebElements contactsPageWebElements = new ContactsPageWebElements(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        goToSite("https://rozetka.com.ua/ua/");
        js.executeScript("window.scrollBy(0,1000)", "");
        homePageWebElements.getContactsBtn().click();
        contactsPageWebElements.getHelpCenterBtn().click();
        Assert.assertTrue(getURL().contains("help.rozetka"));
    }
}
