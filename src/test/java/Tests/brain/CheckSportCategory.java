package Tests.brain;

import PageObject.BasePage;
import PageObject.brain.com.ua.BrainHomePage;
import PageObject.brain.com.ua.BrainOrderPage;
import PageObject.brain.com.ua.BrainProductPage;
import PageObject.brain.com.ua.BrainSportPage;
import Tests.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckSportCategory extends TestInit {

    @Test
    public void checkSportCategory() {

        goToSite("https://brain.com.ua/ukr/");
        BasePage page = new BasePage(driver);
        page.implicitlyWait();

        BrainHomePage homePage = new BrainHomePage(driver);
        sleep(2);
        homePage.getSport().click();

        BrainSportPage sportPage = new BrainSportPage(driver);
        sportPage.getBicycles().click();
        homePage.getFirstModel().click();

        BrainProductPage productPage = new BrainProductPage(driver);
        sleep(3);
        productPage.getBuyBtn().click();
        productPage.getCheckOut().click();

        BrainOrderPage orderPage = new BrainOrderPage(driver);
        orderPage.visaMasterCard().click();
        orderPage.byCourier().click();
        orderPage.address();
        orderPage.getDeliveryTime(); // select
        orderPage.recipientData();
        orderPage.cancelPurchase();

        Assert.assertTrue(orderPage.cartIsEmpty().getText().contains("Ваш кошик порожній"));
    }
}
