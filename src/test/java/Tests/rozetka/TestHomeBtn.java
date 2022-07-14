package Tests.rozetka;

import PageObject.rozetka.AlcoholAndProductsPageWebElements;
import PageObject.rozetka.HomePageWebElements;
import Tests.TestInit;
import org.testng.annotations.Test;

public class TestHomeBtn extends TestInit {

    @Test
    public void HomeBtn(){
        HomePageWebElements homePageWebElements = new HomePageWebElements(driver);


        goToSite("https://rozetka.com.ua/");
        homePageWebElements.getCatalogueBtn().click();
        homePageWebElements.getMenuCategoryGoodsForGamers().click();

    }
}
