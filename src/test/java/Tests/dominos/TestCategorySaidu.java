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
        sleep(1); //doesn't have time to see the element
        dominosHomePage.getSelectOdessaBtn().click();
        sleep(1); //doesn't have time to see the element
        dominosHomePage.getSingInBtn().click();
        dominosHomePage.getUserNameBtn().sendKeys("vbaranskiy@inbox.ru\n");
        dominosHomePage.getPasswordBtn().sendKeys("19121997\n");
        sleep(1); //doesn't have time to see the element
        dominosHomePage.getEnterBtn().click();
        sleep(1); //doesn't have time to see the element
        dominosHomePage.getCategoryBtn().click();
        dominosHomePage.getSaiduBtn().click();
        dominosHomePage.getAddCartProductBtn().get(0).click();
        sleep(1); //doesn't have time to see the element
        dominosHomePage.getAddCartBtn().click();
        sleep(1); //doesn't have time to see the element
        cartHomePage.getSearchFieldPhone().click();
        cartHomePage.getNumberPhone().click();
        js.executeScript("window.scrollBy(0,100)", "");
        cartHomePage.getDataDelivery().get(0).click();
        cartHomePage.getTodayBtn().click();
        cartHomePage.getYesBtn().click();
        cartHomePage.getDeleteProductBtn().click();
        sleep(1); //doesn't have time to see the element

        Assert.assertTrue(cartHomePage.getEmptyCartBtn().getText().contains("0.00 грн"));
    }
}
