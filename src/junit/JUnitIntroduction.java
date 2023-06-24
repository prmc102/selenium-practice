package junit;

import org.junit.*;

/**
 * Created by Jay Vaghani
 */
public class JUnitIntroduction {

    @BeforeClass
    public static void connectToDB(){
        System.out.println("DB Connection");
    }

    @AfterClass
    public static void closeDBConnection(){
        System.out.println("Close DB Connection");
    }

    @Before
    public void openBrowser(){
        System.out.println("Opening the browser");
    }

    @After
    public void closeBrowser(){
        System.out.println("Closing Browser");
    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully(){
        System.out.println("Navigate to Login Page");
    }

    @Test
    public void test(){
        System.out.println("Test Method");
    }
}
