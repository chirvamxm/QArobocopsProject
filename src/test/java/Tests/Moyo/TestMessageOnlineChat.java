package Tests.Moyo;

import PageObject.Moyo.ua.MoyoHomePage;
import Tests.TestInit;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestMessageOnlineChat extends TestInit {


    @DataProvider
    public static Object[][] City_setup() {
        return new Object[][]{
                {"Дніпро"},
                {"Луцьк"},
                {"Одеса"}};
    }

    @Test(dataProvider = "City_setup")
    public void testMessageOnlineChat(String CityName) {
        MoyoHomePage moyoHomePage = new MoyoHomePage(driver);

        goToSite("https://www.moyo.ua/");
        moyoHomePage.getCityBtn().click();
        moyoHomePage.getSelectCity(CityName).click();
        moyoHomePage.getBlueMessageBtn().click();
        moyoHomePage.getOnlineChatBtn().click();
    }
}
