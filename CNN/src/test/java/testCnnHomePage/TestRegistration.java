package testCnnHomePage;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import registration.RegistrationPage;
import reporting.TestLogger;

public class TestRegistration extends WebAPI {
    RegistrationPage registrationPage;
    @BeforeMethod
    public void getInIt(){
        registrationPage= PageFactory.initElements(driver, RegistrationPage.class);
    }
    @Test
    public void testCnnSignUp() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        registrationPage.cnnSignUp();
    }
    @Test
    public void testCnnZipCodeButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        registrationPage.cnnZipCodeBox();
    }
    @Test
    public void testCnnAccountLogIn() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        registrationPage.cnnAccountLogIn();
        registrationPage.validateCnnAccountLogIn();
    }
}
