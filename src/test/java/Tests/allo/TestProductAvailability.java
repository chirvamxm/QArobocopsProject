package Tests.allo;

import PageObject.allo.AlloHomePage;
import Tests.TestInit;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestProductAvailability extends TestInit {

    @DataProvider
    public static Object[][] citySelect() {
        return new Object[][]{
                {"Вінниця"},
                {"Луцьк"},
                {"Запоріжжя"}};
    }

    @Test(dataProvider = "citySelect")
    public void testSelectCity(String CityName) {
        AlloHomePage alloHomePage = new AlloHomePage(driver);

        goToSite("https://allo.ua/ua/");
        alloHomePage.getCityGeoBtn().click();
        alloHomePage.getSelectCityGeoBtn(CityName).click();
        alloHomePage.getSmartphonesMenuBtn().click();
        alloHomePage.getSmartphonesSubMenuBtn().click();
        alloHomePage.getFirstProductBuyBtn().click();

        Assert.assertTrue(alloHomePage.getConfirmOrderBtn().isDisplayed());
    }
}
