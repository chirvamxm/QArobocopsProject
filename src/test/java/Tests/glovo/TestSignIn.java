package Tests.glovo;

import PageObject.glovo.HomePageWebElements;
import Tests.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSignIn extends TestInit {

    @Test
    public void testSignIn() {

        HomePageWebElements homePageWebElements = new HomePageWebElements(driver);

        goToSite("https://glovoapp.com/ua/uk/");
        homePageWebElements.getStartedBtn().click();
        homePageWebElements.getLogIn().click();
        homePageWebElements.getEmailAddressField().sendKeys("chirvamax@ukr.net");
        homePageWebElements.getPasswordField().sendKeys("qwerty12345");
        homePageWebElements.getLogInWithEmailBtn().click();
        homePageWebElements.getCloseLocationWindowBtn().click();

        Assert.assertTrue(homePageWebElements.getProfileBtn().isDisplayed());
    }
}
