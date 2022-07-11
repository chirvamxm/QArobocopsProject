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

        HomePageWebElements rozetkaHomePageWebElements = new HomePageWebElements(driver);
        BooksPageWebElements rozetkaBooksPageWebElements = new BooksPageWebElements(driver);
        ItemsPageWebElements rozetkaItemsPageWebElements = new ItemsPageWebElements(driver);

        goToSite("https://rozetka.com.ua/ua/");
        rozetkaHomePageWebElements.getSearchField().sendKeys("Книги\n");
        sleep(5);
        rozetkaBooksPageWebElements.getTravelingAndSportBooksCategoryBtn().click();
        rozetkaBooksPageWebElements.getArtOfWarBookBtn().click();
        rozetkaItemsPageWebElements.getAddToCartBtn().click();
        Assert.assertTrue(rozetkaHomePageWebElements.AddBookArtOfWarBtn().get(0).isDisplayed());
    }
}
