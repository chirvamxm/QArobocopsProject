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
        dominosHomePage.getSelectOdessaBtn().click();
        sleep(1); //doesn't have time to see the element
        dominosHomePage.getSingInBtn().click();
        dominosHomePage.getUserNameBtn().sendKeys("vbaranskiy@inbox.ru\n");
        dominosHomePage.getPasswordBtn().sendKeys("19121997\n");
        sleep(1); //doesn't have time to see the element
        dominosHomePage.getEnterBtn().click();
        sleep(3); //doesn't have time to see the element
        js.executeScript("window.scrollBy(0,300)", "");
        dominosHomePage.getAddCartProductBtn().get(0).click();
        sleep(3); //doesn't have time to see the element
        dominosHomePage.getAddCartBtn().click();
        sleep(3); //doesn't have time to see the element
        cartHomePage.getDeleteProductBtn().click();
        sleep(3); //doesn't have time to see the element

        Assert.assertTrue(cartHomePage.getEmptyCartBtn().getText().contains("0.00 грн"));
    }
}