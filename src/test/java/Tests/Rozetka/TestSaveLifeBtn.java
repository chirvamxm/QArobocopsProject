package Tests.Rozetka;

import PageObject.Rozetka.HomePageWebElements;
import Tests.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class TestSaveLifeBtn extends TestInit {

    @Test
    public void testSaveLifeBtn() {

        HomePageWebElements homePageWebElements = new HomePageWebElements(driver);

        goToSite("https://rozetka.com.ua/ua/");
        homePageWebElements.getSaveLifeBtn().click();
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        Assert.assertTrue(getURL().contains("savelife"));
    }
}
