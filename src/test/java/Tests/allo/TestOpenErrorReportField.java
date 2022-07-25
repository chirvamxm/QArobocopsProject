package Tests.allo;

import PageObject.allo.AlloHomePage;
import Tests.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestOpenErrorReportField extends TestInit {

    @Test
    public void testOpenErrorReportField() {
        AlloHomePage alloHomePage = new AlloHomePage(driver);

        goToSite("https://allo.ua/ua/");
        alloHomePage.getContactUsBtn().click();
        alloHomePage.getErrorReportBtn().click();

        Assert.assertTrue(alloHomePage.getErrorReportField().getText().contains("Повідомити про помилку"));
    }
}
