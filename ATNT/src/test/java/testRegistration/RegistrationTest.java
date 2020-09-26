package testRegistration;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import registration.Registration;
import reporting.TestLogger;

public class RegistrationTest extends WebAPI {
    Registration registration;

    @BeforeMethod
    public void getInit() {
        registration = PageFactory.initElements(driver, Registration.class);
    }

    @Test
    public void testSignIn() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        registration.signIn();
        registration.validateSignIn();
    }
    @Test
    public void testNavigateToSignInPage() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        registration.navigateToSignInPage();
    }


}
