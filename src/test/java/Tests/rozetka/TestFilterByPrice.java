package Tests.rozetka;

import PageObject.rozetka.CategoryGoodsForGamersElements;
import PageObject.rozetka.FiltersWebElements;
import PageObject.rozetka.HomePageWebElements;
import Tests.TestInit;
import org.bouncycastle.asn1.x509.Holder;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class TestFilterByPrice extends TestInit {

    @Test
    public void testFilterByPrice() {

        HomePageWebElements homePageWebElements = new HomePageWebElements(driver);
        CategoryGoodsForGamersElements categoryGoodsForGamersElements = new CategoryGoodsForGamersElements(driver);
        FiltersWebElements filtersWebElements = new FiltersWebElements(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        goToSite("https://rozetka.com.ua/ua/");
        homePageWebElements.getCatalogueBtn().click();
        homePageWebElements.getMenuCategoryGoodsForGamers().click();
        sleep(1); //Without sleep scrolled last page
        js.executeScript("window.scrollBy(0,1000)", "");
        categoryGoodsForGamersElements.getGamingPeripheralsBtn().click();
        categoryGoodsForGamersElements.getManipulatorAndJoystickBtn().click();
        js.executeScript("window.scrollBy(0,1000)", "");
        filtersWebElements.getMinPriceField().clear();
        filtersWebElements.getMinPriceField().sendKeys("30000");
        filtersWebElements.getMaxPriceField().clear();
        filtersWebElements.getMaxPriceField().sendKeys("40000");
        filtersWebElements.getSubmitPriceBtn().click();
        sleep(2);

        ArrayList<String> stringPriceList = new ArrayList<>();
        for (int i = 0; i < filtersWebElements.getPriceList().size(); i++) {
            stringPriceList.add(filtersWebElements.getPriceList().get(i).getText().replace(" ", ""));
        }

        ArrayList<Double> doublePriceList = new ArrayList<>();
        for (String s : stringPriceList) {
            doublePriceList.add(Double.parseDouble(s));
        }

        for (Double d : doublePriceList) {
            Assert.assertTrue(d > 30000 & d <= 40000);
        }
    }
}