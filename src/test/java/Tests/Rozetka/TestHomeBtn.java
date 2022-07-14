package Tests.Rozetka;

import Tests.TestInit;
import org.testng.annotations.Test;

public class TestHomeBtn extends TestInit {

    @Test
    public void TestHomeBtn(){
        goToSite("https://rozetka.com.ua/");
        
    }
}
