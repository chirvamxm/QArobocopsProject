package Tests.brain.televisions;

import PageObject.BasePage;
import PageObject.brain.com.ua.BrainHomePage;
import PageObject.brain.com.ua.BrainOrderPage;
import PageObject.brain.com.ua.BrainProductPage;
import PageObject.brain.com.ua.BrainTelevisionsPage;
import Tests.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckMediaPlayersCategory extends TestInit {

    @Test
    public void checkMediaPlayersCategory() {

        goToSite("https://brain.com.ua/ukr/");
        BasePage page = new BasePage(driver);
        page.implicitlyWait();

        BrainHomePage homePage = new BrainHomePage(driver);
        homePage.getTVs().click();

        BrainTelevisionsPage televisionsPage = new BrainTelevisionsPage(driver);
        televisionsPage.getMediaPlayers().click();
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
