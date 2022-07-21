package Tests.brain.special;

import PageObject.BasePage;
import PageObject.brain.com.ua.BrainGamingPage;
import PageObject.brain.com.ua.BrainHomePage;
import PageObject.brain.com.ua.BrainOrderPage;
import PageObject.brain.com.ua.BrainProductPage;
import Tests.TestInit;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CheckPowerUnitsCategory extends TestInit {

    @DataProvider
    public static Object[][] City_option() {
        return new Object[][]{
                {"23567"},  // Львів
                {"23569"},  // Вінниця
                {"31369"}}; // Житомир
    }

    @Test(dataProvider = "City_option")
    public void checkCityOption(String CityID) {

        goToSite("https://brain.com.ua/ukr/");
        BasePage page = new BasePage(driver);
        page.implicitlyWait();

        BrainHomePage homePage = new BrainHomePage(driver);
        sleep(2);
        homePage.getCityBtn().click();
        homePage.getSelectCity(CityID).click();
        sleep(3);
        homePage.allCategories();
        homePage.getGaming().click();

        BrainGamingPage gamingPage = new BrainGamingPage(driver);
        gamingPage.getPowerUnits().click();
        homePage.getFirstModel().click();

        BrainProductPage productPage = new BrainProductPage(driver);
        sleep(3);
        productPage.getBuyBtn().click();
        productPage.getCheckOut().click();

        BrainOrderPage orderPage = new BrainOrderPage(driver);
        orderPage.privat24().click();
        orderPage.byCourier().click();
        orderPage.address();
        orderPage.recipientData();
        orderPage.cancelPurchase();

        Assert.assertTrue(orderPage.cartIsEmpty().getText().contains("Ваш кошик порожній"));
    }
}
