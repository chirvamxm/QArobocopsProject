package Tests.rozetka;

import PageObject.rozetka.HomePageWebElements;
import PageObject.rozetka.SellOnRozetkaWebElements;
import Tests.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCooperationWithRosetka extends TestInit {

    @Test
    public void cooperationWithRosetka() {

        HomePageWebElements homePageWebElements = new HomePageWebElements(driver);
        SellOnRozetkaWebElements sellOnRozetkaWebElements = new SellOnRozetkaWebElements(driver);

        goToSite("https://rozetka.com.ua/ua/");
        sleep(2);
        homePageWebElements.getSellingOnRozetkaBtn().click();
        sellOnRozetkaWebElements.fillOutAnApplication().click();
        sellOnRozetkaWebElements.theCompanyName().sendKeys("goods");
        sellOnRozetkaWebElements.tickDontHaveWebSite().click();
        sellOnRozetkaWebElements.quantityOfGoods().sendKeys("55");
        sellOnRozetkaWebElements.getToBreed().click();
        Assert.assertTrue(sellOnRozetkaWebElements.contactInformation().isDisplayed());
    }
}

