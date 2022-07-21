package Tests.glovo;

import PageObject.glovo.HomePageWebElements;
import Tests.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestOrderPriceOnGlovo extends TestInit {

    @Test
    public void testOrderPrice() {

        HomePageWebElements homePageWebElements = new HomePageWebElements(driver);

        goToSite("https://glovoapp.com/ua/uk/");
        homePageWebElements.getStartedBtn().click();
        homePageWebElements.getLogIn().click();
        homePageWebElements.getEmailAddressField().sendKeys("chirvamax@ukr.net");
        homePageWebElements.getPasswordField().sendKeys("qwerty12345");
        homePageWebElements.getLogInWithEmailBtn().click();
        homePageWebElements.getUseCurrentLocationBtn().click();
        homePageWebElements.getPrestoPizzaRestaurantBtn().click();
        homePageWebElements.getPrestoPizzaBtn().click();
        homePageWebElements.getAddToCartBtn().click();
        homePageWebElements.getElPoloPizzaBtn().click();
        homePageWebElements.getAddToCartBtn().click();
        homePageWebElements.getSalamiPizzaBtn().click();
        homePageWebElements.getAddToCartBtn().click();
        Assert.assertTrue(homePageWebElements.freeDeliveryMessage().isDisplayed());
    }
}