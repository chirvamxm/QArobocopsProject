package Tests.Rozetka;

import PageObject.Rozetka.AlcoholAndProductsPageWebElements;
import PageObject.Rozetka.HomePageWebElements;
import Tests.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLanguageChange extends TestInit {

    @Test
    public void languageChange() {
        HomePageWebElements homePageWebElements = new HomePageWebElements(driver);
        AlcoholAndProductsPageWebElements alcoholAndProductsPageWebElements = new AlcoholAndProductsPageWebElements(driver);

        goToSite("https://rozetka.com.ua/");
        homePageWebElements.getCatalogueBtn().click();
        homePageWebElements.getMenuCategoryAlcoholAndProducts().click();
        alcoholAndProductsPageWebElements.confirmAgeBtn().click();
        alcoholAndProductsPageWebElements.getStrongDrinksBtn().click();
        alcoholAndProductsPageWebElements.getWhiskeyBtn().click();
        homePageWebElements.ukrainianLanguageBtn().click();
        Assert.assertTrue(homePageWebElements.getFindBtnInUA().isDisplayed());
    }
}