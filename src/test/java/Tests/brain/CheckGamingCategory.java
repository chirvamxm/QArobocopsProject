package Tests.brain;

import PageObject.BasePage;
import PageObject.brain.com.ua.BrainGamingPage;
import PageObject.brain.com.ua.BrainHomePage;
import PageObject.brain.com.ua.BrainOrderPage;
import PageObject.brain.com.ua.BrainProductPage;
import Tests.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckGamingCategory extends TestInit {

    @Test
    public void checkGamingCategory() {

        goToSite("https://brain.com.ua/ukr/");
        BasePage page = new BasePage(driver);
        page.implicitlyWait();

        BrainHomePage homePage = new BrainHomePage(driver);
        sleep(2);
        homePage.allCategories();
        homePage.getGaming().click();

        BrainGamingPage gamingPage = new BrainGamingPage(driver);
        gamingPage.getSSD().click();
        homePage.getFirstModel().click();

        BrainProductPage productPage = new BrainProductPage(driver);
        sleep(3);
        productPage.getBuyBtn().click();
        productPage.getCheckOut().click();

        BrainOrderPage orderPage = new BrainOrderPage(driver);
        orderPage.visaMasterCard().click();
        orderPage.newPost().click();
        orderPage.recipientData();
        orderPage.cancelPurchase();

        Assert.assertTrue(orderPage.cartIsEmpty().getText().contains("Ваш кошик порожній"));
    }
}
