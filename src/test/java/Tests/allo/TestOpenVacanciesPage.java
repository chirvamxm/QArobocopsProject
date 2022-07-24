package Tests.allo;

import PageObject.allo.AlloHomePage;
import PageObject.allo.AlloVacanciesPage;
import Tests.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class TestOpenVacanciesPage extends TestInit {

    @Test
    public void testOpenVacanciesPage() {
        AlloHomePage alloHomePage = new AlloHomePage(driver);
        AlloVacanciesPage alloVacanciesPage = new AlloVacanciesPage(driver);

        goToSite("https://allo.ua/ua/");
        alloHomePage.getVacanciesPageBtn().click();
        ArrayList<String> tabs2 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        sleep(2); //waiting page download
        Assert.assertTrue(alloVacanciesPage.getJoinVacanciesBtn().getText().contains("ПРИЄДНАТИСЯ"));
    }
}
