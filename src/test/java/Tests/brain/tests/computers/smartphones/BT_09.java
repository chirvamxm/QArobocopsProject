package Tests.brain.tests.computers.smartphones;

import PageObject.BasePage;
import PageObject.brain.com.ua.*;
import Tests.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BT_09 extends TestInit {

    @Test
    public void doIt() {

        goToSite("https://brain.com.ua/ukr/");
        BasePage page = new BasePage(driver);
        page.implicitlyWait();

        BrainHomePage homePage = new BrainHomePage(driver);
        homePage.getSmartphones().click();

        BrainSmartphonesPage smartphonesPage = new BrainSmartphonesPage(driver);
        smartphonesPage.getMobiles().click();
        homePage.getFirstModel().click();

        BrainProductPage productPage = new BrainProductPage(driver);
        sleep(5);
        productPage.getBuyBtn().click();
        productPage.getCheckOut().click();

        BrainOrderPage orderPage = new BrainOrderPage(driver);
        orderPage.visaMasterCard().click();
        orderPage.newPost().click();
        orderPage.recipientData();
        orderPage.cancelPurchase();

        Assert.assertTrue(orderPage.cartIsEmpty().isDisplayed());
    }
}
