package Tests.moyo;

import PageObject.Moyo.ua.Alphax46SmartWatchpage;
import PageObject.Moyo.ua.MoyoHomePage;
import PageObject.Moyo.ua.SmartWatchPage;
import Tests.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCartCompares extends TestInit {

    @Test
    public void testCartCompares() {
        MoyoHomePage moyoHomePage = new MoyoHomePage(driver);
        SmartWatchPage smartWatchPage = new SmartWatchPage(driver);
        Alphax46SmartWatchpage alphax46SmartWatchpage = new Alphax46SmartWatchpage(driver);

        goToSite("https://www.moyo.ua/");
        sleep(1); //crush site
        moyoHomePage.getSearchFieldBtn().sendKeys("Смарт-часы 2E Alpha X 46 mm Black-Silver \n");
        sleep(1); //crush site
        smartWatchPage.getWatchImgBlackBtn().click();
        sleep(1); //crush site
        alphax46SmartWatchpage.getCompareBtn().click();
        sleep(1); //crush site
        moyoHomePage.getSearchFieldBtn().sendKeys("Смарт-часы 2E Alpha X 46 mm Silver \n");
        sleep(1); //crush site
        smartWatchPage.getWatchImgSilverBtn().click();
        sleep(1); //crush site
        alphax46SmartWatchpage.getCompareBtn().click();
        sleep(1); //crush site
        moyoHomePage.getComparesBtn().click();
        sleep(1); //crush site
        Assert.assertTrue(getURL().contains("category=6713&id=503596_503610"));
    }
}
