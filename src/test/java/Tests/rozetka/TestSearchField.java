package Tests.rozetka;

import PageObject.rozetka.HomePageWebElements;
import Tests.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSearchField extends TestInit {

    @Test
    public void testSearchField(){

        HomePageWebElements homePageWebElements = new HomePageWebElements(driver);

        goToSite("https://rozetka.com.ua/ua/");
        homePageWebElements.getSearchField().sendKeys("роутер");
        homePageWebElements.getSearchingBtn().click();
        sleep(2); //Waiting for new url redirect
        Assert.assertTrue(getURL().contains("routers"));
    }
}
