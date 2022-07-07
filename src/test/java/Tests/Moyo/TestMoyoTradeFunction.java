package Tests.Moyo;

import PageObject.Moyo.ua.MoyoHomePage;
import PageObject.Moyo.ua.MoyoTradePage;
import Tests.TestInit;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class TestMoyoTradeFunction extends TestInit {
    @Test
    public void testMoyoTradeFunction() {
        MoyoHomePage moyoHomePage = new MoyoHomePage(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        MoyoTradePage moyoTradePage = new MoyoTradePage(driver);

        goToSite("https://www.moyo.ua/");
        moyoHomePage.getMoyoTradeBtn().click();
        js.executeScript("window.scrollBy(0,700)", "");
        moyoTradePage.getTypeDeviceBtn().click();
        moyoTradePage.getSmartphoneBtn().click();
        moyoTradePage.getManufacturerBtn().click();
        moyoTradePage.getAppleBtn().click();
        moyoTradePage.getModelDevice().click();
        moyoTradePage.getIphone11gb128().click();
        moyoTradePage.getDeviceSwitchOnClickBtnNo().get(1).click();
        moyoTradePage.getScreenNoScratchBtn().get(0).click();
        js.executeScript("window.scrollBy(0,1000)", "");
        sleep(3);
        moyoTradePage.getFrameNoScratchBtn().click();
    }
}
