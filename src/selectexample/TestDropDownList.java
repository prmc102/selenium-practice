package selectexample;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

import java.util.List;

/**
 * Created by Jay Vaghani
 */
public class TestDropDownList extends Utility {
    String baseUrl = "https://www.redbus.in/Cancellation";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }


    @Test
    public void dropDownExampleWithList(){
        clickOnElement(By.xpath("//div[@class='manageHeaderLbl']"));
        try {
            List<WebElement> manageBookingList = driver.findElements(By.xpath("//div[@id='manageHeaderdd']//ul/li/span"));
            for (WebElement element : manageBookingList ){
                if (element.getText().equals( "Show My Ticket")){
                    element.click();
                    break;
                }
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    @After
    public void tearDown() {
//        closeBrowser();
    }
}
