package signinpagetest;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import targetsigninpage.SignInPage;

public class SignInPageTest extends WebAPI {
    SignInPage signInPage;
    @BeforeMethod
    public void getInit(){

        signInPage= PageFactory.initElements(driver,SignInPage.class);
    }
    @Test
    public void testCheckCreateAccount() throws InterruptedException {
        signInPage.checkCreateAccount();
        signInPage.validateCheckCreateAccount();
    }

}
