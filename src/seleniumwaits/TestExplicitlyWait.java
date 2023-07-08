package seleniumwaits;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Utility;

import java.time.Duration;

/**
 * Created by Jay Vaghani
 */
public class TestExplicitlyWait extends Utility {
    String baseUrl = "https://www.letskodeit.com/practice";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void explicitlyWaitExample(){
        clickOnElement(By.xpath("//a[contains(text(),'Sign In')]"));

        // Use explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
        username.sendKeys("Prime123@gmail.com");

        waitUntilVisibilityOfElementLocated(By.id("email"), 5).sendKeys("");


    }


    @After
    public void tearDown() {
//        closeBrowser();
    }

}
