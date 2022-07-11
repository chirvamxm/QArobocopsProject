package Tests.Moyo;

import PageObject.Moyo.ua.MoyoHomePage;
import Tests.TestInit;
import org.testng.annotations.Test;

public class TestLoginMoyo extends TestInit {

    @Test
    public void testLoginMoyo() {
        MoyoHomePage moyoHomePage = new MoyoHomePage(driver);

        goToSite("https://www.moyo.ua/");
        moyoHomePage.getEnterBtn().click();
        moyoHomePage.getSearchPhoneOrEmailBtn().sendKeys("illlingleb@gmail.com \n");
        moyoHomePage.getDropBoxEnterBtn().click();
        System.out.println("Проверьте почту");
    }
}
