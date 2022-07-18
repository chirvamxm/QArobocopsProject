package Tests.rozetka;

import PageObject.rozetka.HomePageWebElements;
import PageObject.rozetka.PromotionalProductsPageElements;
import Tests.TestInit;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAllSharesBtn extends TestInit {

    @Test
            public void allSharesBtn() {

        HomePageWebElements homePageWebElements = new HomePageWebElements(driver);
        PromotionalProductsPageElements promotionalProductsPageElements = new PromotionalProductsPageElements(driver);

        goToSite("https://rozetka.com.ua/ua/");
        sleep(2);
        homePageWebElements.closeBannerBtn().click();
        homePageWebElements.allSharesBtn().click();
        sleep(2);
        Assert.assertTrue(promotionalProductsPageElements.promotionalProducts().isDisplayed());
    }
}
