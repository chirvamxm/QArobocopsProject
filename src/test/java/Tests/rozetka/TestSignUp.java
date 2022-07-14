package Tests.rozetka;

import PageObject.rozetka.HomePageWebElements;
import Tests.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSignUp extends TestInit {

    @Test
    public void testSignUp() {

        HomePageWebElements homePageWebElements = new HomePageWebElements(driver);

        goToSite("https://rozetka.com.ua/ua/");
        homePageWebElements.getProfileBtn().click();
        homePageWebElements.getSignUpBtn().click();
        homePageWebElements.getSignUpFirstNameField().sendKeys("Максим");
        homePageWebElements.getSignUpLastNameField().sendKeys("Чирва");
        homePageWebElements.getSignUpNumberField().sendKeys("637444757");
        homePageWebElements.getSignUpEmailField().sendKeys("chirvamax@ukr.net");
        homePageWebElements.getSignUpPasswordField().sendKeys("Qwerty12345");
        homePageWebElements.getGoSignUpBtn().click();
        Assert.assertTrue(homePageWebElements.alertUserWithThisNumberAlreadyRegistered().isDisplayed());
    }
}
