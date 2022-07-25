package Tests.amazon;

import PageObject.amazon.AmazonPageWebElements;
import Tests.TestInit;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestChangeQuantity extends TestInit {

    @Test
    public void testChangeQuantity() {

        AmazonPageWebElements amazonPageWebElements = new AmazonPageWebElements(driver);

        goToSite("https://www.amazon.com/");
        amazonPageWebElements.getSelectLocationBtn().click();
        amazonPageWebElements.getDropdownLocationBtn().click();
        amazonPageWebElements.getCanadaLocationBtn().click();
        amazonPageWebElements.getAcceptLocationBtn().click();
        sleep(2); //Without sleep sendKeys going to last page
        amazonPageWebElements.getSearchField().sendKeys("Night Sleep Eye Mask\n");
        amazonPageWebElements.getSleepMaskBtn().click();
        amazonPageWebElements.getAddToCartBtn().click();
        amazonPageWebElements.getGoToCartBtn().click();
        Select drpQuantity = new Select(driver.findElement(By.id("quantity")));
        drpQuantity.selectByValue("9");
        sleep(1); //Wait for changing q-ty

        Assert.assertTrue(amazonPageWebElements.getCartInformation().getText().contains("9 items"));
    }
}