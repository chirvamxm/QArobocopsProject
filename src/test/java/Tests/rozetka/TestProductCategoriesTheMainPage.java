package Tests.rozetka;

import PageObject.rozetka.HomePageWebElements;
import Tests.TestInit;
import org.testng.annotations.Test;

public class TestProductCategoriesTheMainPage extends TestInit {

    @Test
    public void productCategoriesTheMainPage() {
        HomePageWebElements homePageWebElements = new HomePageWebElements(driver);

        goToSite("https://rozetka.com.ua/ua/");
        homePageWebElements.recentlyViewedItems().isDisplayed();
        homePageWebElements.recommendationsBasedOnYourViews().isDisplayed();
        homePageWebElements.advertising().isDisplayed();
        homePageWebElements.promotionalOffers().isDisplayed();
        homePageWebElements.moreProductsToChooseFrom().isDisplayed();
        System.out.println("all product groups are visible");
    }
}
