package Tests.brain.accessories;

import PageObject.BasePage;
import PageObject.brain.com.ua.*;
import Tests.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckVideoCardsCategory extends TestInit {

    @Test
    public void checkVideoCardsCategory() {

        goToSite("https://brain.com.ua/ukr/");
        BasePage page = new BasePage(driver);
        page.implicitlyWait();

        BrainHomePage homePage = new BrainHomePage(driver);
        homePage.getAccessories().click();

        BrainAccessoriesPage accessoriesPage = new BrainAccessoriesPage(driver);
        accessoriesPage.getVideoCards().click();
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
