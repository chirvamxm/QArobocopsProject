package PageObject.allo;

import PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlloVacanciesPage extends BasePage {
    public AlloVacanciesPage(WebDriver driver) {
        super(driver);
    }

    private static final String JOIN_VACANCIES_BTN = "//a[contains(text(),'ПРИЄДНАТИСЯ')]";

    public WebElement getJoinVacanciesBtn() {
        return getElementByXpath(JOIN_VACANCIES_BTN);
    }
}
