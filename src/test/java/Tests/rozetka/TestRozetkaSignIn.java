package Tests.rozetka;

import PageObject.rozetka.HomePageWebElements;
import Tests.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRozetkaSignIn extends TestInit {
    @Test
    public void testSignInRozetka() {

        HomePageWebElements rozetkaHomePageWebElements = new HomePageWebElements(driver);

        goToSite("https://rozetka.com.ua/");
        rozetkaHomePageWebElements.getProfileBtn().click();
        rozetkaHomePageWebElements.mailOrPhoneField().sendKeys("alexwest1@bigmir.net");
        rozetkaHomePageWebElements.passwordField().sendKeys("QprkAJZ53AY9");
        rozetkaHomePageWebElements.getSignInBtn().click();
        Assert.assertTrue(rozetkaHomePageWebElements.getSignInBtn().isDisplayed());
    }
}
