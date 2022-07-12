package Tests.Moyo;

import PageObject.Moyo.ua.MoyoHomePage;
import PageObject.Moyo.ua.MoyoPageBasket;
import PageObject.Moyo.ua.MoyoPageCategorySmartphones;
import PageObject.Moyo.ua.MoyoPageOrder;
import Tests.TestInit;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TestCategorySmartphones extends TestInit {

    @Test
    public void testCategorySmartphones() {
        MoyoHomePage moyoHomePage = new MoyoHomePage(driver);
        MoyoPageCategorySmartphones moyoPageCategorySmartphones = new MoyoPageCategorySmartphones(driver);
        MoyoPageBasket moyoPageBasket = new MoyoPageBasket(driver);
        MoyoPageOrder moyoPageOrder = new MoyoPageOrder(driver);

        goToSite("https://www.moyo.ua/ua/");
        sleep(2);
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategorySmartphones().click();
        sleep(2);
        moyoPageCategorySmartphones.getTopGoodsFirst().sendKeys(Keys.ENTER);
        sleep(2);
        moyoPageBasket.getBuyBtn().sendKeys(Keys.ENTER);
        sleep(2);
        moyoPageOrder.getBtnNewBuyer().click();
        sleep(2);
        moyoPageOrder.getFieldFirstName().sendKeys("Імя");
        moyoPageOrder.getFieldMiddleName().sendKeys("По-батькові");
        moyoPageOrder.getFieldLastname().sendKeys("Прізвище");
        moyoPageOrder.getFieldPhone().sendKeys("671234567");
        moyoPageOrder.getFieldEmail().sendKeys("test.671234567@gmail.com");
        moyoPageOrder.getBtnNext().click();
        sleep(2);
        moyoPageOrder.getBtnMagazine().click();
        sleep(2);
        moyoPageOrder.getBtnCity().click();
        moyoPageOrder.getFieldCity().sendKeys("Ірпінь\n");
        sleep(2);
        moyoPageOrder.getFieldCityFirstItem().click();
        sleep(2);
        moyoPageOrder.getBtnNext().click();
        sleep(2);
        moyoPageOrder.getBtnPaymentInMagazine().click();
        moyoPageOrder.getBtnOrderCancel().click();
    }
}
