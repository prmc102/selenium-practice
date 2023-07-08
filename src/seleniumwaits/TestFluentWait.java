package seleniumwaits;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import utilities.Utility;

import java.time.Duration;
import java.util.function.Function;

/**
 * Created by Jay Vaghani
 */
public class TestFluentWait extends Utility {
    String baseUrl = "https://www.letskodeit.com/practice";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void fluentWaitExample() {
        clickOnElement(By.xpath("//a[contains(text(),'Sign In')]"));

        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);

        WebElement username = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver webDriver) {
                return driver.findElement(By.id("email"));
            }
        });

        username.sendKeys("Prime123@gmail.com");

    }

    @After
    public void tearDown() {
//        closeBrowser();
    }

}
