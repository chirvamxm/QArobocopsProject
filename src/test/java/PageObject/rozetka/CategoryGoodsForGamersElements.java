package PageObject.rozetka;

import PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CategoryGoodsForGamersElements extends BasePage {

    public CategoryGoodsForGamersElements(WebDriver driver) {
        super(driver);
    }

    //CATEGORIES

    public WebElement getGamingPeripheralsBtn() {
        return getElementByXpath("//img[@src='https://video.rozetka.com.ua/img_superportal/gaming/gaming-main/igrovaya_periferiya.jpg']");
    }

    public WebElement getGameLaptopsAsus() {
        return getElementByXpath("//a[@class='popular-category'] [@href='https://rozetka.com.ua/notebooks/c80004/preset=game;producer=asus/']");
    }

    // GAMING PERIPHERAL CATEGORY

    public WebElement getManipulatorAndJoystickBtn() {
        return getElementByXpath("//img[@alt='Манипуляторы, джойстики']");
    }

    //MANIPULATOR AND JOYSTICK ITEMS

    public WebElement getCameraPS5DigitalEditionBtn() {
        return getElementByXpath("//div[@data-goods-id='223268545']");
    }

    //LAPTOP ITEMS

    public WebElement getAsusLaptop() {
        return getElementByXpath("//span[@class='goods-tile__title']");
    }

    public WebElement getGamingMiceLogitech() {
        return getElementByXpath("//a[@class='popular-category'] [@href='https://rozetka.com.ua/igrovie-mishi/c4673278/producer=logitech/']");
    }
}