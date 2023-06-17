package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**
 * Created by Jay Vaghani
 */
public class LoginTest {

    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/";
        // Launch the Chrome Browser
        WebDriver driver = new ChromeDriver();
        // Open the URL into Browser
        driver.get(baseUrl);
        //Maximise Browser
        driver.manage().window().maximize();
        // We give Implicit wait to Driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // Find Login Link Element
        WebElement loginLink = driver.findElement(By.linkText("Log in"));

        // Click on Login Link element
        loginLink.click();

        //Find the Email Field Element
        WebElement emailField = driver.findElement(By.id("Email"));

        //Type the email address to the email field element
        emailField.sendKeys("prime123@gmail.com");

        //Find the password field and type the password
        driver.findElement(By.name("Password")).sendKeys("Prime123");

        //Find the Welcome Text
        WebElement welcomeText = driver.findElement(By.tagName("h12"));
        String text = welcomeText.getText();
        System.out.println(text);

        System.out.println(loginLink.getText());
    }
}
