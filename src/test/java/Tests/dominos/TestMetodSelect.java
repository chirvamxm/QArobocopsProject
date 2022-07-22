package Tests.dominos;

import PageObject.dominos.HomePageDemoGuru;
import PageObject.dominos.PageGuru;
import Tests.TestInit;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMetodSelect extends TestInit {

    @Test
    public void testMetodSelect() {
        HomePageDemoGuru homePageDemoGuru = new HomePageDemoGuru(driver);
        PageGuru pageGuru = new PageGuru(driver);

        goToSite("https://demo.guru99.com/test/newtours/register.php");
        homePageDemoGuru.getFirstNameBtn().sendKeys("Alex");
        homePageDemoGuru.getLastNameBtn().sendKeys("Ferguson");
        homePageDemoGuru.getPhoneBtn().sendKeys("0932210932");
        homePageDemoGuru.getEmailBtn().sendKeys("qewffsds@gmail.com");
        homePageDemoGuru.getAddressBtn().sendKeys("Wall Street");
        homePageDemoGuru.getCityBtn().sendKeys("NEW-York");
        homePageDemoGuru.getStateBtn().sendKeys("Run");
        homePageDemoGuru.getPostalCodeBtn().sendKeys("07443");

        Select drCountry = new Select(homePageDemoGuru.getCountryBtn());
        drCountry.selectByIndex(3);

        homePageDemoGuru.getUserNameBtn().sendKeys("Alex");
        homePageDemoGuru.getPasswordBtn().sendKeys("qwerty");
        homePageDemoGuru.getConfirmPasswordBtn().sendKeys("qwerty");
        homePageDemoGuru.getSendBtn().click();
        Assert.assertTrue(pageGuru.DearAs().getText().contains("Dear"));
    }
}
