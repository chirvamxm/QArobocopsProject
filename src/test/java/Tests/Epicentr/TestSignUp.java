package Tests.Epicentr;

import PageObject.RozetkaHomePageWebElements;
import Tests.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSignUp extends TestInit {

    @Test
    public void testSignUp() {

        RozetkaHomePageWebElements rozetkaHomePageWebElements = new RozetkaHomePageWebElements(driver);

        goToSite("https://rozetka.com.ua/ua/");
        rozetkaHomePageWebElements.getProfileBtn().click();
        rozetkaHomePageWebElements.getSignUpBtn().click();
        rozetkaHomePageWebElements.getSignUpFirstNameField().sendKeys("Максим");
        rozetkaHomePageWebElements.getSignUpLastNameField().sendKeys("Чирва");
        rozetkaHomePageWebElements.getSignUpNumberField().sendKeys("637444757");
        rozetkaHomePageWebElements.getSignUpEmailField().sendKeys("chirvamax@ukr.net");
        rozetkaHomePageWebElements.getSignUpPasswordField().sendKeys("Qwerty12345");
        rozetkaHomePageWebElements.getGoSignUpBtn().click();
        Assert.assertTrue(rozetkaHomePageWebElements.alertUserWithThisNumberAlreadyRegistered().isDisplayed());
    }
}
