package Tests.rozetka;

import PageObject.rozetka.CartWebElements;
import PageObject.rozetka.CategoryGoodsForGamersElements;
import PageObject.rozetka.HomePageWebElements;
import PageObject.rozetka.ItemsPageWebElements;
import Tests.TestInit;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDeletingFromCartGamersJoystick extends TestInit {

    @Test
    public void testDeletingFromCartItems(){

        HomePageWebElements homePageWebElements = new HomePageWebElements(driver);
        CategoryGoodsForGamersElements categoryGoodsForGamersElements = new CategoryGoodsForGamersElements(driver);
        ItemsPageWebElements itemsPageWebElements=new ItemsPageWebElements(driver);
        CartWebElements cartWebElements = new CartWebElements(driver);
        JavascriptExecutor js= (JavascriptExecutor) driver ;

        goToSite("https://rozetka.com.ua");
        homePageWebElements.getCatalogueBtn().click();
        homePageWebElements.getMenuCategoryGoodsForGamers().click();
        sleep(1);                                             //Without sleep scrolled previous page
        js.executeScript("window.scrollBy(0,1000)","");
        categoryGoodsForGamersElements.getGamingPeripheralsBtn().click();
        categoryGoodsForGamersElements.getManipulatorAndJoystickBtn().click();
        categoryGoodsForGamersElements.getCameraPS5DigitalEditionBtn().click();
        itemsPageWebElements.getAddToCartBtn().click();
        cartWebElements.getCloseCartBtn().click();
        homePageWebElements.getCartBtn().click();
        cartWebElements.getOtherActionsBtn().click();
        cartWebElements.getDeleteAllFromCartBtn().click();
        Assert.assertTrue(cartWebElements.emptyCart().isDisplayed());

    }
}
