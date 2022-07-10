package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RozetkaCategoryGoodsForGamersElements extends BasePage {

    public RozetkaCategoryGoodsForGamersElements(WebDriver driver) {
        super(driver);
    }

    public WebElement getGameLaptopsAsus() {
        return getElementByXpath("//span[contains(text (),' Ігрові ноутбуки Asus ')]");
    }

    public WebElement getAsusLaptop() {
        return getElementByXpath("//span[@class='goods-tile__title']");
    }
}
