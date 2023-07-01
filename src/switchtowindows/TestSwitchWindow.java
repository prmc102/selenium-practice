package switchtowindows;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

import java.util.Set;

/**
 * Created by Jay Vaghani
 */
public class TestSwitchWindow extends Utility {
    String baseUrl = "https://www.letskodeit.com/practice";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }


    @Test
    public void switchToWindowExample() {
        //Capture the parent window handle
        String parentWindow = driver.getWindowHandle();
        System.out.println("Parent window " + parentWindow);

        // Click on Open Window Tab
        clickOnElement(By.id("openwindow"));

        Set<String> handles = driver.getWindowHandles();
        System.out.println(" All Handles " + handles);

        for (String handle : handles) {
            if(!handle.equals(parentWindow)){
                //Switch to Window Whose handle is not equal to parent window handle
                driver.switchTo().window(handle);
                //Click on Sign in link inside window
                clickOnElement(By.xpath("//a[normalize-space()='Sign In']"));
                //Close the window
                driver.close();
                break;
            }
        }

        // Switch to focus of Driver to parent window
        driver.switchTo().window(parentWindow);
        sendTextToElement(By.id("name"), "Jay");

    }

    @After
    public void tearDown() {
//        closeBrowser();
    }
}
