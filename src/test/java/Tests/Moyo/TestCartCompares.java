package Tests.Moyo;

import PageObject.Moyo.ua.Alphax46SmartWatchpage;
import PageObject.Moyo.ua.MoyoHomePage;
import PageObject.Moyo.ua.SmartWatchPage;
import Tests.TestInit;
import org.testng.annotations.Test;

public class TestCartCompares extends TestInit {

    @Test
    public void testCartCompares() {
        MoyoHomePage moyoHomePage = new MoyoHomePage(driver);
        SmartWatchPage smartWatchPage = new SmartWatchPage(driver);
        Alphax46SmartWatchpage alphax46SmartWatchpage = new Alphax46SmartWatchpage(driver);

        goToSite("https://www.moyo.ua/");
        moyoHomePage.getSearchFieldBtn().sendKeys("Смарт-часы 2E Alpha X 46 mm Black-Silver \n");
        smartWatchPage.getWatchImgBlackBtn().click();
        alphax46SmartWatchpage.getCompareBtn().click();
        moyoHomePage.getSearchFieldBtn().sendKeys("Смарт-часы 2E Alpha X 46 mm Silver \n");
        smartWatchPage.getWatchImgSilverBtn().click();
        alphax46SmartWatchpage.getCompareBtn().click();
        moyoHomePage.getComparesBtn().get(0).click();
    }
}
