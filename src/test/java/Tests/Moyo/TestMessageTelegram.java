package Tests.Moyo;

import PageObject.Moyo.ua.MoyoHomePage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import Tests.TestInit;

import java.util.ArrayList;

public class TestMessageTelegram extends TestInit {

    @DataProvider
    public static Object[][] City_setup() {
        return new Object[][]{
                {"Дніпро"},
                {"Луцьк"},
                {"Одеса"}};
    }

    @Test(dataProvider = "City_setup")
    public void testMessageTelegram(String CityName) {
        MoyoHomePage moyoHomePage = new MoyoHomePage(driver);

        goToSite("https://www.moyo.ua/");
        moyoHomePage.getCityBtn().click();
        moyoHomePage.getSelectCity(CityName).click();
        moyoHomePage.getBlueMessageBtn().click();
        moyoHomePage.getTelegramBtn().click();
        ArrayList<String> tabs2 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        Assert.assertTrue(getURL().contains("MOYObot_bot"));
    }
}
