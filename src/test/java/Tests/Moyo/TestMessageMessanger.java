package Tests.Moyo;

import PageObject.Moyo.ua.MoyoHomePage;
import Tests.TestInit;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class TestMessageMessanger extends TestInit {

    @DataProvider
    public static Object[][] City_setup() {
        return new Object[][]{
                {"Львов"},
                {"Харьков"},
                {"Ровно"}};
    }

    @Test(dataProvider = "City_setup")
    public void testMessageTelegram(String CityName) {
        MoyoHomePage moyoHomePage = new MoyoHomePage(driver);

        goToSite("https://www.moyo.ua/");
        moyoHomePage.getCityBtn().click();
        moyoHomePage.getSelectCity(CityName).click();
        moyoHomePage.getBlueMessageBtn().click();
        moyoHomePage.getMessagerBtn().click();
        ArrayList<String> tabs2 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        Assert.assertTrue(getURL().contains("www.messenger.com"));
    }
}