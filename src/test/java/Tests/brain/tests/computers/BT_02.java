package Tests.brain.tests.computers;

import PageObject.BasePage;
import PageObject.brain.com.ua.BrainComputersPage;
import PageObject.brain.com.ua.BrainHomePage;
import PageObject.brain.com.ua.BrainOrderPage;
import PageObject.brain.com.ua.BrainProductPage;
import Tests.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BT_02 extends TestInit {

    @Test
    public void doIt () {

        goToSite("https://brain.com.ua/ukr/");
        BasePage page = new BasePage(driver);
        page.implicitlyWait();

        BrainHomePage homePage = new BrainHomePage(driver);
        homePage.getComputers().click();        // переходимо у розділ "Ноутбуки і комп'ютери"

        BrainComputersPage computersPage = new BrainComputersPage(driver);
        computersPage.getDesktop().click();     // обираємо категорію "Настільні комп'ютери"
        homePage.getFirstModel().click();       // обираємо першу модель

        BrainProductPage productPage = new BrainProductPage(driver);
        productPage.getBuyBtn().click();        // клік по кнопці "Купити"
        productPage.getCheckOut().click();      // клік по кнопці "Оформити замовлення"

        BrainOrderPage orderPage = new BrainOrderPage(driver);
        orderPage.privat24().click();           // вибір способу оплати
        orderPage.newPost().click();            // вибір доставки Новою Поштою
        orderPage.recipientData();              // заповнення контактних даних
        orderPage.cancelPurchase();             // відміна покупки, видалення товару

        Assert.assertTrue(orderPage.cartIsEmpty().isDisplayed());
    }

}
