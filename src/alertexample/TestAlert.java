package alertexample;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import utilities.Utility;

/**
 * Created by Jay Vaghani
 */
public class TestAlert extends Utility {
    String baseUrl = "https://www.letskodeit.com/practice";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void alertExample(){
        clickOnElement(By.id("alertbtn"));  // Click on Alert button
        Alert alert = driver.switchTo().alert(); // Creating alert Object reference and Switch to Alert
        System.out.println(alert.getText());  // Getting text from alert
        alert.accept(); // Accepting alert
    }

    @After
    public void tearDown() {
//        closeBrowser();
    }
}
