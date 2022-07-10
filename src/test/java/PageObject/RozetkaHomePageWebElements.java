package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RozetkaHomePageWebElements extends BasePage {

    public RozetkaHomePageWebElements(WebDriver driver) {
        super(driver);
    }

    //HEADER
    public WebElement getProfileBtn() {
        return getElementByXpath("//li[@class='header-actions__item header-actions__item--user']");
    }

    public WebElement getSearchField() {
        return getElementByXpath("//input[@name='search']");
    }

    // SIGN IN WINDOW
    public WebElement getSignUpBtn() {
        return getElementByXpath("//button[@class='auth-modal__register-link button button--link ng-star-inserted']");
    }

    // SIGN UP WINDOW
    public WebElement getSignUpFirstNameField() {
        return getElementByXpath("//input[@id='registerUserName']");
    }

    public WebElement getSignUpLastNameField() {
        return getElementByXpath("//input[@id='registerUserSurname']");
    }

    public WebElement getSignUpNumberField() {
        return getElementByXpath("//input[@id='registerUserPhone']");
    }

    public WebElement getSignUpEmailField() {
        return getElementByXpath("//input[@id='registerUserEmail']");
    }

    public WebElement getSignUpPasswordField() {
        return getElementByXpath("//input[@id='registerUserPassword']");
    }

    public WebElement getGoSignUpBtn() {
        return getElementByXpath("//button[@class='button button--large button--green auth-modal__submit']");
    }

    public WebElement alertUserWithThisNumberAlreadyRegistered() {
        return getElementByXpath("//p[@class='validation-message ng-star-inserted']");
    }

    //CART WINDOW

    public List<WebElement> AddBookArtOfWarBtn() {
        return getElementsByXpath("//img[@alt='Мистецтво війни - Сунь-дзи (9786176791454)']");
    }

    public WebElement mailOrPhoneField() {
        return getElementByXpath("//input[@id='auth_email']"); //поле для вводу Пошти або номеру
    }

    public WebElement passwordField() {
        return getElementByXpath("//input[@id='auth_pass']"); //поле для вводу паролю
    }

    public WebElement addNumber() {
        return getElementByXpath("//button[@class='button button--green button--medium']");
    }

    public WebElement getSignInBtn() {
        return getElementByXpath("//*[@class='modal__heading']");
    }

    public WebElement getMenuCategoryGoodsForGamers() {
        return getElementByXpath("//a[@class='menu-categories__link'] [contains(text(),'Товары для геймеров')]");
    }

    public WebElement ukrainianLanguageBtn() {
        return getElementByXpath("//span[@class='lang__link lang__link--active ng-star-inserted']");
    }

    public WebElement closeWindow() {
        return getElementByXpath("//span[@class='exponea-close-cross']");
    }

}
