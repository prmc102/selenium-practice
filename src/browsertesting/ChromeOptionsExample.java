package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

/**
 * Created by Jay Vaghani
 */
public class ChromeOptionsExample {

    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");  // Disable browser notification
        options.addArguments("--incognito"); // Open Browser in private/incognito window
        options.addArguments("--headless");  // Headless browser

        String baseUrl = "https://www.redbus.com/";
        WebDriver driver = new ChromeDriver(options);
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        System.out.println("Page title : " + driver.getTitle());
    }
}
