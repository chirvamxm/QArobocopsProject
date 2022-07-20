package Tests.moyo;

import PageObject.Moyo.ua.MoyoGoodsBtns;
import PageObject.Moyo.ua.MoyoHomePage;
import PageObject.Moyo.ua.MoyoPageCategorySmartphones;
import Tests.TestInit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TestAddGoodsResponse extends TestInit {

    @Test
    public void testAddGoodsResponse() {
        MoyoHomePage moyoHomePage = new MoyoHomePage(driver);
        MoyoPageCategorySmartphones moyoPageCategorySmartphones = new MoyoPageCategorySmartphones(driver);
        MoyoGoodsBtns moyoGoodsBtns = new MoyoGoodsBtns(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        goToSite("https://www.moyo.ua/ua/");
        sleep(2);
        moyoHomePage.getMenuBtn().click();
        moyoHomePage.getMenuCategorySmartphones().click();
        sleep(2);
        moyoPageCategorySmartphones.getSubMenuFirst().click();
        sleep(2);
        moyoPageCategorySmartphones.getOpenGoodsFirst().click();
        moyoGoodsBtns.getResponseQuestionBtn().sendKeys(Keys.ENTER);
        js.executeScript("window.scrollBy(0,3000)", "");
        sleep(2);
        moyoGoodsBtns.getFieldPluses().sendKeys("test input");
        moyoGoodsBtns.getFieldMinuses().sendKeys("test input");
        moyoGoodsBtns.getFieldForResponseQuestion().sendKeys("test input");
        moyoGoodsBtns.getFieldUserName().sendKeys("test input");
        moyoGoodsBtns.getFieldUserEmail().sendKeys("test_email@gmail.com");
        sleep(2);
        moyoGoodsBtns.getCancelBtn().click();
        sleep(2);
        moyoGoodsBtns.getScrollTopBtn().click();
        sleep(2);
        moyoGoodsBtns.getReturnHomePageBtn().click();
    }
}
