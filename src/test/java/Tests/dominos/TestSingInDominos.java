package Tests.dominos;

import PageObject.dominos.DominosHomePage;
import Tests.TestInit;
import org.testng.annotations.Test;

public class TestSingInDominos extends TestInit {

    @Test
    public void testSingInDominos() {
        DominosHomePage dominosHomePage = new DominosHomePage(driver);

        goToSite("https://dominos.ua/");
        dominosHomePage.getCloseSelectCityBtn().click();
        dominosHomePage.getSingInBtn().click();
        dominosHomePage.getUserNameBtn().sendKeys("vbaranskiy@inbox.ru \n");
        dominosHomePage.getPasswordBtn().sendKeys("19121997\n");
        sleep(1); // doesn't have time to see the element
        dominosHomePage.getEnterBtn().get(0).click();
    }
}
