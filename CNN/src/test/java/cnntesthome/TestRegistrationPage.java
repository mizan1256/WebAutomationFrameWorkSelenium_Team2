package cnntesthome;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import registration.CnnRegistrationPage;

public class TestRegistrationPage extends WebAPI {
    CnnRegistrationPage cnnRegistrationPage;
    @BeforeMethod
    public void getInit(){
        cnnRegistrationPage= PageFactory.initElements(driver, CnnRegistrationPage.class);
    }
    @Test(enabled = false)
    public void testCheckSignUpButton() throws InterruptedException {
        cnnRegistrationPage.checkSignUpButton();
        cnnRegistrationPage.validateCheckSignUpButton();
    }
    @Test(enabled = false)
    public void testCheckLogInButton() throws InterruptedException {
        cnnRegistrationPage.checkLogInButton();
        cnnRegistrationPage.validateCheckLogInButton();
    }
    @Test(enabled = false)
    public void testCheckLogInButtonWithWrongIdPassword() throws InterruptedException {
        cnnRegistrationPage.checkLogInButtonWithWrongIdPassword();
        cnnRegistrationPage.validateCheckLogInButtonWithWrongIdPassword();
    }
    @Test
    public void testCheckSignUpButtonWithInvalidRequirements() throws InterruptedException {
        cnnRegistrationPage.checkSignUpButtonWithInvalidRequirements();
        cnnRegistrationPage.validateCheckSignUpButtonWithInvalidRequirements();
    }

}
