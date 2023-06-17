package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

/**
 * Created by Jay Vaghani
 */
public class ChromeBrowserTest {

    public static void main(String[] args) throws InterruptedException {
        String baseUrl = "https://demo.nopcommerce.com/";
        // Launch the Chrome Browser
        WebDriver driver = new EdgeDriver();
        // Open the URL into Browser
        driver.get(baseUrl);
        //Maximise Browser
        driver.manage().window().maximize();
        // We give Implicit wait to Driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get the Title of the page
        String title = driver.getTitle();
        System.out.println("Page Title is " + title);

        // Get the Current URL
        System.out.println("Current URL " + driver.getCurrentUrl());

        // Get Page Source
        System.out.println("Page source : " + driver.getPageSource());

        //Navigate to URL
        driver.navigate().to("https://demo.nopcommerce.com/login?returnUrl=%2F");

        System.out.println("Current URL " + driver.getCurrentUrl());

        Thread.sleep(5000);

        //Navigate Back
        driver.navigate().back();
        System.out.println("Current URL " + driver.getCurrentUrl());
        Thread.sleep(5000);

        // Refresh
        driver.navigate().refresh();
        Thread.sleep(5000);


        // Close The Browser
        driver.close();

    }
}
