package PageObject.Rozetka;

import PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePageWebElements extends BasePage {

    public HomePageWebElements(WebDriver driver) {
        super(driver);
    }

    //HEADER
    public WebElement getRozetkaIconBtn() {
        return getElementByXpath("//img[@alt='Rozetka Logo']");
    }

    public WebElement getProfileBtn() {
        return getElementByXpath("//li[@class='header-actions__item header-actions__item--user']");
    }

    public WebElement getSearchField() {
        return getElementByXpath("//input[@name='search']");
    }

    public WebElement getFindBtnInUA (){
        return getElementByXpath("//button[@class='button button_color_green button_size_medium search-form__submit ng-star-inserted'][contains(text(), ' Знайти')]");
    }

    public WebElement getSearchingBtn() {
        return getElementByXpath("//button[@class='button button_color_green button_size_medium search-form__submit ng-star-inserted']");
    }

    public WebElement getCatalogueBtn() {
        return getElementByXpath("//button[@class='button button--medium button--with-icon menu__toggle ng-star-inserted']");
    }

    public WebElement ukrainianLanguageBtn() {
        return getElementByXpath("//span[@class='lang__link lang__link--active ng-star-inserted']");
    }

    public WebElement getCartBtn() {
        return getElementByXpath("//button[@class='header__button ng-star-inserted header__button--active']");
    }

    // SIGN IN WINDOW
    public WebElement getSignUpBtn() {
        return getElementByXpath("//button[@class='auth-modal__register-link button button--link ng-star-inserted']");
    }

    public WebElement mailOrPhoneField() {
        return getElementByXpath("//input[@id='auth_email']"); //поле для вводу Пошти або номеру
    }

    public WebElement passwordField() {
        return getElementByXpath("//input[@id='auth_pass']"); //поле для вводу паролю
    }

    public WebElement getSignInBtn() {
        return getElementByXpath("//*[@class='modal__heading']");
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

    //CATALOGUE SECTION

    public WebElement getMenuCategoryGoodsForGamers() {
        return getElementByXpath("//a[@class='menu-categories__link js-menu-categories__link'] [@href='https://rozetka.com.ua/game-zone/c80261/']");
    }

    public WebElement getMenuCategoryAlcoholAndProducts() {
        return getElementByXpath("//a[@class='menu-categories__link js-menu-categories__link'] [@href='https://rozetka.com.ua/ua/alkoholnie-napitki-i-produkty/c4626923/']");
    }

    public WebElement closeWindow() {
        return getElementByXpath("//span[@class='exponea-close-cross']");
    }

    //APPS SECTION

    public WebElement getGoogleAppBtn() {
        return getElementByXpath("//img[@alt='Google Play']");
    }

    public WebElement getAppleAppBtn() {
        return getElementByXpath("//img[@alt='AppStore']");
    }

    //INFORMATION ABOUT COMPANY SECTION

    public WebElement getContactsBtn() {
        return getElementByXpath("//a[@class='ng-tns-c91-3'][@href='https://rozetka.com.ua/ua/contacts/']");
    }

    //WE ARE IN SOCIAL NETWORK SECTION

    public WebElement getFacebookBtn() {
        return getElementByXpath("//a[@class='socials__link socials__link--facebook']");
    }

    public WebElement getTwitterBtn() {
        return getElementByXpath("//a[@class='socials__link socials__link--twitter']");
    }

    public WebElement getYoutubeBtn() {
        return getElementByXpath("//a[@class='socials__link socials__link--youtube']");
    }

    public WebElement getInstagramBtn() {
        return getElementByXpath("//a[@class='socials__link socials__link--instagram']");
    }

    public WebElement getViberBtn() {
        return getElementByXpath("//a[@class='socials__link socials__link--viber']");
    }

    public WebElement getTelegramBtn() {
        return getElementByXpath("//a[@class='socials__link socials__link--telegram']");
    }
}
