package Tests.brain.special;

import PageObject.BasePage;
import PageObject.brain.com.ua.BrainHomePage;
import PageObject.brain.com.ua.BrainHouseholdAppPage;
import Tests.TestInit;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class CheckFacebookIcon extends TestInit {

    @Test
    public void checkFacebookIcon() {

        goToSite("https://brain.com.ua/ukr/");
        BasePage page = new BasePage(driver);
        page.implicitlyWait();

        BrainHomePage homePage = new BrainHomePage(driver);
        homePage.getHouseholdApp().click();

        BrainHouseholdAppPage householdAppPage = new BrainHouseholdAppPage(driver);
        householdAppPage.getVacuumCleaners().click();
        homePage.getFirstModel().click();
        homePage.getFacebookIcon().click();
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.close();
    }
}
