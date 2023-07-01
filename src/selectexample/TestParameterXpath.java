package selectexample;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

/**
 * Created by Jay Vaghani
 */
public class TestParameterXpath extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }


    @Test
    public void dropDownExample() {
        //ul[@class='top-menu notmobile']/li/a[text() ='Apparel ']
        String menu = "Computers";
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li/a[text() ='" + menu + " ']")).click();
    }

    @After
    public void tearDown() {
//        closeBrowser();
    }
}
