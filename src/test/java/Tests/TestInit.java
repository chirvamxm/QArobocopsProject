package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestInit {

    //type name of the browser you're using in this variable (chrome or firefox)
    private static final String BROWSER_NAME = "chrome";

    public WebDriver driver;

    @BeforeMethod
    public void setup() throws Exception {
        switch (BROWSER_NAME) {
            case ("chrome") -> {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            }
            case ("firefox") -> {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            }
            default -> throw new Exception("You chose not valid browser!");
        }
    }

     @AfterMethod
    public void finishSession() {
        driver.quit();
    }

    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    protected String getURL() {
        return driver.getCurrentUrl();

    }

    public void goToSite(String url) {
        driver.get(url);
        driver.manage().window().maximize();
    }

    public void getQuantity(int n, WebElement webElement) {
        for (int i = 0; i < n; i++) {
            webElement.click();
        }
    }
}


