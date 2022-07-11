package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RozetkaCategoryGoodsForGamersElements extends BasePage {

    public RozetkaCategoryGoodsForGamersElements(WebDriver driver) {
        super(driver);
    }

    public WebElement getGameLaptopsAsus() {
        return getElementByXpath("//a[@class='popular-category'] [@href='https://rozetka.com.ua/notebooks/c80004/preset=game;producer=asus/']");
    }

    public WebElement getAsusLaptop() {
        return getElementByXpath("//span[@class='goods-tile__title']");
    }
}
