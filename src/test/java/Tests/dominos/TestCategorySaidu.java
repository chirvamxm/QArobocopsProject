package Tests.dominos;

import PageObject.dominos.CartHomePage;
import PageObject.dominos.DominosHomePage;
import Tests.TestInit;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCategorySaidu extends TestInit {

    @Test
    public void testCategorySaidu() {
        DominosHomePage dominosHomePage = new DominosHomePage(driver);
        CartHomePage cartHomePage = new CartHomePage(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        goToSite("https://dominos.ua/");
        dominosHomePage.getSelectOdessaBtn().click();
        dominosHomePage.singIn();
        dominosHomePage.getCategoryBtn().click();
        dominosHomePage.getSaiduBtn().click();
        dominosHomePage.getAddCartProductBtn().get(0).click();
        dominosHomePage.getAddCartBtn().click();
        cartHomePage.getSearchFieldPhone().click();
        cartHomePage.getNumberPhone().click();
        js.executeScript("window.scrollBy(0,100)", "");
        cartHomePage.getDataDelivery().get(0).click();
        cartHomePage.getTodayBtn().click();
        cartHomePage.getYesBtn().click();
        cartHomePage.getDeleteProductBtn().click();

        Assert.assertTrue(cartHomePage.getEmptyCartBtn().getText().contains("0.00 грн"));
    }
}
