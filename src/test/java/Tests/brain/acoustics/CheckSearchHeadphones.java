package Tests.brain.acoustics;

import PageObject.BasePage;
import PageObject.brain.com.ua.BrainHomePage;
import PageObject.brain.com.ua.BrainOrderPage;
import PageObject.brain.com.ua.BrainProductPage;
import Tests.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckSearchHeadphones extends TestInit {

    @Test
    public void checkSearchHeadphones() {

        goToSite("https://brain.com.ua/ukr/");
        sleep(2);
        BasePage page = new BasePage(driver);
        page.implicitlyWait();

        BrainHomePage homePage = new BrainHomePage(driver);
        homePage.getSearchField().sendKeys("навушники AirPods");
        homePage.getSearchBtn().click();
        homePage.getFirstResult().click();

        BrainProductPage productPage = new BrainProductPage(driver);
        productPage.getBuyBtn().click();
        sleep(5);
        productPage.getCheckOut().click();

        BrainOrderPage orderPage = new BrainOrderPage(driver);
        orderPage.privat24().click();
        orderPage.newPost().click();
        orderPage.recipientData();
        orderPage.cancelPurchase();

        Assert.assertTrue(orderPage.cartIsEmpty().isDisplayed());
    }
}
