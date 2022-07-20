package Tests.brain;

import PageObject.BasePage;
import PageObject.brain.com.ua.BrainHomePage;
import PageObject.brain.com.ua.BrainHouseholdAppPage;
import PageObject.brain.com.ua.BrainProductPage;
import Tests.TestInit;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CheckCityOption extends TestInit {

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
        homePage.getHouseholdApp().click();

        BrainHouseholdAppPage householdAppPage = new BrainHouseholdAppPage(driver);
        householdAppPage.getBlenders().click();
        homePage.getFirstModel().click();

        BrainProductPage productPage = new BrainProductPage(driver);
        Assert.assertTrue(productPage.getBuyBtn().isDisplayed());

    }
}
