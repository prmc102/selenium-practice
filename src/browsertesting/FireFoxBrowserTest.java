package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Jay Vaghani
 */
public class FireFoxBrowserTest {

    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/";
        WebDriver driver = new FirefoxDriver();
        driver.get(baseUrl);
        driver.close();
    }
}
