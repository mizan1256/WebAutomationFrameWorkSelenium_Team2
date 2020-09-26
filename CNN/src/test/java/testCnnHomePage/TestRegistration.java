package testCnnHomePage;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import registration.RegistrationPage;

public class TestRegistration extends WebAPI {
    RegistrationPage registrationPage;
    @BeforeMethod
    public void getInIt(){
        registrationPage= PageFactory.initElements(driver, RegistrationPage.class);
    }
    @Test
    public void testCnnSignUp() throws InterruptedException {
        registrationPage.cnnSignUp();
    }
    @Test
    public void testCnnZipCodeButton(){
        registrationPage.cnnZipCodeBox();
    }
    @Test
    public void testCnnAccountLogIn() throws InterruptedException {
        registrationPage.cnnAccountLogIn();
        registrationPage.validateCnnAccountLogIn();
    }

}
