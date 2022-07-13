package Tests.brain.gadgets;

import PageObject.BasePage;
import PageObject.brain.com.ua.BrainGadgetsPage;
import PageObject.brain.com.ua.BrainHomePage;
import PageObject.brain.com.ua.BrainOrderPage;
import PageObject.brain.com.ua.BrainProductPage;
import Tests.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckDronesCategory extends TestInit {

    @Test
    public void checkDronesCategory() {

        goToSite("https://brain.com.ua/ukr/");
        BasePage page = new BasePage(driver);
        page.implicitlyWait();

        BrainHomePage homePage = new BrainHomePage(driver);
        homePage.getGadgets().click();

        BrainGadgetsPage gadgetsPage = new BrainGadgetsPage(driver);
        gadgetsPage.getDrones().click();
        gadgetsPage.getSubPropellers().click();
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
