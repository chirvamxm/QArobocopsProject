package PageObject.Moyo.ua;

import PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MoyoGoodsBtns extends BasePage {
    public MoyoGoodsBtns(WebDriver driver) {
        super(driver);
    }

    public WebElement getViewListBtn() {
        return getElementByXpath("//div[@data-layout='list']");
    }

    public WebElement getReturnHomePageBtn() {
        return getElementByXpath("//div[@class='header_logo hash_links']");
    }

    public WebElement getResponseQuestionBtn() {
        return getElementByXpath("//button[@class='btn active']");
    }

    public WebElement getFieldPluses() {
        return  getElementByXpath("//input[@id='commentProductPluses']");
    }

    public WebElement getFieldMinuses() {
        return getElementByXpath("//input[@id='commentProductMinuses']");
    }

    public WebElement getFieldForResponseQuestion() {
        return getElementByXpath("//textarea[@id='commentText']");
    }

    public WebElement getFieldUserName() {
        return getElementByXpath("//input[@id='commentName']");
    }

    public WebElement getFieldUserEmail() {
        return getElementByXpath("//input[@id='commentEmail']");
    }

    public WebElement getCancelBtn() {
        return getElementByXpath("//button[@data-gtm-track='cancelCommentForm']");
    }

    public WebElement getScrollTopBtn() {
        return getElementByXpath("//div[@class='btn-scroll-block btn-scroll-visible']");
    }
}