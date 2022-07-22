package Tests.dominos;

import PageObject.dominos.DominosHomePage;
import Tests.TestInit;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class TestSocialNetwork extends TestInit {

    @DataProvider
    public static Object[][] network_setUp() {
        return new Object[][]{
                {"https://www.facebook.com/pages/Dominos-Pizza-Ukraine/236836563002430", "DominosPizzaUkraine"},
                {"https://www.youtube.com/dominospizzaua", "dominospizzaua"},
                {"https://www.instagram.com/dominos_ua/", "dominos_ua"},
                {"https://t.me/dominosukraine", "dominosukraine"}};
    }

    @Test(dataProvider = "network_setUp")
    public void testSocialNetwork(String socialNetwork, String assertURL) {
        DominosHomePage dominosHomePage = new DominosHomePage(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        goToSite("https://dominos.ua/");
        dominosHomePage.getCloseSelectCityBtn().click();
        dominosHomePage.singIn();
        sleep(2);
        js.executeScript("window.scrollBy(0,2000)", "");
        sleep(2);
        dominosHomePage.getSelectSocialNetwork(socialNetwork).click();
        ArrayList<String> tabs2 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        Assert.assertTrue(getURL().contains(assertURL));
    }
}

