package Tests.allo;

import PageObject.allo.AlloHomePage;
import PageObject.allo.AlloSocialNetworksPage;
import Tests.TestInit;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.ArrayList;

public class TestOpenPlayMarketPage extends TestInit {

    @Test
    public void testOpenPlayMarketPage() {
        AlloHomePage alloHomePage = new AlloHomePage(driver);
        AlloSocialNetworksPage alloSocialNetworksPage = new AlloSocialNetworksPage(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        goToSite("https://allo.ua/ua/");
        js.executeScript("window.scrollBy(0,5000)", "");
        sleep(2); //waiting page download
        alloHomePage.getPlayMarketBtn().click();
        ArrayList<String> tabs2 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        sleep(2); //waiting page download
        Assert.assertTrue(alloSocialNetworksPage.getAlloTitleOnPlayMarket().getText().contains("Алло: Тицяй Що Хочеш"));
    }
}
