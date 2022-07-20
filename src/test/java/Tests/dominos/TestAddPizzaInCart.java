package Tests.dominos;

import PageObject.dominos.CartHomePage;
import PageObject.dominos.DominosHomePage;
import Tests.TestInit;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestAddPizzaInCart extends TestInit {

    @DataProvider
    public static Object[][] City_setup() {
        return new Object[][]{
                {"Львів"},
                {"Бровари"},
                {"Рівне"}};
    }

    @Test(dataProvider = "City_setup")
    public void testAddPizzaInCart(String CityName) {
        DominosHomePage dominosHomePage = new DominosHomePage(driver);
        CartHomePage cartHomePage = new CartHomePage(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        goToSite("https://dominos.ua/");
        dominosHomePage.getSelectCityBtn(CityName).click();
        sleep(3); //doesn't have time to see the element
        dominosHomePage.singIn();
        sleep(3);
        js.executeScript("window.scrollBy(0,300)", "");
        dominosHomePage.getAddCartPizzaBtn().get(0).click();
        sleep(3);
        dominosHomePage.getAddCartBtn().click();
        sleep(3);
        cartHomePage.getDeleteProductBtn().click();
        sleep(3);

        Assert.assertTrue(cartHomePage.getEmptyCartBtn().getText().contains("0.00 грн"));
    }
}