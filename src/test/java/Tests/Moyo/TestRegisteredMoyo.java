package Tests.Moyo;

import PageObject.MoyoHomePage;
import Tests.TestInit;
import org.testng.annotations.Test;

public class TestRegisteredMoyo extends TestInit {
    @Test
    public void testRegisteredMoyo() {
        MoyoHomePage moyoHomePage = new MoyoHomePage(driver);

        goToSite("https://www.moyo.ua/");
        moyoHomePage.getEnterBtn().click();
        moyoHomePage.getRegisteredBtn().click();
        moyoHomePage.getNameSearchBtn().sendKeys("Глеб \n");
        moyoHomePage.getPhoneSearchBtn().sendKeys("932230047 \n");
        moyoHomePage.getEmailSearchBtn().sendKeys("illlingleb@gmail.com \n");
        moyoHomePage.getAgreeWithRegBtn().click();
        moyoHomePage.getRegisterBtn().click();
    }
}
