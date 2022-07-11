package Tests.Rozetka;

import PageObject.Rozetka.BooksPageWebElements;
import PageObject.Rozetka.HomePageWebElements;
import PageObject.Rozetka.ItemsPageWebElements;
import Tests.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAddBookToCart extends TestInit {

    @Test
    public void testAddBookToCart() {

        HomePageWebElements homePageWebElements = new HomePageWebElements(driver);
        BooksPageWebElements booksPageWebElements = new BooksPageWebElements(driver);
        ItemsPageWebElements itemsPageWebElements = new ItemsPageWebElements(driver);

        goToSite("https://rozetka.com.ua/ua/");
        homePageWebElements.getSearchField().sendKeys("Книги");
        homePageWebElements.getSearchingBtn().click();
        booksPageWebElements.getTravelingAndSportBooksCategoryBtn().click();
        booksPageWebElements.getBigAtlasOfTheWorldBtn().get(0).click();
        itemsPageWebElements.getAddToCartBtn().click();
        Assert.assertTrue(booksPageWebElements.getBigAtlasOfTheWorldBtn().get(0).isDisplayed());
    }
}
