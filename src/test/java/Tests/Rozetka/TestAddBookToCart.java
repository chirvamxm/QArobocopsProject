package Tests.Rozetka;

import PageObject.RozetkaBooksPageWebElements;
import PageObject.RozetkaHomePageWebElements;
import PageObject.RozetkaItemsPageWebElements;
import Tests.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAddBookToCart extends TestInit {

    @Test
    public void testAddBookToCart() {

        RozetkaHomePageWebElements rozetkaHomePageWebElements = new RozetkaHomePageWebElements(driver);
        RozetkaBooksPageWebElements rozetkaBooksPageWebElements = new RozetkaBooksPageWebElements(driver);
        RozetkaItemsPageWebElements rozetkaItemsPageWebElements = new RozetkaItemsPageWebElements(driver);

        goToSite("https://rozetka.com.ua/ua/");
        rozetkaHomePageWebElements.getSearchField().sendKeys("Книги\n");
        sleep(5);
        rozetkaBooksPageWebElements.getTravelingAndSportBooksCategoryBtn().click();
        rozetkaBooksPageWebElements.getArtOfWarBookBtn().click();
        rozetkaItemsPageWebElements.getAddToCartBtn().click();
        Assert.assertTrue(rozetkaHomePageWebElements.AddBookArtOfWarBtn().get(0).isDisplayed());
    }
}
