package PageObject.allo;

import PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AlloVacanciesPage extends BasePage {
    public AlloVacanciesPage(WebDriver driver) {
        super(driver);
    }

    private static final String JOIN_VACANCIES_BTN = "//a[contains(text(),'ПРИЄДНАТИСЯ')]";
    private static final String VACANCIES_CITY_SELECT = "//select[@name='city']";
    private static final String VACANCIES_SELECT = "//select[@name='vacancy']";
    private static final String VACANCIES_FORM = "//div[@class='dialog dialog-lg']";
    private static final String SEND_VACANCIES_BTN = "//button[@class='nex-submit svg_ready the_input_element style_bold btn btn-default']";

    public WebElement getJoinVacanciesBtn() {
        return getElementByXpath(JOIN_VACANCIES_BTN);
    }

    public WebElement getVacanciesForm() {
        return getElementByXpath(VACANCIES_FORM);
    }

    public WebElement getSendVacanciesBtn() {
        return getElementsByXpath(SEND_VACANCIES_BTN).get(0);
    }

    public void getVacanciesCitySelect() {
        Select vacanciesCity = new Select((getElementsByXpath(VACANCIES_CITY_SELECT).get(0)));
        vacanciesCity.selectByValue("RegionHR-79@allo.ua,RegionHR-124@allo.ua");
    }

    public void getVacanciesSelect() {
        Select vacanciesCity = new Select((getElementsByXpath(VACANCIES_SELECT).get(0)));
        vacanciesCity.selectByValue("Директор магазину");
    }
}
