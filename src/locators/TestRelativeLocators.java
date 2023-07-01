package locators;

import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;

/**
 * Created by Jay Vaghani
 */
public class TestRelativeLocators extends BaseTest {
    String baseUrl = "http://way2automation.com/way2auto_jquery/index.php";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void relativeLocators() {
       WebElement above = driver.findElement(RelativeLocator.with(By.tagName("input")).above(By.tagName("select")));
       above.sendKeys("Prime Testing");

       WebElement below = driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.tagName("select")));
       below.sendKeys("London");

       /*WebElement near = driver.findElement(RelativeLocator.with(By.partialLinkText("THE")).near(By.linkText("Signin")));
       near.click();*/

       WebElement toRightOf = driver.findElement(RelativeLocator.with(By.xpath("//input[@type='password']")).toRightOf(By.tagName("label")));
       toRightOf.sendKeys("Prime123");

       WebElement toLeftOf = driver.findElement(RelativeLocator.with(By.linkText("Signin")).toLeftOf(By.xpath("(//*[@id='load_form']/div[1]/div[2]/input)[2]")));
       toLeftOf.click();

    }
    @After
    public void tearDown() {
//        closeBrowser();
    }
}
