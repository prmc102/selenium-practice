package selectexample;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.Utility;

import java.util.List;

/**
 * Created by Jay Vaghani
 */
public class TestDropDown extends Utility {
    String baseUrl = "http://way2automation.com/way2auto_jquery/index.php";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }


    @Test
    public void dropDownExample(){
        WebElement dropDown = driver.findElement(By.name("country"));
        Select select = new Select(dropDown);
        //Select by visible text
        select.selectByVisibleText("Australia");
        //Select by Value
        select.selectByValue("Estonia");
        //Select by Index
        select.selectByIndex(10);

       // selectByVisibleTextFromDropDown(By.name("country"), "Australia");
        List<WebElement> allOptions = select.getOptions();
        System.out.println(allOptions.size());

        for(WebElement e : allOptions){
            System.out.println(e.getText());
        }

    }

    @After
    public void tearDown() {
//        closeBrowser();
    }
}
