package Tests.moyo;

import PageObject.Moyo.ua.MoyoHomePage;
import Tests.TestInit;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class TestMessageViber extends TestInit {
    @DataProvider
    public static Object[][] City_setup() {
        return new Object[][]{
                {"Бровари"},
                {"Житомир"},
                {"Херсон"}};
    }

    @Test(dataProvider = "City_setup")
    public void testMessageViber(String CityName) {
        MoyoHomePage moyoHomePage = new MoyoHomePage(driver);

        goToSite("https://www.moyo.ua/");
        moyoHomePage.getCityBtn().click();
        moyoHomePage.getSelectCity(CityName).click();
        moyoHomePage.getBlueMessageBtn().click();
        moyoHomePage.getViberBtn().click();
        ArrayList<String> tabs2 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
    }
}
