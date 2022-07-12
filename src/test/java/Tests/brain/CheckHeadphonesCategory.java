package Tests.brain;

import PageObject.BasePage;
import PageObject.brain.com.ua.*;
import Tests.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckHeadphonesCategory extends TestInit {

    @Test
    public void checkHeadphonesCategory() {

        goToSite("https://brain.com.ua/ukr/");
        BasePage page = new BasePage(driver);
        page.implicitlyWait();

        BrainHomePage homePage = new BrainHomePage(driver);
        homePage.getAcoustics().click();

        BrainAcousticsPage acousticsPage = new BrainAcousticsPage(driver);
        acousticsPage.getHeadphones().click();
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
