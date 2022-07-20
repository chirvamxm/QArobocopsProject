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
        dominosHomePage.singIn();
    }
}
